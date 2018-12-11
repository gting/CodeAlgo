package ty.pas.analy;

import com.sagittarius.bean.result.*;
import tykj.userfn.UserFunction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count extends UserFunction {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:00:00");

    @Override
    public void runOne(List<String> deviceList,
                       Map<String, Map<String, List<Map<String, String>>>> sqlData,
                       Map<String, Map<String, List<FloatPoint>>> floatInput,
                       Map<String, Map<String, List<DoublePoint>>> doubleInput,
                       Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput,
                       Map<String, Map<String, List<LongPoint>>> longInput,
                       Map<String, Map<String, List<BooleanPoint>>> booleanInput,
                       Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        System.out.println(deviceID);
        //燃油数据
        List<DoublePoint> listIdle = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<DoublePoint> listSpeed = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<StringPoint> listAction = stringInput.get(deviceID).get("KM_0002_02_12");
//        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_Info_xiaosong500")).get(deviceID);
        System.out.println(listIdle.size() + "\t" + listSpeed.size() + "\t" + listAction.size());
        Common common = new Common();
        //数据时间间隔
        int timeTntervalIdle = common.getTimeTnterval2(listIdle);
        String dataTime = df.format(new Date(startTime));
        System.out.println("数据统计日期=" + dataTime);
        //怠速使用的燃油
        float sumIdle = 0;
        //怠速时间 毫秒和
        long sumTimeIdle = 0;
        for (int i = 0; i < listIdle.size(); i++) {
            DoublePoint p = listIdle.get(i);
            long thisTime = p.getPrimaryTime();
            double KM_0002_02_03 = p.getValue();
            if (i == 0) {
                //第一条数据不参与计算
                continue;
            }
            //计算除了第一条数据,获取
            DoublePoint lastp = listIdle.get(i - 1);
            long lastTime = lastp.getPrimaryTime();
            int cha = Math.toIntExact(thisTime - lastTime);
            if (cha <= timeTntervalIdle * 2) {
                //判断是否为怠速时段
                boolean flag = common.isIdling(lastTime, thisTime, listSpeed, listAction);
                if (flag) {
                    sumIdle += KM_0002_02_03 / 3600000 * cha;
                    sumTimeIdle += cha;
                }
            }
        }
        HashMap<String, Object> result = new HashMap<>();

        result.put("Idlefuel", sumIdle + "");
        result.put("Idletime", sumTimeIdle + "");

        List<Map> listOil = common.getAlignByTime(doubleInput);
        //数据时间间隔
        int timeTntervalOil = common.getTimeTnterval(listOil);

        //统计油耗累计和值
        double sumOil = 0;
        //统计  总发动机操作时间
        float sumTime = 0;
        //总发动机转数
        double sumTurn = 0;
        for (int i = 0; i < listOil.size(); i++) {
            Map map = listOil.get(i);
            long thisTime = (long) map.get("time");
            if (map.containsKey("KM_0002_02_03")) {
                double KM_0002_02_03 = (double) map.get("KM_0002_02_03");
                if (i == 0) {
                    //第一条数据是否参与计算如果不参与注释掉即可
                    //值除以一小时毫秒数再乘以持续的毫秒时间
                    sumOil = KM_0002_02_03 / 3600000 * timeTntervalOil;
                    continue;
                }
                //计算除了第一条数据,获取
                Map lastMap = listOil.get(i - 1);
                long lastTime = (long) lastMap.get("time");
                int cha = Math.toIntExact(thisTime - lastTime);
                if (cha <= timeTntervalOil * 2) {
                    sumOil = sumOil + KM_0002_02_03 / 3600000 * cha;
                }
            }

            if (map.containsKey("KM_0002_02_04")) {
                double KM_0002_02_04 = (double) map.get("KM_0002_02_04");
                if (i == 0) {
                    //第一条数据是否参与计算如果不参与注释掉即可
                    sumTurn = KM_0002_02_04 / 60000 * timeTntervalOil;
                    sumTime = timeTntervalOil;
                    continue;
                }
                //计算除了第一条数据,获取
                Map lastMap2 = listOil.get(i - 1);
                long lastTime2 = (long) lastMap2.get("time");
                int cha2 = Math.toIntExact(thisTime - lastTime2);
                if (cha2 <= timeTntervalOil * 2) {
                    sumTurn = sumTurn + KM_0002_02_04 / 60000 * cha2;
                }
                int cha= Math.toIntExact(thisTime - lastTime2);
                if(cha<=timeTntervalOil*2){
                    sumTime=sumTime+cha;
                }
            }

        }
        result.put("CountOil", sumOil + "");
        result.put("CountTime", sumTime + "");

        //换成整数
        int sumInt = 0;
        sumInt = (int) Math.round(sumTurn);
        result.put("CountTurn", sumInt + "");
        outputSql.add(result);
    }
}
