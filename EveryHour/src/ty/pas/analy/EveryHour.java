package ty.pas.analy;

import com.sagittarius.bean.result.*;
import tykj.userfn.UserFunctionMultipleSql;

//import tykj.userfn.UserFunction;


import java.util.*;
import java.util.stream.Collectors;

public class EveryHour extends UserFunctionMultipleSql {
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
        if (alldata.size() == 0)
            return;
        HashMap<String, Object> result = new HashMap<>();

        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        List<Long> timeLong2 = new ArrayList<>();

        for (Long time : resultMap.keySet()) {
            timeLong2.add(time);
//            System.out.println(time);
        }
        LongToDate longToDate = new LongToDate();
        String date = "";
        date = longToDate.timeStamp2Date(String.valueOf(timeLong2.get(0)), "yyyy-MM-dd HH:mm:00");
        List<Double> KM_0002_02_36list = new ArrayList<>();
        List<Double> KM_0002_02_37list = new ArrayList<>();
        List<Double> KM_0002_02_38list = new ArrayList<>();
        List<Double> KM_0002_02_39list = new ArrayList<>();
        List<Double> KM_0002_02_04list = new ArrayList<>();
        List<Double> KM_0002_02_05list = new ArrayList<>();
        List<Double> KM_0002_02_26list = new ArrayList<>();
        List<String> KM_0002_02_16list = new ArrayList<>();
        List<Double> KM_0002_02_01list = new ArrayList<>();
        List<Double> KM_0002_02_23list = new ArrayList<>();
        List<Double> KM_0002_02_02list = new ArrayList<>();
        List<String> KM_0002_02_20list = new ArrayList<>();

        //水温
        if (KM_0002_02_01 != null) {
            for (DoublePoint one : KM_0002_02_01) {
                if (one.getValue() < 200)
                    KM_0002_02_01list.add(Double.valueOf(one.getValue()));
            }
        }
        //机油压力
        if (KM_0002_02_02 != null) {
            for (DoublePoint one : KM_0002_02_02) {
                if (one.getValue() == 0 || one.getValue() == 1)
                    KM_0002_02_02list.add(Double.valueOf(one.getValue()));
            }
        }

        //燃油内水分检出传感器状态_仪表
        if (KM_0002_02_20 != null) {
            for (StringPoint one : KM_0002_02_20) {
                if (one.getValue().equals("00") || one.getValue().equals("11"))
                    KM_0002_02_20list.add(one.getValue());
            }
        }
        //增压器压力_仪表
        if (KM_0002_02_36 != null) {
            for (DoublePoint one : KM_0002_02_36) {
                if (one.getValue() < 10)
                    KM_0002_02_36list.add(Double.valueOf(one.getValue()));
            }
        }
        //增压器温度_仪表
        if (KM_0002_02_37 != null) {
            for (DoublePoint one : KM_0002_02_37) {
                if (one.getValue() < 500)
                    KM_0002_02_37list.add(Double.valueOf(one.getValue()));
            }
        }
        //气压_仪表
        if (KM_0002_02_38 != null) {
            for (DoublePoint one : KM_0002_02_38) {
                if (one.getValue() < 10)
                    KM_0002_02_38list.add(Double.valueOf(one.getValue()));
            }
        }
        //共轨燃油压力_仪表
        if (KM_0002_02_39 != null) {
            for (DoublePoint one : KM_0002_02_39) {
                if (one.getValue() < 2000)
                    KM_0002_02_39list.add(Double.valueOf(one.getValue()));
            }
        }
        //转速(透传-小松)
        if (KM_0002_02_04 != null) {
            for (DoublePoint one : KM_0002_02_04) {
                if (one.getValue() < 5000)
                    KM_0002_02_04list.add(Double.valueOf(one.getValue()));
            }
        }
        //扭矩百分比(透传-小松)
        if (KM_0002_02_05 != null) {
            for (DoublePoint one : KM_0002_02_05) {
                if (one.getValue() < 300)
                    KM_0002_02_05list.add(Double.valueOf(one.getValue()));
            }
        }
        //燃油控制旋钮开度_仪表
        if (KM_0002_02_26 != null) {
            for (DoublePoint one : KM_0002_02_26) {
                if (one.getValue() < 200)
                    KM_0002_02_26list.add(Double.valueOf(one.getValue()));
            }
        }
        //共轨压力指令_仪表
        if (KM_0002_02_23 != null) {
            for (DoublePoint one : KM_0002_02_23) {
                if (one.getValue() < 2000)
                    KM_0002_02_23list.add(Double.valueOf(one.getValue()));
            }
        }
        //ECM序列号_仪表
        if (KM_0002_02_16 != null) {
            for (StringPoint one : KM_0002_02_16) {
                if (!one.getValue().equals("FFFFFFFF"))
                    KM_0002_02_16list.add(String.valueOf(one.getValue()));
            }
        }
        Collections.sort(KM_0002_02_36list);
        Collections.sort(KM_0002_02_37list);
        Collections.sort(KM_0002_02_38list);
        Collections.sort(KM_0002_02_39list);
        Collections.sort(KM_0002_02_04list);
        Collections.sort(KM_0002_02_05list);
        Collections.sort(KM_0002_02_26list);
        Collections.sort(KM_0002_02_01list);
        Collections.sort(KM_0002_02_23list);
        AvgNum avgNum = new AvgNum();

