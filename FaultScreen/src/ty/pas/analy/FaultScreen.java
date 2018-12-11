package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import java.util.*;

public class FaultScreen extends UserFunction {
    @Override
    public void runOne(List<String> deviceList,
                       Map<String, Map<String, List<Map<String, String>>>> sqlData,
                       Map<String, Map<String, List<FloatPoint>>> floatInput,
                       Map<String, Map<String, List<DoublePoint>>> doubleInput,
                       Map<String, Map<String, List<StringPoint>>> stringInput,
                       Map<String, Map<String, List<IntPoint>>> intInput,
                       Map<String, Map<String, List<LongPoint>>> longInput,
                       Map<String, Map<String, List<BooleanPoint>>> booleanInput,
                       Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime,
                       long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("vm_KOMTRAX_CAUTION_LOG")).get(deviceID);

//        System.out.println(sqllist);
        /*if (sqllist.size()!=0)
        {
            sort.sort(sqllist);
        }*/
        List<Map<String, String>> newsqllist = new ArrayList<>();
        Map<String, String> smap = new HashMap<>();
        for (int i = 0; i < sqllist.size(); i++) {
            smap = sqllist.get(i);
            String T_TIME = smap.get("T_TIME");
            if (T_TIME != null)
                newsqllist.add(smap);
        }
        if (newsqllist.size() != 0) {
            sort.sort(newsqllist);
        }
        double MACHINE_ID = 0;
        String SERIAL = "";
        String DESCRIPTION = "";
        Map dataItem;
        Map<String, List<Map>> resultMap = new HashMap<String, List<Map>>(); //最终存放的结果(按故障类型分组)

        for (int i = 0; i < newsqllist.size(); i++) {
            dataItem = newsqllist.get(i);
            if (resultMap.containsKey(dataItem.get("DESCRIPTION"))) {
                resultMap.get(dataItem.get("DESCRIPTION")).add(dataItem);
            } else {
                List<Map> list = new ArrayList<Map>();
                list.add(dataItem);
                resultMap.put(String.valueOf(dataItem.get("DESCRIPTION")), list);
            }

        }
        List<Map> timelist = new ArrayList<Map>();

        for (String string : resultMap.keySet()) {
            HashMap<String, Object> result = new HashMap<>();
            Map<String, List<Map>> resultMap2 = new HashMap<String, List<Map>>(); //最终存放的结果(按时间分组)
            for (int i = 0; i < resultMap.get(string).size(); i++) {
                dataItem = resultMap.get(string).get(i);
                if (resultMap2.containsKey(dataItem.get("LOCAL_DATE"))) {
                    resultMap2.get(dataItem.get("LOCAL_DATE")).add(dataItem);
                } else {
                    List<Map> list = new ArrayList<Map>();
                    list.add(dataItem);
                    resultMap2.put(String.valueOf(dataItem.get("LOCAL_DATE")), list);
                }

            }
            System.out.println("故障分组:"+resultMap2);
            for (String description : resultMap2.keySet()) {
//            System.out.println(description);
                Map<String, String> rmap = resultMap2.get(description).get(0);
                for (String s : rmap.keySet()) {
                    if (s.equals("MACHINE_ID"))
                        MACHINE_ID = Double.valueOf(rmap.get(s));
                    if (s.equals("SERIAL"))
                        SERIAL = rmap.get(s);
                    if (s.equals("DESCRIPTION"))
                        DESCRIPTION = rmap.get(s);
                }
                System.out.println("key:" + description);
                System.out.println("value:" + resultMap2.get(description));

                //该故障一天只有一条
                if (resultMap2.get(description).size() == 1) {
                    result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                    result.put("SERIAL", SERIAL);
                    for (int i = 0; i < resultMap2.get(description).size(); i++) {
                        Map<String, String> map = resultMap2.get(description).get(i);
                        for (String obj : map.keySet()) {
                            if (obj.equals("DESCRIPTION"))
                                result.put("DESCRIPTION", map.get(obj));
                            if (obj.equals("MAP_INFO_H")) {
                                TimeLong timeLong = new TimeLong();
                                result.put("MAP_INFO_H", map.get(obj));
                                result.put("TimeLong", timeLong.TimeLong(map.get(obj)));
                            }
                            if (obj.equals("LOCAL_DATE"))
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(map.get(obj)));
                            if (obj.equals("T_TIME")) {
                                result.put("StartTime", java.sql.Timestamp.valueOf(map.get(obj)));
                                result.put("EndTime", java.sql.Timestamp.valueOf(map.get(obj)));
                            }

                        }
                    }
                    result.put("Type", 0);
                    outputSql.add(result);
//                System.out.println(outputSql);
                    result = new HashMap<>();
                }
                List<String> strList = new ArrayList<>();
                List<String> timeList = new ArrayList<>();
                //一个故障返回多条
                if (resultMap2.get(description).size() > 0) {
                    //获取该故障下的MAP_INFO_H
                    for (int i = 0; i < resultMap2.get(description).size(); i++) {
                        Map<String, String> map = resultMap2.get(description).get(i);

                        for (String str : map.keySet()) {
                            if (str.equals("MAP_INFO_H")) {
                                strList.add(map.get(str));
                            }
                            if (str.equals("T_TIME")) {
                                timeList.add(map.get(str));
                            }
                        }
                    }
                    //list去重
                    Set set = new HashSet();
                    List<String> newList = new ArrayList();
                    for (String cd : strList) {
                        if (set.add(cd)) {
                            newList.add(cd);
                        }
                    }
                    System.out.println("strList:" + strList);
                    System.out.println("NewList:" + newList);
                    System.out.println("TimingList:" + timeList);
                    if (newList.size() == 1) {
                        result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                        result.put("SERIAL", SERIAL);
                        result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                        result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(0)));
                        result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(timeList.size() - 1)));
                        result.put("MAP_INFO_H", newList.get(0));
                        TimeLong timeLong = new TimeLong();
                        result.put("TimeLong", timeLong.TimeLong(newList.get(0).toString()));
                        result.put("DESCRIPTION", DESCRIPTION);
                        result.put("Type", 2);
                        outputSql.add(result);
