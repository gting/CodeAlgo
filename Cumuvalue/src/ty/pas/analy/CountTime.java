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
public class CountTime extends UserFunction{
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
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_Info_xiaosong500")).get(deviceID);
        List<Map> list=getAlignByTime(doubleInput);
        System.out.println(list.size());
        //数据时间间隔
        int timeTnterval=getTimeTnterval(list);
        String dataTime= df.format(new Date(startTime));
        System.out.println("数据统计日期="+dataTime);
        //统计  总发动机操作时间
        float sum=0;
        for(int i=0;i<list.size();i++){
            Map map=list.get(i);
            long thisTime=(long)map.get("time");
//            float KM_0002_02_04=(float)map.get("KM_0002_02_04");
            if(i==0){
                //第一条数据是否参与计算如果不参与注释掉即可
                sum=timeTnterval;
                continue;
            }
            //计算除了第一条数据,获取
            Map lastMap=list.get(i-1);
            long lastTime=(long)lastMap.get("time");
            int cha= Math.toIntExact(thisTime - lastTime);
            if(cha<=timeTnterval*2){
                sum=sum+cha;
            }
        }

        HashMap<String,Object> result=new HashMap<>();
        result.put("Vcl_ID", sqllist.get(0).get("Vcl_VinCode"));
        result.put("CountTime",sum+"");
        outputSql.add(result);
    }
    private static Integer getTimeTnterval(List<Map> list){
        //region 获取时间间隔频率
        Map<Integer,Integer> mapCount=new HashMap<>();
        for(int i=0;i<list.size();i++){
            Map map=list.get(i);
            long thisTime=(long)map.get("time");
            if(i==0){
                continue;
            }
            Map lastMap=list.get(i-1);
            long lastTime=(long)lastMap.get("time");
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
    public static Integer getMaxKey(Map<Integer, Integer> map) {
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
    private static List<Map> getAlignByTime(Map<String, Map<String, List<DoublePoint>>> r7) {
        //region 对齐代码
        List<Map> list = Lists.newArrayList();
        Set<String> deviceIdSet = r7.keySet();
        // 遍历外层 设备集合循环
        for (String deviceId : deviceIdSet) {
            List<Map> result = Lists.newArrayList();
            Map<String, List<DoublePoint>> sensorIdMap = r7.get(deviceId);
            Set<String> sensorIdSet = sensorIdMap.keySet();
            // 遍历中层 工况集合循环
            for (String sensorId : sensorIdSet) {
                List<DoublePoint> points = sensorIdMap.get(sensorId);
                // 遍历某一工况记录集（数组）
                for (DoublePoint point : points) {
                    // 将设备信息和传感器信息补充到运算集合中。
                    Map InitiMap = new HashMap();
                    InitiMap.put("vcl_id", deviceId);
                    InitiMap.put("value", point.getValue());
                    InitiMap.put("protocol", point.getMetric());
                    InitiMap.put("time", point.getPrimaryTime());
                    // 数据始化工作，为聚合做准备。
                    result.add(InitiMap);
                }
            }
            // 根据时间做聚合运算
            Map<Object, List<Map>> resultMap = result.stream()
                    .collect(Collectors.groupingBy(obj -> Arrays.asList(obj.get("time"))));// Arrays.asList(obj.get("vcl_id"),obj.get("time"))
            // System.out.println(" resultMap ===>" + resultMap.toString());
            // 遍历map->list结构，转换成list<Map>二维表结构方便界面展示。
            resultMap.forEach((k, l) -> {
                Map groupByMap = new HashMap();
                l.forEach(on -> {
                    groupByMap.put("vclid", on.get("vcl_id"));
                    groupByMap.put("time", on.get("time"));
                    groupByMap.put(on.get("protocol"), on.get("value"));
                });

                list.add(groupByMap);

            });

        }
        Collections.sort(list, new Comparator<Map>() {
            @Override
            public int compare(Map arg0, Map arg1) {
                // System.out.println("arg0 " + arg0.toString());
                // System.out.println("arg1 " + arg1.toString());
                long t1 = (long) arg0.get("time");
                long t2 = (long) arg1.get("time");
                if (t1 > t2) {
                    return 1;
                } else if (t1 < t2) {
                    return -1;
                } else {
                    return 0;
                }
                // return ( arg0.get("time")).compareTo(arg1.get("time"));
            }
        });

        return list;
        //endregion
    }
}
