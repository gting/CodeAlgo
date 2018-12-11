package ty.pas.analy;

import com.sagittarius.bean.result.*;
/*import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import edu.thss.platform.pas.userfunc.UserFunction;*/
import jnr.ffi.Struct;
import tykj.userfn.UserFunctionMultipleSql;


import javax.crypto.MacSpi;
import java.util.*;
import java.util.stream.Collectors;

public class EveryMinuter extends UserFunctionMultipleSql {
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
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_Info_xiaosong500")).get(deviceID);
        List<DoublePoint> KM_0002_02_36 = doubleInput.get(deviceID).get("KM_0002_02_36"); //增压器压力_仪表
        List<DoublePoint> KM_0002_02_37 = doubleInput.get(deviceID).get("KM_0002_02_37"); //增压器温度_仪表
        List<DoublePoint> KM_0002_02_38 = doubleInput.get(deviceID).get("KM_0002_02_38"); //气压_仪表
        List<DoublePoint> KM_0002_02_39 = doubleInput.get(deviceID).get("KM_0002_02_39"); //共轨燃油压力_仪表
        List<DoublePoint> KM_0002_02_05 = doubleInput.get(deviceID).get("KM_0002_02_05"); //扭矩百分比(透传-小松)
        List<DoublePoint> KM_0002_02_04 = doubleInput.get(deviceID).get("KM_0002_02_04"); //转速(透传-小松)
        List<DoublePoint> KM_0002_02_26 = doubleInput.get(deviceID).get("KM_0002_02_26"); //燃油控制旋钮开度_仪表
        List<StringPoint> KM_0002_02_16 = stringInput.get(deviceID).get("KM_0002_02_16"); //ECM序列号_仪表
        List<DoublePoint> KM_0002_02_01 = doubleInput.get(deviceID).get("KM_0002_02_01"); //水温
        List<StringPoint> KM_0002_02_20 = stringInput.get(deviceID).get("KM_0002_02_20"); //燃油内水分检出传感器状态_仪表
        List<DoublePoint> KM_0002_02_23 = doubleInput.get(deviceID).get("KM_0002_02_23"); //共轨压力指令_仪表
        List<DoublePoint> KM_0002_02_02 = doubleInput.get(deviceID).get("KM_0002_02_02"); //机油压力
        List<DoublePoint> TC_0002_02_82 = doubleInput.get(deviceID).get("TC_0002_02_82");//下排气
        List<DoublePoint> TC_0002_02_83 = doubleInput.get(deviceID).get("TC_0002_02_83");//先导传感器
        List<DoublePoint> KM_0002_02_43 = doubleInput.get(deviceID).get("KM_0002_02_43");//Viscosity
        List<DoublePoint> KM_0002_02_44 = doubleInput.get(deviceID).get("KM_0002_02_44");//Density
        List<DoublePoint> KM_0002_02_45 = doubleInput.get(deviceID).get("KM_0002_02_45");//Dielectric Constant
        List<DoublePoint> KM_0002_02_46 = doubleInput.get(deviceID).get("KM_0002_02_46");//Average Temperature
        List<StringPoint> KM_0002_02_47 = stringInput.get(deviceID).get("KM_0002_02_47");//Diag
        List<StringPoint> KM_0002_02_52 = stringInput.get(deviceID).get("KM_0002_02_52");//ZigBee源码
        List<StringPoint> KM_0002_02_53 = stringInput.get(deviceID).get("KM_0002_02_53");//ZigBee源码
        List<StringPoint> KM_0002_02_54 = stringInput.get(deviceID).get("KM_0002_02_54");//ZigBee源码


