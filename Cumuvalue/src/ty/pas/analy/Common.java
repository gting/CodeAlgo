package ty.pas.analy;

import com.google.common.collect.Lists;
import com.sagittarius.bean.result.DoublePoint;
import com.sagittarius.bean.result.StringPoint;

import java.util.*;
import java.util.stream.Collectors;

public class Common {
    public static Integer getTimeTnterval(List<Map> list){
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
    public static List<Map> getAlignByTime(Map<String, Map<String, List<DoublePoint>>> r7) {
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
    public  Integer getTimeTnterval2(List<DoublePoint> list){
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
    public boolean isIdling(long sTime, long eTime, List<DoublePoint> listSpeed, List<StringPoint> listAction){
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