        result.put("Vcl_VinCode", sqllist.get(0).get("Vcl_VinCode"));
        result.put("MsgTime", date);
        if (KM_0002_02_01 != null) {
            if (KM_0002_02_01list.size() != 0) {
                result.put("KM_0002_02_01Max", KM_0002_02_01list.get(KM_0002_02_01list.size() - 1));
                result.put("KM_0002_02_01Min", KM_0002_02_01list.get(0));
                result.put("KM_0002_02_01AVG", avgNum.avgNumDouble(KM_0002_02_01list));
            }
        } else {
            result.put("KM_0002_02_01Max", null);
            result.put("KM_0002_02_01Min", null);
            result.put("KM_0002_02_01AVG", null);
        }
        if (KM_0002_02_36 != null) {
            if (KM_0002_02_36list.size() != 0) {
                result.put("KM_0002_02_36Max", KM_0002_02_36list.get(KM_0002_02_36list.size() - 1));
                result.put("KM_0002_02_36Min", KM_0002_02_36list.get(0));
                result.put("KM_0002_02_36AVG", avgNum.avgNumDouble(KM_0002_02_36list));
            }
        } else {
            result.put("KM_0002_02_36Max", null);
            result.put("KM_0002_02_36Min", null);
            result.put("KM_0002_02_36AVG", null);
        }
        if (KM_0002_02_37 != null) {

            if (KM_0002_02_37list.size() != 0) {
                result.put("KM_0002_02_37Max", KM_0002_02_37list.get(KM_0002_02_37list.size() - 1));
                result.put("KM_0002_02_37Min", KM_0002_02_37list.get(0));
                result.put("KM_0002_02_37AVG", avgNum.avgNumDouble(KM_0002_02_37list));
            }
        } else {
            result.put("KM_0002_02_37Max", null);
            result.put("KM_0002_02_37Min", null);
            result.put("KM_0002_02_37AVG", null);
        }

        if (KM_0002_02_38 != null) {
            if (KM_0002_02_38list.size() != 0) {
                result.put("KM_0002_02_38Max", KM_0002_02_38list.get(KM_0002_02_38list.size() - 1));
                result.put("KM_0002_02_38Min", KM_0002_02_38list.get(0));
                result.put("KM_0002_02_38AVG", avgNum.avgNumDouble(KM_0002_02_38list));
            }
        } else {
            result.put("KM_0002_02_38Max", null);
            result.put("KM_0002_02_38Min", null);
            result.put("KM_0002_02_38AVG", null);
        }

        if (KM_0002_02_39 != null) {
            if (KM_0002_02_39list.size() != 0) {
                result.put("KM_0002_02_39Max", KM_0002_02_39list.get(KM_0002_02_39list.size() - 1));
                result.put("KM_0002_02_39Min", KM_0002_02_39list.get(0));
                result.put("KM_0002_02_39AVG", avgNum.avgNumDouble(KM_0002_02_39list));
            }
        } else {
            result.put("KM_0002_02_39Max", null);
            result.put("KM_0002_02_39Min", null);
            result.put("KM_0002_02_39AVG", null);
        }
        if (KM_0002_02_26 != null) {
            if (KM_0002_02_26list.size() != 0) {
                result.put("KM_0002_02_26Max", KM_0002_02_26list.get(KM_0002_02_26list.size() - 1));
                result.put("KM_0002_02_26Min", KM_0002_02_26list.get(0));
                result.put("KM_0002_02_26AVG", avgNum.avgNumDouble(KM_0002_02_26list));
            }
        } else {
            result.put("KM_0002_02_26Max", null);
            result.put("KM_0002_02_26Min", null);
            result.put("KM_0002_02_26AVG", null);
        }
        if (KM_0002_02_04 != null) {
            if (KM_0002_02_04list.size() != 0) {
                result.put("KM_0002_02_04Max", KM_0002_02_04list.get(KM_0002_02_04list.size() - 1));
                result.put("KM_0002_02_04Min", KM_0002_02_04list.get(0));
                result.put("KM_0002_02_04AVG", avgNum.avgNumDouble(KM_0002_02_04list));
            }
        } else {
            result.put("KM_0002_02_04Max", null);
            result.put("KM_0002_02_04Min", null);
            result.put("KM_0002_02_04AVG", null);
        }
        if (KM_0002_02_05 != null) {
            if (KM_0002_02_05list.size() != 0) {
                result.put("KM_0002_02_05Max", KM_0002_02_05list.get(KM_0002_02_05list.size() - 1));
                result.put("KM_0002_02_05Min", KM_0002_02_05list.get(0));
                result.put("KM_0002_02_05AVG", avgNum.avgNumDouble(KM_0002_02_05list));
            }
        } else {
            result.put("KM_0002_02_05Max", null);
            result.put("KM_0002_02_05Min", null);
            result.put("KM_0002_02_05AVG", null);
        }
        if (KM_0002_02_23 != null) {
            if (KM_0002_02_23list.size() != 0) {
                result.put("KM_0002_02_23Max", KM_0002_02_23list.get(KM_0002_02_23list.size() - 1));
                result.put("KM_0002_02_23Min", KM_0002_02_23list.get(0));
                result.put("KM_0002_02_23AVG", avgNum.avgNumDouble(KM_0002_02_23list));
            }
        } else {
            result.put("KM_0002_02_23Max", null);
            result.put("KM_0002_02_23Min", null);
            result.put("KM_0002_02_23AVG", null);
        }
        if (KM_0002_02_16 != null) {
            if (KM_0002_02_16list.size() > 0)
                result.put("KM_0002_02_16", KM_0002_02_16list.get(0));
        }

        if (KM_0002_02_20 != null) {
            if (KM_0002_02_20.size() > 0)
                result.put("KM_0002_02_20", KM_0002_02_20list.get(0));
        }
        if (KM_0002_02_02 != null) {
            if (KM_0002_02_02.size() > 0)
                result.put("KM_0002_02_02", KM_0002_02_02list.get(0));
        }
        list.add(result);
        outputSql.put("EveryMinuter_20180823", list);
//        outputSql.add(result);
    }
}