//                    System.out.println(outputSql);
                        result = new HashMap<>();
                    } else if (newList.size() > 0) {

                        Increasing increasing = new Increasing();
                        //连续递增,没有重复
                        if (increasing.xiabiao(newList) == 1) {
                            TimeLong timeLong = new TimeLong();
                            result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                            result.put("SERIAL", SERIAL);
                            result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                            result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(0)));
                            result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(timeList.size() - 1)));
                            result.put("MAP_INFO_H", newList.get(newList.size() - 1));
                            result.put("TimeLong", timeLong.TimeLong(newList.get(newList.size() - 1).toString()));
                            result.put("DESCRIPTION", DESCRIPTION);
                            result.put("Type", 1);
                            outputSql.add(result);
//                        System.out.println(outputSql);
                            result = new HashMap<>();
                        }
                        //没有重复，只有间隔
                        if (increasing.xiabiao(newList) == 3 && strList.size() == newList.size()) {

                            for (int i = 0; i < newList.size(); i++) {
                                TimeLong timeLong = new TimeLong();
                                CompareList compareList = new CompareList();

                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(i)));
                                result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(i)));
                                result.put("MAP_INFO_H", newList.get(i));
                                result.put("DESCRIPTION", DESCRIPTION);
                                if (i == 0)
                                    result.put("TimeLong", timeLong.TimeLong(newList.get(0).toString()));
                                else
                                {
                                    String s = compareList.compareList(newList.get(i - 1), newList.get(i));
                                    result.put("TimeLong", timeLong.TimeLong(s));
                                }

                                result.put("Type", 3);
                                outputSql.add(result);
                                result = new HashMap<>();
                            }

                        }
                        //有重复和间隔,去重后只有间隔
                        if (increasing.xiabiao(newList) == 3 && strList.size() > newList.size()) {
                            Remove remove = new Remove();

                            for (int i = 0; i < newList.size(); i++) {
                                TimeLong timeLong = new TimeLong();
                                CompareList compareList = new CompareList();

                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(remove.RemoveFirst(newList, strList).get(i))));
                                result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(remove.RemoveEnd(newList, strList).get(i))));
                                result.put("MAP_INFO_H", newList.get(i));
                                result.put("DESCRIPTION", DESCRIPTION);
                                if (i == 0)
                                    result.put("TimeLong", timeLong.TimeLong(newList.get(0).toString()));
                                else
                                {
                                    String s = compareList.compareList(newList.get(i - 1), newList.get(i));
                                    result.put("TimeLong", timeLong.TimeLong(s));
                                }

                                result.put("Type", 41);
                                outputSql.add(result);
                                result = new HashMap<>();
                            }
                        }
                        //存在连续和间隔两种情况（不考虑去不去重）
                        if (increasing.xiabiao(newList) == 4) {
                            Remove remove = new Remove();
                            TimeLong timeLong = new TimeLong();
                            ConInterval conInterval = new ConInterval();
                            List<Integer> newConInterval = new ArrayList<>();
                            newConInterval = conInterval.Continue(newList);
                            List<Integer> newInterval = new ArrayList<>();
                            Interval interval = new Interval();
                            newInterval = interval.Interval(newList);

                            //出现第一个间隔点之前为连续
                            result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                            result.put("SERIAL", SERIAL);
                            result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                            result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(0)));
                            result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(newConInterval.get(0) - 1)));
                            result.put("MAP_INFO_H", newList.get(newConInterval.get(0) - 1));
                            result.put("TimeLong", timeLong.TimeLong(newList.get(newConInterval.get(0) - 1).toString()));
                            result.put("DESCRIPTION", DESCRIPTION);
                            result.put("Type", 42);
                            outputSql.add(result);