        List<HashMap<String, Object>> list = new ArrayList<>();
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        if (KM_0002_02_01 != null) {
            alldata.addAll(KM_0002_02_01);
        }
        if (KM_0002_02_02 != null) {
            alldata.addAll(KM_0002_02_02);
        }
        if (KM_0002_02_20 != null) {
            alldata.addAll(KM_0002_02_20);
        }
        if (KM_0002_02_23 != null) {
            alldata.addAll(KM_0002_02_23);
        }
        if (KM_0002_02_36 != null) {
            alldata.addAll(KM_0002_02_36);
        }
        if (KM_0002_02_37 != null) {
            alldata.addAll(KM_0002_02_37);
        }
        if (KM_0002_02_38 != null) {
            alldata.addAll(KM_0002_02_38);
        }
        if (KM_0002_02_39 != null) {
            alldata.addAll(KM_0002_02_39);
        }
        if (KM_0002_02_04 != null) {
            alldata.addAll(KM_0002_02_04);
        }
        if (KM_0002_02_05 != null) {
            alldata.addAll(KM_0002_02_05);
        }
        if (KM_0002_02_16 != null) {
            alldata.addAll(KM_0002_02_16);
        }
        if (KM_0002_02_26 != null) {
            alldata.addAll(KM_0002_02_26);
        }
        if (TC_0002_02_82 != null)
            alldata.addAll(TC_0002_02_82);
        if (TC_0002_02_83 != null)
            alldata.addAll(TC_0002_02_83);
        if (KM_0002_02_43 != null)
            alldata.addAll(KM_0002_02_43);
        if (KM_0002_02_44 != null)
            alldata.addAll(KM_0002_02_44);
        if (KM_0002_02_45 != null)
            alldata.addAll(KM_0002_02_45);
        if (KM_0002_02_46 != null)
            alldata.addAll(KM_0002_02_46);
        if (KM_0002_02_47 != null)
            alldata.addAll(KM_0002_02_47);
        if (KM_0002_02_52 != null)
            alldata.addAll(KM_0002_02_52);
        if (KM_0002_02_53 != null)
            alldata.addAll(KM_0002_02_53);
        if (KM_0002_02_54 != null)
            alldata.addAll(KM_0002_02_54);

        if (alldata.size() == 0)
            return;

        //按时间对齐
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        List<Long> timeLong2 = new ArrayList<>();

        for (Long time : resultMap.keySet()) {
            timeLong2.add(time);
//            System.out.println(time);
        }

        Collections.sort(timeLong2);
        Map<Long, List<AbstractPoint>> resultMap2 = new LinkedHashMap<>();
        for (int i = 0; i < timeLong2.size(); i++) {
//            System.out.println(timeLong2.get(i));
            resultMap2.put(timeLong2.get(i), resultMap.get(timeLong2.get(i)));

        }
        Map<Long, List<Map<String, Object>>> newresultMap = new HashMap<>();//存放分组后的结果

