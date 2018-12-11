package ty.pas.analy;

import com.google.common.collect.Lists;
import com.sagittarius.bean.result.*;
import tykj.userfn.UserFunction;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lifaliang on 2018/7/2.
 */
public class Countidling extends UserFunction{
    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
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
        List<DoublePoint> list = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<DoublePoint> listSpeed = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<StringPoint> listAction = stringInput.get(deviceID).get("KM_0002_02_12");
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_Info_xiaosong500")).get(deviceID);
        System.out.println(list.size()+"\t"+listSpeed.size()+"\t"+listAction.size());
        //数据时间间隔
        int timeTnterval=getTimeTnterval(list);
        String dataTime= df.format(new Date(startTime));
        System.out.println("数据统计日期="+dataTime);
        //怠速使用的燃油
        float sum=0;
        //怠速时间 毫秒和
        long sumTime=0;
        for(int i=0;i<list.size();i++){
            DoublePoint p=list.get(i);
            long thisTime=p.getPrimaryTime();
            double KM_0002_02_03=p.getValue();
            if(i==0){
                //第一条数据不参与计算
                continue;
            }
            //计算除了第一条数据,获取
            DoublePoint lastp=list.get(i-1);
            long lastTime=lastp.getPrimaryTime();
            int cha= Math.toIntExact(thisTime - lastTime);
            if(cha<=timeTnterval*2){
                //判断是否为怠速时段
                boolean flag=isIdling(lastTime,thisTime,listSpeed,listAction);
                if(flag){
                    sum+=KM_0002_02_03/3600000*cha;
                    sumTime+=cha;
                }
            }
        }
        HashMap<String,Object> result=new HashMap<>();
        result.put("Vcl_ID", sqllist.get(0).get("Vcl_VinCode"));
        result.put("Idlefuel",sum+"");
        result.put("Idletime",sumTime+"");
        outputSql.add(result);
    }
    private  Integer getTimeTnterval(List<DoublePoint> list){
        //region 获取时间间隔频率
        Map<Integer,Integer> mapCount=new HashMap<>();
        for(int i=0;i<list.size();i++){
            DoublePoint p=list.get(i);
            long thisTime=p.getPrimaryTime();
            if(i==0){
                continue;
            }
            DoublePoint lastp=list.get(i-1);
            long lastTime=lastp.getPrimaryTime();
            int cha= Math.toIntExact(thisTime - lastTime);
            if(mapCount.containsKey(cha)){
                mapCount.put(cha,mapCount.get(cha)+1);
            } else{
                mapCount.put(cha,1);
            }
        }
        System.out.println(mapCount);
        int result=getMaxKey(mapCount);
        return result;
        //endregion
    }
    public  Integer getMaxKey(Map<Integer, Integer> map) {
        //region 找最大value对应的key
        int maxV=0;
        int maxK=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value>maxV){
                maxV=value;
                maxK=key;
            }
        }
        return maxK;
        //endregion
    }
    public boolean isIdling(long sTime,long eTime,List<DoublePoint> listSpeed,List<StringPoint> listAction){
        long num1 = listSpeed.stream().filter(point -> point.getPrimaryTime() >= sTime && point.getPrimaryTime() <= eTime&&point.getValue()>0).count();
        //响应数据
        long num2 = listAction.stream().filter(point -> {
            try {
                return point.getPrimaryTime() >= sTime && point.getPrimaryTime() <= eTime && !"00000000".equals(point.getValue().substring(point.getValue().length() - 8, point.getValue().length()));
            } catch (Exception e) {
                return false;
            }
        }).count();
        if(num1>0&&num2==0){
            return true;
        }else{
            return false;
        }

    }
}