//                        System.out.println(outputSql);
                            result = new HashMap<>();
                            //从第一个断点到下一个断点之间为连续
                            for (int i = 1; i <= newConInterval.size() - 1; i++) {
                                int n = newConInterval.get(i) - newConInterval.get(i - 1) - 1 + newConInterval.get(i - 1);
                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(newConInterval.get(i - 1))));
                                result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(n)));
                                result.put("MAP_INFO_H", newList.get(n));
                                result.put("TimeLong", timeLong.TimeLong(newList.get(n).toString()) - timeLong.TimeLong(newList.get(newConInterval.get(i - 1)).toString()));
                                result.put("DESCRIPTION", DESCRIPTION);
                                result.put("Type", 42);
                                outputSql.add(result);
//                            System.out.println(outputSql);
                                result = new HashMap<>();
                            }
                            //判断最后一个断点
                            if (newConInterval.get(newConInterval.size() - 1) < newList.size()) {
                                //最后一个断点到最后为连续
                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(newConInterval.get(newConInterval.size() - 1))));
                                result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(timeList.size() - 1)));
                                result.put("MAP_INFO_H", newList.get(newList.size() - 1));
                                result.put("TimeLong", timeLong.TimeLong(newList.get(newList.size() - 1).toString()) - timeLong.TimeLong(newList.get(newConInterval.get(newConInterval.size() - 1)).toString()));
                                result.put("DESCRIPTION", DESCRIPTION);
                                result.put("Type", 42);
                                outputSql.add(result);
//                            System.out.println(outputSql);
                                result = new HashMap<>();
                            }
                            //输出断点
                            for (int i1 = 0; i1 < newConInterval.size(); i1++) {
                                CompareList compareList = new CompareList();
                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", timeList.get(newConInterval.get(i1)));
                                result.put("EndTime", timeList.get(newConInterval.get(i1)));
                                result.put("MAP_INFO_H", newList.get(newConInterval.get(i1)));
                                if (i1 == 0)
                                    result.put("TimeLong", timeLong.TimeLong(newList.get(0).toString()));
                                else
                                {
                                    String s1 = compareList.compareList(newList.get(newConInterval.get(i1)-1), newList.get(newConInterval.get(i1)));
                                    result.put("TimeLong", timeLong.TimeLong(s1));
                                }
                                result.put("DESCRIPTION", DESCRIPTION);
                                result.put("Type", 42);
                                outputSql.add(result);
//                            System.out.println(outputSql);
                                result = new HashMap<>();
                            }
                        }
                        if (increasing.xiabiao(newList) == 5) {
                            Remove remove = new Remove();

                            for (int i = 0; i < newList.size(); i++) {
                                TimeLong timeLong = new TimeLong();
                                result.put("MACHINE_ID", BigDecimal.valueOf(MACHINE_ID));
                                result.put("SERIAL", SERIAL);
                                result.put("LOCAL_DATE", java.sql.Timestamp.valueOf(description));
                                result.put("StartTime", java.sql.Timestamp.valueOf(timeList.get(remove.RemoveFirst(newList, strList).get(i))));
                                result.put("EndTime", java.sql.Timestamp.valueOf(timeList.get(remove.RemoveEnd(newList, strList).get(i))));
                                result.put("MAP_INFO_H", newList.get(i));
                                result.put("DESCRIPTION", DESCRIPTION);
//                            result.put("TimeLong",timeLong.TimeLong(newList.get(i).toString())-timeLong.TimeLong(newList.get(i-1).toString()));
                                result.put("Type", 5);
                                outputSql.add(result);
                                result = new HashMap<>();
                            }
                        }
                    }

                }
            }

        }


//        outputSql.add(result);
    }


}