        for (Long time : resultMap2.keySet()) {
            Map dataItem;
            List<Map<String, Object>> KM01list = new ArrayList<Map<String, Object>>();
            List<AbstractPoint> list1 = new ArrayList<>();
            list1 = resultMap.get(time);
            for (AbstractPoint ap : list1) {
//                System.out.println(ap.getMetric());
                Map<String, Object> map = new HashMap<>();
                if (ap.getMetric().equals("KM_0002_02_16") || ap.getMetric().equals("KM_0002_02_20") || ap.getMetric().equals("KM_0002_02_52") || ap.getMetric().equals("KM_0002_02_47") || ap.getMetric().equals("KM_0002_02_53") || ap.getMetric().equals("KM_0002_02_54")) {
                    StringPoint ap2 = (StringPoint) ap;
                    map.put(ap.getMetric(), ap2.getValue());
                } else {
                    DoublePoint ap2 = (DoublePoint) ap;
                    map.put(ap.getMetric(), ap2.getValue());
                }

//                System.out.println(map);
                KM01list.add(map);
//                System.out.println(KM01list);
            }

            //分组
            for (int i = 0; i < KM01list.size(); i++) {
                dataItem = KM01list.get(i);
                if (newresultMap.containsKey(time / 60000) && newresultMap != null) {
                    newresultMap.get(time / 60000).add(dataItem);
                } else {
                    List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
                    list2.add(dataItem);
                    newresultMap.put(time / 60000, list2);
                }
            }
        }
        LongToDate longToDate = new LongToDate();
        for (Long time : newresultMap.keySet()) {
            HashMap<String, Object> result = new HashMap<>();
            List<Float> KM_0002_02_36list = new ArrayList<>();
            List<Float> KM_0002_02_37list = new ArrayList<>();
            List<Float> KM_0002_02_38list = new ArrayList<>();
            List<Float> KM_0002_02_39list = new ArrayList<>();
            List<Float> KM_0002_02_04list = new ArrayList<>();
            List<Float> KM_0002_02_05list = new ArrayList<>();
            List<Float> KM_0002_02_26list = new ArrayList<>();
            List<String> KM_0002_02_16list = new ArrayList<>();
            List<Float> KM_0002_02_01list = new ArrayList<>();
            List<Float> KM_0002_02_23list = new ArrayList<>();
            List<Float> KM_0002_02_02list = new ArrayList<>();
            List<String> KM_0002_02_20list = new ArrayList<>();
            List<String> KM_0002_02_52list = new ArrayList<>();
            List<String> KM_0002_02_53list = new ArrayList<>();
            List<String> KM_0002_02_54list = new ArrayList<>();
            List<String> KM_0002_02_47list = new ArrayList<>();
            List<Float> KM_0002_02_46list = new ArrayList<>();
            List<Float> KM_0002_02_45list = new ArrayList<>();
            List<Float> KM_0002_02_44list = new ArrayList<>();
            List<Float> KM_0002_02_43list = new ArrayList<>();
            List<Float> TC_0002_02_83list = new ArrayList<>();
            List<Float> TC_0002_02_82list = new ArrayList<>();
            for (int i = 0; i < newresultMap.get(time).size(); i++) {
                Map<String, Object> smap = newresultMap.get(time).get(i);
                for (String sernor : smap.keySet()) {
                    if (sernor.equals("KM_0002_02_36")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 10)
                            KM_0002_02_36list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_37")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 500)
                            KM_0002_02_37list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_38")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 10)
                            KM_0002_02_38list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_39")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 2000)
                            KM_0002_02_39list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_04")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 5000)
                            KM_0002_02_04list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_05")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 300)
                            KM_0002_02_05list.add(Float.valueOf(smap.get(sernor).toString()));
                    }

                    if (sernor.equals("KM_0002_02_26")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 200)
                            KM_0002_02_26list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_01")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 200)
                            KM_0002_02_01list.add(Float.valueOf(smap.get(sernor).toString()));
                    }

                    if (sernor.equals("KM_0002_02_23")) {
                        if (Double.valueOf(smap.get(sernor).toString()) < 2000)
                            KM_0002_02_23list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_02")) {
                        if (Double.valueOf(smap.get(sernor).toString()) == 0 || Double.valueOf(smap.get(sernor).toString()) == 1)
                            KM_0002_02_02list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_16")) {
                        if (!smap.get(sernor).toString().equals("FFFFFFFF"))
                            KM_0002_02_16list.add(smap.get(sernor).toString());
                    }
                    if (sernor.equals("KM_0002_02_20")) {
                        if (smap.get(sernor).toString().equals("00") || smap.get(sernor).toString().equals("11"))
                            KM_0002_02_20list.add(smap.get(sernor).toString());
                    }
                    if (sernor.equals("TC_0002_02_82")) {
                        TC_0002_02_82list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("TC_0002_02_83")) {
                        TC_0002_02_83list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_43")) {
                        KM_0002_02_43list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_44")) {
                        KM_0002_02_44list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_45")) {
                        KM_0002_02_45list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_46")) {
                        KM_0002_02_46list.add(Float.valueOf(smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_47")) {
                        KM_0002_02_47list.add((smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_52")) {
                        KM_0002_02_52list.add((smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_53")) {
                        KM_0002_02_53list.add((smap.get(sernor).toString()));
                    }
                    if (sernor.equals("KM_0002_02_54")) {
                        KM_0002_02_54list.add((smap.get(sernor).toString()));
                    }
                   /* Collections.sort(KM_0002_02_36list);
                    Collections.sort(KM_0002_02_37list);
                    Collections.sort(KM_0002_02_38list);
                    Collections.sort(KM_0002_02_39list);
                    Collections.sort(KM_0002_02_04list);
                    Collections.sort(KM_0002_02_05list);
                    Collections.sort(KM_0002_02_26list);
                    Collections.sort(KM_0002_02_01list);
                    Collections.sort(KM_0002_02_23list);*/

                }
            }
            AvgNum avgNum = new AvgNum();
            String date = "";
            date = longToDate.timeStamp2Date(String.valueOf(time * 60000), "yyyy-MM-dd HH:mm:00");
            result.put("Vcl_VinCode", sqllist.get(0).get("Vcl_VinCode"));
            result.put("MsgTime", date);
            if (KM_0002_02_01 != null) {
                if (KM_0002_02_01list.size() != 0) {
                    result.put("KM_0002_02_01Max", null);
                    result.put("KM_0002_02_01Min", null);
                    result.put("KM_0002_02_01AVG", Float.valueOf(KM_0002_02_01list.get(KM_0002_02_01list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_01Max", null);
                result.put("KM_0002_02_01Min", null);
                result.put("KM_0002_02_01AVG", null);
            }
            if (KM_0002_02_36 != null) {
                if (KM_0002_02_36list.size() != 0) {
                    result.put("KM_0002_02_36Max", null);
                    result.put("KM_0002_02_36Min", null);
                    result.put("KM_0002_02_36AVG", Float.valueOf(KM_0002_02_36list.get(KM_0002_02_36list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_36Max", null);
                result.put("KM_0002_02_36Min", null);
                result.put("KM_0002_02_36AVG", null);
            }
            if (KM_0002_02_37 != null) {

                if (KM_0002_02_37list.size() != 0) {
                    result.put("KM_0002_02_37Max", null);
                    result.put("KM_0002_02_37Min", null);
                    result.put("KM_0002_02_37AVG", Float.valueOf(KM_0002_02_37list.get(KM_0002_02_37list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_37Max", null);
                result.put("KM_0002_02_37Min", null);
                result.put("KM_0002_02_37AVG", null);
            }

            if (KM_0002_02_38 != null) {
                if (KM_0002_02_38list.size() != 0) {
                    result.put("KM_0002_02_38Max", null);
                    result.put("KM_0002_02_38Min", null);
                    result.put("KM_0002_02_38AVG", Float.valueOf(KM_0002_02_38list.get(KM_0002_02_38list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_38Max", null);
                result.put("KM_0002_02_38Min", null);
                result.put("KM_0002_02_38AVG", null);
            }

            if (KM_0002_02_39 != null) {
                if (KM_0002_02_39list.size() != 0) {
                    result.put("KM_0002_02_39Max", null);
                    result.put("KM_0002_02_39Min", null);
                    result.put("KM_0002_02_39AVG", Float.valueOf(KM_0002_02_39list.get(KM_0002_02_39list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_39Max", null);
                result.put("KM_0002_02_39Min", null);
                result.put("KM_0002_02_39AVG", null);
            }
            if (KM_0002_02_26 != null) {
                if (KM_0002_02_26list.size() != 0) {
                    result.put("KM_0002_02_26Max", null);
                    result.put("KM_0002_02_26Min", null);
                    result.put("KM_0002_02_26AVG", Float.valueOf(KM_0002_02_26list.get(KM_0002_02_26list.size() - 1)));
                }
            } else {
                result.put("KM_0002_02_26Max", null);
                result.put("KM_0002_02_26Min", null);
                result.put("KM_0002_02_26AVG", null);
            }
            if (KM_0002_02_04 != null) {
                if (KM_0002_02_04list.size() != 0) {
                    result.put("KM_0002_02_04Max", null);
                    result.put("KM_0002_02_04Min", null);
                    result.put("KM_0002_02_04AVG", Float.valueOf((KM_0002_02_04list.get(KM_0002_02_04list.size() - 1))));
                }
            } else {
                result.put("KM_0002_02_04Max", null);
                result.put("KM_0002_02_04Min", null);
                result.put("KM_0002_02_04AVG", null);
            }
            if (KM_0002_02_05 != null) {
                if (KM_0002_02_05list.size() != 0) {
                    result.put("KM_0002_02_05Max", null);
                    result.put("KM_0002_02_05Min", null);
                    result.put("KM_0002_02_05AVG", Float.valueOf((KM_0002_02_05list.get(KM_0002_02_05list.size() - 1).toString())));
                }
            } else {
                result.put("KM_0002_02_05Max", null);
                result.put("KM_0002_02_05Min", null);
                result.put("KM_0002_02_05AVG", null);
            }
            if (KM_0002_02_23 != null) {
                if (KM_0002_02_23list.size() != 0) {
                    result.put("KM_0002_02_23Max", null);
                    result.put("KM_0002_02_23Min", null);
                    result.put("KM_0002_02_23AVG", Float.valueOf((KM_0002_02_23list.get(KM_0002_02_23list.size() - 1)).toString()));
                }
            } else {
                result.put("KM_0002_02_23Max", null);
                result.put("KM_0002_02_23Min", null);
                result.put("KM_0002_02_23AVG", null);
            }
            if (KM_0002_02_16 != null) {
                if (KM_0002_02_16list.size() > 0)
                    result.put("KM_0002_02_16", (KM_0002_02_16list.get(KM_0002_02_16list.size() - 1)).toString());
            }

            if (KM_0002_02_20 != null) {
                if (KM_0002_02_20list.size() > 0)
                    result.put("KM_0002_02_20", (KM_0002_02_20list.get(KM_0002_02_20list.size() - 1)).toString());
            }
            if (KM_0002_02_02 != null) {
                if (KM_0002_02_02list.size() > 0)
                    result.put("KM_0002_02_02", (KM_0002_02_02list.get(KM_0002_02_02list.size() - 1)));
            }
            if (TC_0002_02_82 != null) {
                if (TC_0002_02_82list.size() > 0)
                    result.put("TC_0002_02_82", TC_0002_02_82list.get(TC_0002_02_82list.size() - 1));
            }
            if (TC_0002_02_83 != null) {
                if (TC_0002_02_83list.size() > 0)
                    result.put("TC_0002_02_83", TC_0002_02_83list.get(TC_0002_02_83list.size() - 1));
            }
            if (KM_0002_02_43 != null) {
                if (KM_0002_02_43list.size() > 0)
                    result.put("KM_0002_02_43", KM_0002_02_43list.get(KM_0002_02_43list.size() - 1));
            }
            if (KM_0002_02_44 != null) {
                if (KM_0002_02_44list.size() > 0)
                    result.put("KM_0002_02_44", KM_0002_02_44list.get(KM_0002_02_44list.size() - 1));
            }
            if (KM_0002_02_45 != null) {
                if (KM_0002_02_45list.size() > 0)
                    result.put("KM_0002_02_45", KM_0002_02_45list.get(KM_0002_02_45list.size() - 1));
            }
            if (KM_0002_02_46 != null) {
                if (KM_0002_02_46list.size() > 0)
                    result.put("KM_0002_02_46", KM_0002_02_46list.get(KM_0002_02_46list.size() - 1));
            }
            if (KM_0002_02_47 != null) {
                if (KM_0002_02_47list.size() > 0)
                    result.put("KM_0002_02_47", KM_0002_02_47list.get(KM_0002_02_47list.size() - 1));
            }
            if (KM_0002_02_52 != null) {
                if (KM_0002_02_52list.size() > 0) {
                    result.put("KM_0002_02_52", KM_0002_02_52list.get(KM_0002_02_52list.size() - 1));
//                    System.out.println(KM_0002_02_52list.get(KM_0002_02_52list.size() - 1));
                }
            }
            if (KM_0002_02_53 != null) {
                if (KM_0002_02_53list.size() > 0)
                    result.put("KM_0002_02_53", KM_0002_02_53list.get(KM_0002_02_53list.size() - 1));
            }
            if (KM_0002_02_54 != null) {
                if (KM_0002_02_54list.size() > 0)
                    result.put("KM_0002_02_54", KM_0002_02_54list.get(KM_0002_02_54list.size() - 1));
            }
            list.add(result);
        }
        outputSql.put("EveryMinuter_20180912", list);
//        System.out.println(outputSql);
    }
}
