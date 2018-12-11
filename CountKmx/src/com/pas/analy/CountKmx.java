package com.pas.analy;

import com.google.common.primitives.Ints;
import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountKmx extends UserFunction {
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
        List<DoublePoint> KM_0002_02_01 = doubleInput.get(deviceID).get("KM_0002_02_01");
        List<DoublePoint> KM_0002_02_02 = doubleInput.get(deviceID).get("KM_0002_02_02");
        List<DoublePoint> KM_0002_02_03 = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<DoublePoint> KM_0002_02_04 = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<DoublePoint> KM_0002_02_05 = doubleInput.get(deviceID).get("KM_0002_02_05");
        List<DoublePoint> KM_0002_02_06 = doubleInput.get(deviceID).get("KM_0002_02_06");
        List<DoublePoint> KM_0002_02_07 = doubleInput.get(deviceID).get("KM_0002_02_07");
        List<DoublePoint> KM_0002_02_08 = doubleInput.get(deviceID).get("KM_0002_02_08");
        List<DoublePoint> KM_0002_02_09 = doubleInput.get(deviceID).get("KM_0002_02_09");
        List<DoublePoint> KM_0002_02_10 = doubleInput.get(deviceID).get("KM_0002_02_10");
        List<IntPoint> KM_0002_02_11 = intInput.get(deviceID).get("KM_0002_02_11");
        List<StringPoint> KM_0002_02_12 = stringInput.get(deviceID).get("KM_0002_02_12");
        List<StringPoint> KM_0002_02_13 = stringInput.get(deviceID).get("KM_0002_02_13");
        List<DoublePoint> oil = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<StringPoint> work = stringInput.get(deviceID).get("KM_0002_02_13");
        List<StringPoint> KM_0002_02_14 = stringInput.get(deviceID).get("KM_0002_02_14");
        List<StringPoint> KM_0002_02_16 = stringInput.get(deviceID).get("KM_0002_02_16");
        List<DoublePoint> KM_0002_02_17 = doubleInput.get(deviceID).get("KM_0002_02_17");
        List<StringPoint> KM_0002_02_18 = stringInput.get(deviceID).get("KM_0002_02_18");
        List<StringPoint> KM_0002_02_19 = stringInput.get(deviceID).get("KM_0002_02_19");
        List<DoublePoint> KM_0002_02_20 = doubleInput.get(deviceID).get("KM_0002_02_20");
        List<DoublePoint> KM_0002_02_21 = doubleInput.get(deviceID).get("KM_0002_02_21");
        List<DoublePoint> KM_0002_02_22 = doubleInput.get(deviceID).get("KM_0002_02_22");
        List<DoublePoint> KM_0002_02_23 = doubleInput.get(deviceID).get("KM_0002_02_23");
        List<DoublePoint> KM_0002_02_24 = doubleInput.get(deviceID).get("KM_0002_02_24");
        List<DoublePoint> KM_0002_02_25 = doubleInput.get(deviceID).get("KM_0002_02_25");
        List<DoublePoint> KM_0002_02_26 = doubleInput.get(deviceID).get("KM_0002_02_26");
        List<DoublePoint> KM_0002_02_27 = doubleInput.get(deviceID).get("KM_0002_02_27");
        List<DoublePoint> KM_0002_02_28 = doubleInput.get(deviceID).get("KM_0002_02_28");
        List<DoublePoint> KM_0002_02_29 = doubleInput.get(deviceID).get("KM_0002_02_29");
        List<DoublePoint> KM_0002_02_30 = doubleInput.get(deviceID).get("KM_0002_02_30");
        List<DoublePoint> KM_0002_02_31 = doubleInput.get(deviceID).get("KM_0002_02_31");
        List<DoublePoint> KM_0002_02_32 = doubleInput.get(deviceID).get("KM_0002_02_32");
        List<DoublePoint> KM_0002_02_33 = doubleInput.get(deviceID).get("KM_0002_02_33");
        List<DoublePoint> KM_0002_02_34 = doubleInput.get(deviceID).get("KM_0002_02_34");
        List<DoublePoint> KM_0002_02_35 = doubleInput.get(deviceID).get("KM_0002_02_35");
        List<DoublePoint> KM_0002_02_36 = doubleInput.get(deviceID).get("KM_0002_02_36");
        List<DoublePoint> KM_0002_02_37 = doubleInput.get(deviceID).get("KM_0002_02_37");
        List<DoublePoint> KM_0002_02_38 = doubleInput.get(deviceID).get("KM_0002_02_38");
        List<DoublePoint> KM_0002_02_39 = doubleInput.get(deviceID).get("KM_0002_02_39");
        List<DoublePoint> KM_0002_02_40 = doubleInput.get(deviceID).get("KM_0002_02_40");
        List<DoublePoint> KM_0002_02_41 = doubleInput.get(deviceID).get("KM_0002_02_41");
        List<DoublePoint> KM_0002_02_42 = doubleInput.get(deviceID).get("KM_0002_02_42");

        List<StringPoint> TC_0001_00_1 = stringInput.get(deviceID).get("TC_0001_00_1");
        List<StringPoint> TC_0002_02_17 = stringInput.get(deviceID).get("TC_0002_02_17");
        List<IntPoint> TC_0002_02_18 = intInput.get(deviceID).get("TC_0002_02_18");
        List<IntPoint> TC_0002_02_19 = intInput.get(deviceID).get("TC_0002_02_19");
        List<IntPoint> TC_0002_02_20 = intInput.get(deviceID).get("TC_0002_02_20");
        List<IntPoint> TC_0002_02_21 = intInput.get(deviceID).get("TC_0002_02_21");
        List<IntPoint> TC_0002_02_22 = intInput.get(deviceID).get("TC_0002_02_22");
        List<IntPoint> TC_0002_02_23 = intInput.get(deviceID).get("TC_0002_02_23");
        List<IntPoint> TC_0002_02_24 = intInput.get(deviceID).get("TC_0002_02_24");
        List<IntPoint> TC_0002_02_25 = intInput.get(deviceID).get("TC_0002_02_25");
        List<IntPoint> TC_0002_02_26 = intInput.get(deviceID).get("TC_0002_02_26");
        List<IntPoint> TC_0002_02_27 = intInput.get(deviceID).get("TC_0002_02_27");
        List<IntPoint> TC_0002_02_28 = intInput.get(deviceID).get("TC_0002_02_28");
        List<IntPoint> TC_0002_02_29 = intInput.get(deviceID).get("TC_0002_02_29");
        List<IntPoint> TC_0002_02_30 = intInput.get(deviceID).get("TC_0002_02_30");
        List<IntPoint> TC_0002_02_31 = intInput.get(deviceID).get("TC_0002_02_31");
        List<IntPoint> TC_0002_02_32 = intInput.get(deviceID).get("TC_0002_02_32");
        List<StringPoint> TC_0002_02_33 = stringInput.get(deviceID).get("TC_0002_02_33");
        List<StringPoint> TC_0002_02_34 = stringInput.get(deviceID).get("TC_0002_02_33");
        List<StringPoint> TC_0002_02_35 = stringInput.get(deviceID).get("TC_0002_02_35");
        List<StringPoint> TC_0002_02_36 = stringInput.get(deviceID).get("TC_0002_02_36");
        List<StringPoint> TC_0002_02_37 = stringInput.get(deviceID).get("TC_0002_02_37");
        List<StringPoint> TC_0002_02_38 = stringInput.get(deviceID).get("TC_0002_02_38");
        List<StringPoint> TC_0002_02_39 = stringInput.get(deviceID).get("TC_0002_02_39");
        List<StringPoint> TC_0002_02_40 = stringInput.get(deviceID).get("TC_0002_02_40");
        List<StringPoint> TC_0002_02_41 = stringInput.get(deviceID).get("TC_0002_02_41");
        List<StringPoint> TC_0002_02_42 = stringInput.get(deviceID).get("TC_0002_02_42");
        List<StringPoint> TC_0002_02_43 = stringInput.get(deviceID).get("TC_0002_02_43");
        List<StringPoint> TC_0002_02_44 = stringInput.get(deviceID).get("TC_0002_02_44");
        List<StringPoint> TC_0002_02_45 = stringInput.get(deviceID).get("TC_0002_02_45");
        List<StringPoint> TC_0002_02_46 = stringInput.get(deviceID).get("TC_0002_02_46");
        List<IntPoint> TC_0002_02_47 = intInput.get(deviceID).get("TC_0002_02_47");
        List<IntPoint> TC_0002_02_48 = intInput.get(deviceID).get("TC_0002_02_48");
        List<IntPoint> TC_0002_02_49 = intInput.get(deviceID).get("TC_0002_02_49");
        List<StringPoint> TC_0002_02_57 = stringInput.get(deviceID).get("TC_0002_02_57");
        List<StringPoint> TC_0002_00_01 = stringInput.get(deviceID).get("TC_0002_00_01");

        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();

        if (KM_0002_02_01 != null) {
            alldata.addAll(KM_0002_02_01);
        }
        if (KM_0002_02_02 != null) {
            alldata.addAll(KM_0002_02_02);
        }
        if (KM_0002_02_03 != null) {
            alldata.addAll(KM_0002_02_03);
        }
        if (KM_0002_02_04 != null) {
            alldata.addAll(KM_0002_02_04);
        }
        if (KM_0002_02_05 != null) {
            alldata.addAll(KM_0002_02_05);
        }
        if (KM_0002_02_06 != null) {
            alldata.addAll(KM_0002_02_06);
        }
        if (KM_0002_02_07 != null) {
            alldata.addAll(KM_0002_02_07);
        }
        if (KM_0002_02_08 != null) {
            alldata.addAll(KM_0002_02_08);
        }
        if (KM_0002_02_09 != null) {
            alldata.addAll(KM_0002_02_09);
        }
        if (KM_0002_02_10 != null) {
            alldata.addAll(KM_0002_02_10);
        }
        if (KM_0002_02_11 != null) {
            alldata.addAll(KM_0002_02_11);
        }
        if (KM_0002_02_12 != null) {
            alldata.addAll(KM_0002_02_12);
        }
        if (KM_0002_02_13 != null) {
            alldata.addAll(KM_0002_02_13);
        }
        if (KM_0002_02_14 != null) {
            alldata.addAll(KM_0002_02_14);
        }
        if (KM_0002_02_16 != null) {
            alldata.addAll(KM_0002_02_16);
        }
        if (KM_0002_02_17 != null) {
            alldata.addAll(KM_0002_02_17);
        }
        if (KM_0002_02_18 != null) {
            alldata.addAll(KM_0002_02_18);
        }
        if (KM_0002_02_19 != null) {
            alldata.addAll(KM_0002_02_19);
        }
        if (KM_0002_02_20 != null) {
            alldata.addAll(KM_0002_02_20);
        }
        if (KM_0002_02_21 != null) {
            alldata.addAll(KM_0002_02_21);
        }
        if (KM_0002_02_22 != null) {
            alldata.addAll(KM_0002_02_22);
        }
        if (KM_0002_02_23 != null) {
            alldata.addAll(KM_0002_02_23);
        }
        if (KM_0002_02_24 != null) {
            alldata.addAll(KM_0002_02_24);
        }
        if (KM_0002_02_25 != null) {
            alldata.addAll(KM_0002_02_25);
        }
        if (KM_0002_02_26 != null) {
            alldata.addAll(KM_0002_02_26);
        }
        if (KM_0002_02_27 != null) {
            alldata.addAll(KM_0002_02_27);
        }
        if (KM_0002_02_28 != null) {
            alldata.addAll(KM_0002_02_28);
        }
        if (KM_0002_02_29 != null) {
            alldata.addAll(KM_0002_02_29);
        }
        if (KM_0002_02_30 != null) {
            alldata.addAll(KM_0002_02_30);
        }
        if (KM_0002_02_31 != null) {
            alldata.addAll(KM_0002_02_31);
        }
        if (KM_0002_02_32 != null) {
            alldata.addAll(KM_0002_02_32);
        }
        if (KM_0002_02_33 != null) {
            alldata.addAll(KM_0002_02_33);
        }
        if (KM_0002_02_34 != null) {
            alldata.addAll(KM_0002_02_34);
        }
        if (KM_0002_02_35 != null) {
            alldata.addAll(KM_0002_02_35);
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
        if (KM_0002_02_40 != null) {
            alldata.addAll(KM_0002_02_40);
        }
        if (KM_0002_02_41 != null) {
            alldata.addAll(KM_0002_02_41);
        }
        if (KM_0002_02_42 != null) {
            alldata.addAll(KM_0002_02_42);
        }
        if (TC_0001_00_1 != null) {
            alldata.addAll(TC_0001_00_1);
        }
        if (TC_0002_02_17 != null) {
            alldata.addAll(TC_0002_02_17);
        }
        if (TC_0002_02_18 != null) {
            alldata.addAll(TC_0002_02_18);
        }
        if (TC_0002_02_19 != null) {
            alldata.addAll(TC_0002_02_19);
        }
        if (TC_0002_02_20 != null) {
            alldata.addAll(TC_0002_02_20);
        }
        if (TC_0002_02_21 != null) {
            alldata.addAll(TC_0002_02_21);
        }
        if (TC_0002_02_22 != null) {
            alldata.addAll(TC_0002_02_22);
        }
        if (TC_0002_02_23 != null) {
            alldata.addAll(TC_0002_02_23);
        }
        if (TC_0002_02_24 != null) {
            alldata.addAll(TC_0002_02_24);
        }
        if (TC_0002_02_25 != null) {
            alldata.addAll(TC_0002_02_25);
        }
        if (TC_0002_02_26 != null) {
            alldata.addAll(TC_0002_02_26);
        }
        if (TC_0002_02_27 != null) {
            alldata.addAll(TC_0002_02_27);
        }
        if (TC_0002_02_28 != null) {
            alldata.addAll(TC_0002_02_28);
        }
        if (TC_0002_02_29 != null) {
            alldata.addAll(TC_0002_02_29);
        }
        if (TC_0002_02_30 != null) {
            alldata.addAll(TC_0002_02_30);
        }
        if (TC_0002_02_31 != null) {
            alldata.addAll(TC_0002_02_31);
        }
        if (TC_0002_02_32 != null) {
            alldata.addAll(TC_0002_02_32);
        }
        if (TC_0002_02_33 != null) {
            alldata.addAll(TC_0002_02_33);
        }
        if (TC_0002_02_34 != null) {
            alldata.addAll(TC_0002_02_34);
        }
        if (TC_0002_02_35 != null) {
            alldata.addAll(TC_0002_02_35);
        }
        if (TC_0002_02_36 != null) {
            alldata.addAll(TC_0002_02_36);
        }
        if (TC_0002_02_37 != null) {
            alldata.addAll(TC_0002_02_37);
        }
        if (TC_0002_02_38 != null) {
            alldata.addAll(TC_0002_02_38);
        }
        if (TC_0002_02_39 != null) {
            alldata.addAll(TC_0002_02_39);
        }
        if (TC_0002_02_40 != null) {
            alldata.addAll(TC_0002_02_40);
        }
        if (TC_0002_02_41 != null) {
            alldata.addAll(TC_0002_02_41);
        }
        if (TC_0002_02_42 != null) {
            alldata.addAll(TC_0002_02_42);
        }
        if (TC_0002_02_43 != null) {
            alldata.addAll(TC_0002_02_43);
        }
        if (TC_0002_02_44 != null) {
            alldata.addAll(TC_0002_02_44);
        }
        if (TC_0002_02_45 != null) {
            alldata.addAll(TC_0002_02_45);
        }
        if (TC_0002_02_46 != null) {
            alldata.addAll(TC_0002_02_46);
        }
        if (TC_0002_02_47 != null) {
            alldata.addAll(TC_0002_02_47);
        }
        if (TC_0002_02_48 != null) {
            alldata.addAll(TC_0002_02_48);
        }
        if (TC_0002_02_49 != null) {
            alldata.addAll(TC_0002_02_49);
        }
        if (TC_0002_02_57 != null) {
            alldata.addAll(TC_0002_02_57);
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
        String date="";
        date = longToDate.timeStamp2Date(String.valueOf(timeLong2.get(0)), "yyyy-MM-dd");
        List<Double> KM_0002_02_01list = new ArrayList<>();
        List<Double> KM_0002_02_01Normallist = new ArrayList<>();
        List<Double> KM_0002_02_01Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_01Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_02list = new ArrayList<>();
        List<Double> KM_0002_02_02Normallist = new ArrayList<>();
        List<Double> KM_0002_02_02Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_02Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_03list = new ArrayList<>();
        List<Double> KM_0002_02_03Normallist = new ArrayList<>();
        List<Double> KM_0002_02_03Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_03Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_04list = new ArrayList<>();
        List<Double> KM_0002_02_04Normallist = new ArrayList<>();
        List<Double> KM_0002_02_04Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_04Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_05list = new ArrayList<>();
        List<Double> KM_0002_02_05Normallist = new ArrayList<>();
        List<Double> KM_0002_02_05Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_05Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_06list = new ArrayList<>();
        List<Double> KM_0002_02_06Normallist = new ArrayList<>();
        List<Double> KM_0002_02_06Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_06Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_07list = new ArrayList<>();
        List<Double> KM_0002_02_07Normallist = new ArrayList<>();
        List<Double> KM_0002_02_07Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_07Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_08list = new ArrayList<>();
        List<Double> KM_0002_02_08Normallist = new ArrayList<>();
        List<Double> KM_0002_02_08Undefinelist = new ArrayList<>();
        List<Double> KM_0002_02_08Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_09list = new ArrayList<>();
        List<Double> KM_0002_02_09Normallist = new ArrayList<>();
        List<Double> KM_0002_02_09Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_09list2 = new ArrayList<>();
        List<Double> KM_0002_02_10list = new ArrayList<>();
        List<Double> KM_0002_02_10Normallist = new ArrayList<>();
        List<Double> KM_0002_02_10Abnormallist = new ArrayList<>();
        List<Double> KM_0002_02_10list2 = new ArrayList<>();
        List<Double> KM_0002_02_17list = new ArrayList<>();
        List<Double> KM_0002_02_20list = new ArrayList<>();
        List<Double> KM_0002_02_21list = new ArrayList<>();
        List<Double> KM_0002_02_22list = new ArrayList<>();
        List<Double> KM_0002_02_23list = new ArrayList<>();
        List<Double> KM_0002_02_24list = new ArrayList<>();
        List<Double> KM_0002_02_25list = new ArrayList<>();
        List<Double> KM_0002_02_26list = new ArrayList<>();
        List<Double> KM_0002_02_27list = new ArrayList<>();
        List<Double> KM_0002_02_28list = new ArrayList<>();
        List<Double> KM_0002_02_29list = new ArrayList<>();
        List<Double> KM_0002_02_30list = new ArrayList<>();
        List<Double> KM_0002_02_31list = new ArrayList<>();
        List<Double> KM_0002_02_32list = new ArrayList<>();
        List<Double> KM_0002_02_33list = new ArrayList<>();
        List<Double> KM_0002_02_34list = new ArrayList<>();
        List<Double> KM_0002_02_35list = new ArrayList<>();
        List<Double> KM_0002_02_36list = new ArrayList<>();
        List<Double> KM_0002_02_37list = new ArrayList<>();
        List<Double> KM_0002_02_38list = new ArrayList<>();
        List<Double> KM_0002_02_39list = new ArrayList<>();
        List<Double> KM_0002_02_40list = new ArrayList<>();
        List<Double> KM_0002_02_41list = new ArrayList<>();
        List<Double> KM_0002_02_42list = new ArrayList<>();
        List<Double> TC_0002_02_18list = new ArrayList<>();
        List<Integer> TC_0002_02_18list2 = new ArrayList<>();
        List<Double> TC_0002_02_19list = new ArrayList<>();
        List<Integer> TC_0002_02_19list2 = new ArrayList<>();
        List<Double> TC_0002_02_20list = new ArrayList<>();
        List<Integer> TC_0002_02_20list2 = new ArrayList<>();
        List<Double> TC_0002_02_21list = new ArrayList<>();
        List<Integer> TC_0002_02_21list2 = new ArrayList<>();
        List<Double> TC_0002_02_22list = new ArrayList<>();
        List<Integer> TC_0002_02_22list2 = new ArrayList<>();
        List<Double> TC_0002_02_23list = new ArrayList<>();
        List<Integer> TC_0002_02_23list2 = new ArrayList<>();
        List<Double> TC_0002_02_24list = new ArrayList<>();
        List<Integer> TC_0002_02_24list2 = new ArrayList<>();
        List<Double> TC_0002_02_25list = new ArrayList<>();
        List<Integer> TC_0002_02_25list2 = new ArrayList<>();
        List<Double> TC_0002_02_26list = new ArrayList<>();
        List<Integer> TC_0002_02_26list2 = new ArrayList<>();
        List<Double> TC_0002_02_27list = new ArrayList<>();
        List<Integer> TC_0002_02_27list2 = new ArrayList<>();
        List<Double> TC_0002_02_28list = new ArrayList<>();
        List<Integer> TC_0002_02_28list2 = new ArrayList<>();
        List<Double> TC_0002_02_29list = new ArrayList<>();
        List<Integer> TC_0002_02_29list2 = new ArrayList<>();
        List<Double> TC_0002_02_30list = new ArrayList<>();
        List<Integer> TC_0002_02_30list2 = new ArrayList<>();
        List<Double> TC_0002_02_31list = new ArrayList<>();
        List<Integer> TC_0002_02_31list2 = new ArrayList<>();
        List<Double> TC_0002_02_32list = new ArrayList<>();
        List<Integer> TC_0002_02_32list2 = new ArrayList<>();
        List<String> KM_0002_02_14list = new ArrayList<>();
        List<String> KM_0002_02_16list = new ArrayList<>();
        List<String> KM_0002_02_18list = new ArrayList<>();
        List<String> KM_0002_02_19list = new ArrayList<>();

        int m=0,n=0;
        int n1=0,n2=0,n3=0;
        int m1=0,m2=0,m3=0;
        int F1=0;
        int F3=0;
        int F4=0,F5=0,F6=0,F7=0,F8=0,F9=0,F10=0;
        int Default1=0,Default2=0,Default3=0,Detault4=0;
        //过滤异常
        for (int i = 0; i < timeLong2.size(); i++) {
            List<AbstractPoint> listpoint = resultMap.get(timeLong2.get(i));
            if (listpoint != null) {
                for (AbstractPoint ap : listpoint) {
                    if (ap.getMetric().equals("KM_0002_02_01")) {
                        Exception exception = new Exception();
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        if (ap2.getValue()<511)
                            KM_0002_02_01list.add(d);
                        if (d<=120&&d>=-40)
                            KM_0002_02_01Normallist.add(d);
                        if (d>=121&&d<=130)
                            KM_0002_02_01Undefinelist.add(d);
                        if (d>130)
                            KM_0002_02_01Abnormallist.add(d);
                        if (d>=511)
                            F1++;
                    }
                    if (ap.getMetric().equals("KM_0002_02_02")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_02list.add(d);
                        if (d==0)
                            n++;
                        if (d==1)
                            m++;
                        if (d==0||d==1)
                            KM_0002_02_02Normallist.add(d);
                        else
                            KM_0002_02_02Abnormallist.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_03")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception = new Exception();
                        if (ap2.getValue()<1023.98)
                            KM_0002_02_03list.add(d);
                        if (d<=100&&d>=0)
                            KM_0002_02_03Normallist.add(d);
                        if (d<=100&&d>=51)
                            KM_0002_02_03Undefinelist.add(d);
                        if (d>100)
                            KM_0002_02_03Abnormallist.add(d);
                        if (d>=1023.98)
                            F3++;
                    }
                    if (ap.getMetric().equals("KM_0002_02_04")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception = new Exception();
                        if (exception.twoF()/8>d)
                            KM_0002_02_04list.add(d);
                        else
                            F4++;
                        if (d<=2300&&d>=0)
                            KM_0002_02_04Normallist.add(d);
                        if (d<=2400&&d>=2301)
                            KM_0002_02_04Undefinelist.add(d);
                        if (d>2400)
                            KM_0002_02_04Abnormallist.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_05")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception = new Exception();
                        if (exception.oneF()/2>d)
                            KM_0002_02_05list.add(d);
                        else
                            F5++;
                        if (d<=100&&d>=0)
                            KM_0002_02_05Normallist.add(d);
                        if (d<=105&&d>=101)
                            KM_0002_02_05Undefinelist.add(d);
                        if (d>105)
                            KM_0002_02_05Abnormallist.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_06")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()*0.0225>d)
                            KM_0002_02_06list.add(d);
                        else
                            F6++;
                        if (d<=150&&d>=0)
                            KM_0002_02_06Normallist.add(d);
                        if (d<=200&&d>=151)
                            KM_0002_02_06Undefinelist.add(d);
                        if (d>200)
                            KM_0002_02_06Abnormallist.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_07")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception = new Exception();
                        if (exception.F()*2!=d&&exception.oneF()*2>d&&d!=482)
                            KM_0002_02_07list.add(d);
                        if (exception.oneF()*2<=d)
                            F7++;
                        if (d<=400&&d>=0)
                            KM_0002_02_07Normallist.add(d);
                        if (d<=500&&d>=401)
                            KM_0002_02_07Undefinelist.add(d);
                        if (d>500)
                            KM_0002_02_07Abnormallist.add(d);
                        if (exception.F()*2==d||exception.F2()*2==d)
                            Default1++;

                    }
                    if (ap.getMetric().equals("KM_0002_02_08")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()*2>d&&exception.R()*2!=d&&d!=482)
                            KM_0002_02_08list.add(d);
                        if (exception.oneF()*2<=d)
                            F8++;
                        if (d<=400&&d>=0)
                            KM_0002_02_08Normallist.add(d);
                        if (d<=500&&d>=401)
                            KM_0002_02_08Undefinelist.add(d);
                        if (d>500)
                            KM_0002_02_08Abnormallist.add(d);
                        if (exception.R()*2==d||exception.F2()*2==d)
                            Default2++;
                    }

                    if (ap.getMetric().equals("KM_0002_02_09")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        if (d==2368806)
                            n1++;
                        if (d==2566185)
                            n2++;
                        if (d==2171427)
                            n3++;
                        Exception exception = new Exception();
                        if (exception.threeF()>d)
                            KM_0002_02_09list2.add(d);
                        if (exception.threeF()>d&&exception.FEPC1()!=d&&d!=2368806)
                            KM_0002_02_09list.add(d);
                        if (exception.threeF()<=d)
                            F9++;
                        if (d<=1200&&d>=0)
                            KM_0002_02_09Normallist.add(d);
                        if (d>1200)
                            KM_0002_02_09Abnormallist.add(d);
                        if (exception.FEPC1()==d||exception.REPC1()==d)
                            Default3++;
                    }

                    if (ap.getMetric().equals("KM_0002_02_10")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        if (d==2368806)
                            m1++;
                        if (d==2566185)
                            m2++;
                        if (d==2171427)
                            m3++;
                        Exception exception=new Exception();
                        if (exception.threeF()>d)
                            KM_0002_02_10list2.add(d);
                        else
                            F10++;
                        if (exception.threeF()>d&&exception.REPC1()!=d&&d!=2566185)
                            KM_0002_02_10list.add(d);
                        if (d<=1200&&d>=0)
                            KM_0002_02_10Normallist.add(d);
                        if (d>1200)
                            KM_0002_02_10Abnormallist.add(d);
                        if (exception.REPC1()==d||exception.REPC2()==d)
                            Detault4++;
                    }
                    if (ap.getMetric().equals("KM_0002_02_17")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.fourF()*10*0.1>d)
                            KM_0002_02_17list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_20")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.oneF()>ap2.getValue())
                            KM_0002_02_20list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_21")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*10*0.1>ap2.getValue())
                            KM_0002_02_21list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_22")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*10*0.1>ap2.getValue())
                            KM_0002_02_22list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_23")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*10.2>ap2.getValue())
                            KM_0002_02_23list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_24")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*10*0.1>ap2.getValue())
                            KM_0002_02_24list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_25")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_25list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_26")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_26list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_27")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.oneF()>ap2.getValue())
                            KM_0002_02_27list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_28")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_28list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_29")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_29list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_30")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_30list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_31")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_31list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_32")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_32list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_33")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001>ap2.getValue())
                            KM_0002_02_33list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_34")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*1.02*0.1>ap2.getValue())
                            KM_0002_02_34list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_35")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_35list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_36")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001*10197!=ap2.getValue())
                            KM_0002_02_36list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_37")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.1>ap2.getValue())
                            KM_0002_02_37list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_38")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.001*10197>ap2.getValue())
                            KM_0002_02_38list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_39")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_39list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_40")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()*0.1/1000>ap2.getValue())
                            KM_0002_02_40list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_41")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_41list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_42")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        Exception exception=new Exception();
                        if (exception.fourF()>ap2.getValue())
                            KM_0002_02_42list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("TC_0002_02_18")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_18list.add(d);
                            TC_0002_02_18list2.add(ap2.getValue());
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_19")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_19list.add(d);
                            TC_0002_02_19list2.add(ap2.getValue());
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_20")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_20list.add(d);
                            TC_0002_02_20list2.add(ap2.getValue());
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_21")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_21list2.add(ap2.getValue());
                            TC_0002_02_21list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_22")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_22list2.add(ap2.getValue());
                            TC_0002_02_22list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_23")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_23list2.add(ap2.getValue());
                            TC_0002_02_23list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_24")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_24list2.add(ap2.getValue());
                            TC_0002_02_24list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_25")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_25list2.add(ap2.getValue());
                            TC_0002_02_25list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_26")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_26list2.add(ap2.getValue());
                            TC_0002_02_26list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_27")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_27list2.add(ap2.getValue());
                            TC_0002_02_27list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_28")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.oneF()>d) {
                            TC_0002_02_28list2.add(ap2.getValue());
                            TC_0002_02_28list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_29")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_29list2.add(ap2.getValue());
                            TC_0002_02_29list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_30")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_30list2.add(ap2.getValue());
                            TC_0002_02_30list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_31")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_31list2.add(ap2.getValue());
                            TC_0002_02_31list.add(d);
                        }
                    }
                    if (ap.getMetric().equals("TC_0002_02_32")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        Exception exception=new Exception();
                        if (exception.twoF()>d) {
                            TC_0002_02_32list2.add(ap2.getValue());
                            TC_0002_02_32list.add(d);
                        }
                    }
                }
            }
        }
        Collections.sort(KM_0002_02_01list);
        Collections.sort(KM_0002_02_02list);
        Collections.sort(KM_0002_02_03list);
        Collections.sort(KM_0002_02_04list);
        Collections.sort(KM_0002_02_05list);
        Collections.sort(KM_0002_02_06list);
        Collections.sort(KM_0002_02_07list);
        Collections.sort(KM_0002_02_08list);
        Collections.sort(KM_0002_02_09list);
        Collections.sort(KM_0002_02_10list);
        Collections.sort(KM_0002_02_17list);
        Collections.sort(KM_0002_02_20list);
        Collections.sort(KM_0002_02_21list);
        Collections.sort(KM_0002_02_22list);
        Collections.sort(KM_0002_02_23list);
        Collections.sort(KM_0002_02_24list);
        Collections.sort(KM_0002_02_25list);
        Collections.sort(KM_0002_02_26list);
        Collections.sort(KM_0002_02_27list);
        Collections.sort(KM_0002_02_28list);
        Collections.sort(KM_0002_02_29list);
        Collections.sort(KM_0002_02_30list);
        Collections.sort(KM_0002_02_31list);
        Collections.sort(KM_0002_02_32list);
        Collections.sort(KM_0002_02_33list);
        Collections.sort(KM_0002_02_34list);
        Collections.sort(KM_0002_02_35list);
        Collections.sort(KM_0002_02_36list);
        Collections.sort(KM_0002_02_37list);
        Collections.sort(KM_0002_02_38list);
        Collections.sort(KM_0002_02_39list);
        Collections.sort(KM_0002_02_40list);
        Collections.sort(KM_0002_02_41list);
        Collections.sort(KM_0002_02_42list);
        Collections.sort(TC_0002_02_18list);
        Collections.sort(TC_0002_02_19list);
        Collections.sort(TC_0002_02_20list);
        Collections.sort(TC_0002_02_21list);
        Collections.sort(TC_0002_02_22list);
        Collections.sort(TC_0002_02_23list);
        Collections.sort(TC_0002_02_24list);
        Collections.sort(TC_0002_02_25list);
        Collections.sort(TC_0002_02_26list);
        Collections.sort(TC_0002_02_27list);
        Collections.sort(TC_0002_02_28list);
        Collections.sort(TC_0002_02_29list);
        Collections.sort(TC_0002_02_30list);
        Collections.sort(TC_0002_02_31list);
        Collections.sort(TC_0002_02_32list);
        List<Double>oils = new ArrayList<>();
        List<Long>oilTimes = new ArrayList<>();
        for (DoublePoint one:oil){
            oils.add(Double.valueOf(one.getValue()));
            oilTimes.add(one.getPrimaryTime());
        }
        CoutOil coutOil = new CoutOil();
        coutOil.Calculation(oilTimes,oils);
//        System.out.println(coutOil.getAllOil());

        List<Integer>works = new ArrayList<>();
        List<Long>workTimes = new ArrayList<>();
        for (StringPoint one:work){
            if (one.getValue().equals("FF")||one.getValue().equals("F3")||one.getValue().equals("3B")||one.getValue().equals("B5")||one.getValue().equals("C8")){
                continue;
            }
            works.add(Integer.parseInt(one.getValue()));
            workTimes.add(one.getPrimaryTime());
        }
        CoutWorkTime coutWorkTime = new CoutWorkTime();
        coutWorkTime.Calculation(workTimes,works);
//        System.out.println(coutWorkTime.getHourB_P()+" "+coutWorkTime.getHourE()+" "+coutWorkTime.getHourL());
        for (StringPoint one:KM_0002_02_14){
            if (one.getValue().equals("FF")){
                continue;
            }
            KM_0002_02_14list.add(one.getValue());
        }
        for (StringPoint one:KM_0002_02_16){
            if (one.getValue().equals("FFFFFFFF")){
                continue;
            }
            KM_0002_02_16list.add(one.getValue());
        }
        for (StringPoint one:KM_0002_02_18){
            if (one.getValue().equals("FFFFFFFFFFFFFFFF")){
                continue;
            }
            KM_0002_02_18list.add(one.getValue());
        }
        for (StringPoint one:KM_0002_02_19){
            if (one.getValue().equals("FFFFFFFFFFFFFFFF")){
                continue;
            }
            KM_0002_02_19list.add(one.getValue());
        }
        AvgNum avgNum = new AvgNum();

        result.put("Vcl_ID", deviceID);
        result.put("MsgTime", date);
        if (KM_0002_02_01 != null) {
            if (KM_0002_02_01list.size() != 0) {
                Boxplot boxplot = new Boxplot(KM_0002_02_01list);
                result.put("KM_0002_02_01Max", KM_0002_02_01list.get(KM_0002_02_01list.size() - 1));
                result.put("KM_0002_02_01Min", KM_0002_02_01list.get(0));
                result.put("KM_0002_02_01AVG", avgNum.avgNumDouble(KM_0002_02_01list));
                result.put("KM_0002_02_01MidNum",boxplot.getMedian());
                result.put("KM_0002_02_01FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_01TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_01UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_01DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_01Normal",KM_0002_02_01Normallist.size());
                result.put("KM_0002_02_01Undefine",KM_0002_02_01Undefinelist.size());
                result.put("KM_0002_02_01Abnormal",KM_0002_02_01Abnormallist.size());
            }
            result.put("KM_0002_02_01", KM_0002_02_01list.size());
            result.put("KM_0002_02_01F",F1);
        }
        else
            result.put("KM_0002_02_01", 0);

        if (KM_0002_02_02 != null) {
            if (KM_0002_02_02list.size()!=0)
            {
                Boxplot boxplot = new Boxplot(KM_0002_02_02list);
                result.put("KM_0002_02_02Max", KM_0002_02_02list.get(KM_0002_02_02list.size() - 1));
                result.put("KM_0002_02_02Min", KM_0002_02_02list.get(0));
                result.put("KM_0002_02_02Num0",n);
                result.put("KM_0002_02_02Num1",m);
                result.put("KM_0002_02_02AVG", avgNum.avgNumDouble(KM_0002_02_02list));
                result.put("KM_0002_02_02MidNum",boxplot.getMedian());
                result.put("KM_0002_02_02FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_02TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_02UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_02DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_02Normal",KM_0002_02_02Normallist.size());
                result.put("KM_0002_02_02Undefine",KM_0002_02_02Undefinelist.size());
                result.put("KM_0002_02_02Abnormal",KM_0002_02_02Abnormallist.size());
            }
            result.put("KM_0002_02_02", KM_0002_02_02list.size());


        }else
            result.put("KM_0002_02_02", 0);

        if (KM_0002_02_03!=null)
        {
            if (KM_0002_02_03list.size()!=0)
            {
                Boxplot boxplot = new Boxplot(KM_0002_02_03list);
                result.put("KM_0002_02_03Max", KM_0002_02_03list.get(KM_0002_02_03list.size() - 1));
                result.put("KM_0002_02_03Min", KM_0002_02_03list.get(0));
                result.put("KM_0002_02_03AVG", avgNum.avgNumDouble(KM_0002_02_03list));
                result.put("KM_0002_02_03MidNum",boxplot.getMedian());
                result.put("KM_0002_02_03FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_03TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_03UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_03DownLimit",boxplot.getDownLimit());
                result.put("Oil",coutOil.getAllOil());
                result.put("KM_0002_02_03Normal",KM_0002_02_03Normallist.size());
                result.put("KM_0002_02_03Undefine",KM_0002_02_03Undefinelist.size());
                result.put("KM_0002_02_03Abnormal",KM_0002_02_03Abnormallist.size());
            }
            result.put("KM_0002_02_03", KM_0002_02_03list.size());
            result.put("KM_0002_02_03F",F3);
        }else
            result.put("KM_0002_02_03", 0);

        if (KM_0002_02_04!=null)
        {
            if (KM_0002_02_04list.size() != 0) {
                result.put("KM_0002_02_04Max", KM_0002_02_04list.get(KM_0002_02_04list.size() - 1));
                result.put("KM_0002_02_04Min", KM_0002_02_04list.get(0));
                result.put("KM_0002_02_04AVG", avgNum.avgNumDouble(KM_0002_02_04list));
                Boxplot boxplot = new Boxplot(KM_0002_02_04list);
                result.put("KM_0002_02_04MidNum",boxplot.getMedian());
                result.put("KM_0002_02_04FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_04TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_04UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_04DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_04Normal",KM_0002_02_04Normallist.size());
                result.put("KM_0002_02_04Undefine",KM_0002_02_04Undefinelist.size());
                result.put("KM_0002_02_04Abnormal",KM_0002_02_04Abnormallist.size());
            }
            result.put("KM_0002_02_04", KM_0002_02_04list.size());
            result.put("KM_0002_02_04F",F4);
        }else
            result.put("KM_0002_02_04", 0);

        if (KM_0002_02_05!=null)
        {
            result.put("KM_0002_02_05", KM_0002_02_05list.size());
            if (KM_0002_02_05list.size() != 0) {
                result.put("KM_0002_02_05Max", KM_0002_02_05list.get(KM_0002_02_05list.size() - 1));
                result.put("KM_0002_02_05Min", KM_0002_02_05list.get(0));
                result.put("KM_0002_02_05AVG", avgNum.avgNumDouble(KM_0002_02_05list));
                Boxplot boxplot = new Boxplot(KM_0002_02_05list);
                result.put("KM_0002_02_05MidNum",boxplot.getMedian());
                result.put("KM_0002_02_05FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_05TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_05UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_05DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_05Normal",KM_0002_02_05Normallist.size());
                result.put("KM_0002_02_05Undefine",KM_0002_02_05Undefinelist.size());
                result.put("KM_0002_02_05Abnormal",KM_0002_02_05Abnormallist.size());
            }
            result.put("KM_0002_02_05F",F5);
        }else
            result.put("KM_0002_02_05", 0);

        if (KM_0002_02_06!=null)
        {
            result.put("KM_0002_02_06", KM_0002_02_06list.size());
            if (KM_0002_02_06list.size() != 0) {
                result.put("KM_0002_02_06Max", KM_0002_02_06list.get(KM_0002_02_06list.size() - 1));
                result.put("KM_0002_02_06Min", KM_0002_02_06list.get(0));
                result.put("KM_0002_02_06AVG", avgNum.avgNumDouble(KM_0002_02_06list));
                Boxplot boxplot = new Boxplot(KM_0002_02_06list);
                result.put("KM_0002_02_06MidNum",boxplot.getMedian());
                result.put("KM_0002_02_06FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_06TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_06UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_06DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_06Normal",KM_0002_02_06Normallist.size());
                result.put("KM_0002_02_06Undefine",KM_0002_02_06Undefinelist.size());
                result.put("KM_0002_02_06Abnormal",KM_0002_02_06Abnormallist.size());
            }
            result.put("KM_0002_02_06F",F6);
        }else
            result.put("KM_0002_02_06", 0);

        if (KM_0002_02_07!=null)
        {
            if (KM_0002_02_07list.size() != 0) {
                result.put("KM_0002_02_07Max", KM_0002_02_07list.get(KM_0002_02_07list.size() - 1));
                result.put("KM_0002_02_07Min", KM_0002_02_07list.get(0));
                result.put("KM_0002_02_07AVG", avgNum.avgNumDouble(KM_0002_02_07list));
                Boxplot boxplot = new Boxplot(KM_0002_02_07list);
                result.put("KM_0002_02_07MidNum",boxplot.getMedian());
                result.put("KM_0002_02_07FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_07TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_07UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_07DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_07Normal",KM_0002_02_07Normallist.size());
                result.put("KM_0002_02_07Undefine",KM_0002_02_07Undefinelist.size());
                result.put("KM_0002_02_07Abnormal",KM_0002_02_07Abnormallist.size());
            }
            result.put("KM_0002_02_07", KM_0002_02_07list.size());
            result.put("KM_0002_02_07F",F7);
            result.put("KM_0002_02_07Defective",Default1);
        }else
            result.put("KM_0002_02_07", 0);


        if (KM_0002_02_08list!=null)
        {
            result.put("KM_0002_02_08", KM_0002_02_08list.size());
            if (KM_0002_02_08list.size() != 0) {
                result.put("KM_0002_02_08Max", KM_0002_02_08list.get(KM_0002_02_08list.size() - 1));
                result.put("KM_0002_02_08Min", KM_0002_02_08list.get(0));
                result.put("KM_0002_02_08AVG", avgNum.avgNumDouble(KM_0002_02_08list));
                Boxplot boxplot = new Boxplot(KM_0002_02_08list);
                result.put("KM_0002_02_08MidNum",boxplot.getMedian());
                result.put("KM_0002_02_08FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_08TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_08UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_08DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_08Normal",KM_0002_02_08Normallist.size());
                result.put("KM_0002_02_08Undefine",KM_0002_02_08Undefinelist.size());
                result.put("KM_0002_02_08Abnormal",KM_0002_02_08Abnormallist.size());
            }
            result.put("KM_0002_02_08F",F8);
            result.put("KM_0002_02_08Defective",Default2);
        }else
            result.put("KM_0002_02_08", 0);


        if (KM_0002_02_09list!=null)
        {
            result.put("KM_0002_02_09", KM_0002_02_09list.size());
            result.put("KM_0002_02_09Size",KM_0002_02_09list2.size());
            if (KM_0002_02_09.size()>0)
            {
                result.put("KM_0002_02_09Num212223",n1);
                result.put("KM_0002_02_09Num242526",n2);
                result.put("KM_0002_02_09Num272829",n3);
            }

            if (KM_0002_02_09list.size() != 0) {
                result.put("KM_0002_02_09Max", KM_0002_02_09list.get(KM_0002_02_09list.size() - 1));
                result.put("KM_0002_02_09Min", KM_0002_02_09list.get(0));
                result.put("KM_0002_02_09AVG", avgNum.avgNumDouble(KM_0002_02_09list));

                Boxplot boxplot = new Boxplot(KM_0002_02_09list);
                result.put("KM_0002_02_09MidNum",boxplot.getMedian());
                result.put("KM_0002_02_09FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_09TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_09UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_09DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_09Normal",KM_0002_02_09Normallist.size());
                result.put("KM_0002_02_09Abnormal",KM_0002_02_09Abnormallist.size());
            }
            result.put("KM_0002_02_09F",F9);
            result.put("KM_0002_02_09Defective",Default3);
        }else
            result.put("KM_0002_02_09", 0);


        if (KM_0002_02_10!=null)
        {
            result.put("KM_0002_02_10", KM_0002_02_10list.size());
            result.put("KM_0002_02_10Size",KM_0002_02_10list2.size());
            if (KM_0002_02_10.size()>0)
            {
                result.put("KM_0002_02_10Num212223",m1);
                result.put("KM_0002_02_10Num242526",m2);
                result.put("KM_0002_02_10Num272829",m3);
            }
            if (KM_0002_02_10list.size() != 0) {
                result.put("KM_0002_02_10Max", KM_0002_02_10list.get(KM_0002_02_10list.size() - 1));
                result.put("KM_0002_02_10Min", KM_0002_02_10list.get(0));
                result.put("KM_0002_02_10AVG", avgNum.avgNumDouble(KM_0002_02_10list));

                Boxplot boxplot = new Boxplot(KM_0002_02_10list);
                result.put("KM_0002_02_10MidNum",boxplot.getMedian());
                result.put("KM_0002_02_10FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_10TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_10UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_10DownLimit",boxplot.getDownLimit());
                result.put("KM_0002_02_10Normal",KM_0002_02_10Normallist.size());
                result.put("KM_0002_02_10Abnormal",KM_0002_02_10Abnormallist.size());
            }
            result.put("KM_0002_02_10F",F10);
            result.put("KM_0002_02_10Defective",Detault4);
        }else
            result.put("KM_0002_02_10", 0);


        if (KM_0002_02_11!=null)
            result.put("KM_0002_02_11", KM_0002_02_11.size());
        else
            result.put("KM_0002_02_11", 0);

        if (KM_0002_02_12!=null)
            result.put("KM_0002_02_12", KM_0002_02_12.size());
        else
            result.put("KM_0002_02_12", 0);

        if (KM_0002_02_13!=null)
        {
            result.put("KM_0002_02_13", works.size());
            result.put("B_Pmodel",coutWorkTime.getHourB_P());
            result.put("Emodel",coutWorkTime.getHourE());
            result.put("Lmodel",coutWorkTime.getHourL());
        }
        else
            result.put("KM_0002_02_13",0);

        if (KM_0002_02_14!=null)
            result.put("KM_0002_02_14", KM_0002_02_14list.size());
        else
            result.put("KM_0002_02_14", 0);

        if (KM_0002_02_16!=null)
            result.put("KM_0002_02_16", KM_0002_02_16list.size());
        else
            result.put("KM_0002_02_16", 0);

        if (KM_0002_02_17!=null)
        {
            result.put("KM_0002_02_17", KM_0002_02_17list.size());
            if (KM_0002_02_17list.size() != 0) {
                result.put("KM_0002_02_17Max", KM_0002_02_17list.get(KM_0002_02_17list.size() - 1));
                result.put("KM_0002_02_17Min", KM_0002_02_17list.get(0));
                result.put("KM_0002_02_17AVG", avgNum.avgNumDouble(KM_0002_02_17list));
                Boxplot boxplot = new Boxplot(KM_0002_02_17list);
                result.put("KM_0002_02_17MidNum",boxplot.getMedian());
                result.put("KM_0002_02_17FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_17TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_17UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_17DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_17", 0);

        if (KM_0002_02_18!=null)
            result.put("KM_0002_02_18", KM_0002_02_18list.size());
        else
            result.put("KM_0002_02_18", 0);

        if (KM_0002_02_19!=null)
            result.put("KM_0002_02_19", KM_0002_02_19list.size());
        else
            result.put("KM_0002_02_19", 0);

        if (KM_0002_02_20!=null)
        {
            result.put("KM_0002_02_20", KM_0002_02_20list.size());
            if (KM_0002_02_20list.size() != 0) {
                result.put("KM_0002_02_20Max", KM_0002_02_20list.get(KM_0002_02_20list.size() - 1));
                result.put("KM_0002_02_20Min", KM_0002_02_20list.get(0));
                result.put("KM_0002_02_20AVG", avgNum.avgNumDouble(KM_0002_02_20list));
                Boxplot boxplot = new Boxplot(KM_0002_02_20list);
                result.put("KM_0002_02_20MidNum",boxplot.getMedian());
                result.put("KM_0002_02_20FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_20TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_20UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_20DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_20", 0);

        if (KM_0002_02_21!=null)
        {
            result.put("KM_0002_02_21", KM_0002_02_21list.size());
            if (KM_0002_02_21list.size() != 0) {
                result.put("KM_0002_02_21Max", KM_0002_02_21list.get(KM_0002_02_21list.size() - 1));
                result.put("KM_0002_02_21Min", KM_0002_02_21list.get(0));
                result.put("KM_0002_02_21AVG", avgNum.avgNumDouble(KM_0002_02_21list));
                Boxplot boxplot = new Boxplot(KM_0002_02_21list);
                result.put("KM_0002_02_21MidNum",boxplot.getMedian());
                result.put("KM_0002_02_21FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_21TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_21UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_21DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_21", 0);

        if (KM_0002_02_22!=null)
        {
            result.put("KM_0002_02_22", KM_0002_02_22list.size());
            if (KM_0002_02_22list.size() != 0) {
                result.put("KM_0002_02_22Max", KM_0002_02_22list.get(KM_0002_02_22list.size() - 1));
                result.put("KM_0002_02_22Min", KM_0002_02_22list.get(0));
                result.put("KM_0002_02_22AVG", avgNum.avgNumDouble(KM_0002_02_22list));
                Boxplot boxplot = new Boxplot(KM_0002_02_22list);
                result.put("KM_0002_02_22MidNum",boxplot.getMedian());
                result.put("KM_0002_02_22FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_22TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_22UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_22DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_22", 0);

        if (KM_0002_02_23!=null)
        {
            result.put("KM_0002_02_23", KM_0002_02_23list.size());
            if (KM_0002_02_23list.size() != 0) {
                result.put("KM_0002_02_23Max", KM_0002_02_23list.get(KM_0002_02_23list.size() - 1));
                result.put("KM_0002_02_23Min", KM_0002_02_23list.get(0));
                result.put("KM_0002_02_23AVG", avgNum.avgNumDouble(KM_0002_02_23list));
                Boxplot boxplot = new Boxplot(KM_0002_02_23list);
                result.put("KM_0002_02_23MidNum",boxplot.getMedian());
                result.put("KM_0002_02_23FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_23TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_23UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_23DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_23", 0);

        if (KM_0002_02_24!=null)
        {
            result.put("KM_0002_02_24", KM_0002_02_24list.size());
            if (KM_0002_02_24list.size() != 0) {
                result.put("KM_0002_02_24Max", KM_0002_02_24list.get(KM_0002_02_24list.size() - 1));
                result.put("KM_0002_02_24Min", KM_0002_02_24list.get(0));
                result.put("KM_0002_02_24AVG", avgNum.avgNumDouble(KM_0002_02_24list));
                Boxplot boxplot = new Boxplot(KM_0002_02_24list);
                result.put("KM_0002_02_24MidNum",boxplot.getMedian());
                result.put("KM_0002_02_24FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_24TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_24UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_24DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_24", 0);

        if (KM_0002_02_25!=null)
        {
            result.put("KM_0002_02_25", KM_0002_02_25list.size());
            if (KM_0002_02_25list.size() != 0) {
                result.put("KM_0002_02_25Max", KM_0002_02_25list.get(KM_0002_02_25list.size() - 1));
                result.put("KM_0002_02_25Min", KM_0002_02_25list.get(0));
                result.put("KM_0002_02_25AVG", avgNum.avgNumDouble(KM_0002_02_25list));
                Boxplot boxplot = new Boxplot(KM_0002_02_25list);
                result.put("KM_0002_02_25MidNum",boxplot.getMedian());
                result.put("KM_0002_02_25FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_25TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_25UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_25DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_25", 0);

        if (KM_0002_02_26!=null)
        {
            result.put("KM_0002_02_26", KM_0002_02_26list.size());
            if (KM_0002_02_26list.size() != 0) {
                result.put("KM_0002_02_26Max", KM_0002_02_26list.get(KM_0002_02_26list.size() - 1));
                result.put("KM_0002_02_26Min", KM_0002_02_26list.get(0));
                result.put("KM_0002_02_26AVG", avgNum.avgNumDouble(KM_0002_02_26list));
                Boxplot boxplot = new Boxplot(KM_0002_02_26list);
                result.put("KM_0002_02_26MidNum",boxplot.getMedian());
                result.put("KM_0002_02_26FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_26TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_26UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_26DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_26", 0);

        if (KM_0002_02_27!=null)
        {
            result.put("KM_0002_02_27", KM_0002_02_27list.size());
            if (KM_0002_02_27list.size() != 0) {
                result.put("KM_0002_02_27Max", KM_0002_02_27list.get(KM_0002_02_27list.size() - 1));
                result.put("KM_0002_02_27Min", KM_0002_02_27list.get(0));
                result.put("KM_0002_02_27AVG", avgNum.avgNumDouble(KM_0002_02_27list));
                Boxplot boxplot = new Boxplot(KM_0002_02_27list);
                result.put("KM_0002_02_27MidNum",boxplot.getMedian());
                result.put("KM_0002_02_27FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_27TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_27UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_27DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_27", 0);

        if (KM_0002_02_28!=null)
        {
            result.put("KM_0002_02_28", KM_0002_02_28list.size());
            if (KM_0002_02_28list.size() != 0) {
                result.put("KM_0002_02_28Max", KM_0002_02_28list.get(KM_0002_02_28list.size() - 1));
                result.put("KM_0002_02_28Min", KM_0002_02_28list.get(0));
                result.put("KM_0002_02_28AVG", avgNum.avgNumDouble(KM_0002_02_28list));
                Boxplot boxplot = new Boxplot(KM_0002_02_28list);
                result.put("KM_0002_02_28MidNum",boxplot.getMedian());
                result.put("KM_0002_02_28FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_28TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_28UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_28DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_28", 0);

        if (KM_0002_02_29!=null)
        {
            result.put("KM_0002_02_29", KM_0002_02_29list.size());
            if (KM_0002_02_29list.size() != 0) {
                result.put("KM_0002_02_29Max", KM_0002_02_29list.get(KM_0002_02_29list.size() - 1));
                result.put("KM_0002_02_29Min", KM_0002_02_29list.get(0));
                result.put("KM_0002_02_29AVG", avgNum.avgNumDouble(KM_0002_02_29list));
                Boxplot boxplot = new Boxplot(KM_0002_02_29list);
                result.put("KM_0002_02_29MidNum",boxplot.getMedian());
                result.put("KM_0002_02_29FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_29TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_29UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_29DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_29", 0);

        if (KM_0002_02_30!=null)
        {
            result.put("KM_0002_02_30", KM_0002_02_30list.size());
            if (KM_0002_02_30list.size() != 0) {
                result.put("KM_0002_02_30Max", KM_0002_02_30list.get(KM_0002_02_30list.size() - 1));
                result.put("KM_0002_02_30Min", KM_0002_02_30list.get(0));
                result.put("KM_0002_02_30AVG", avgNum.avgNumDouble(KM_0002_02_30list));
                Boxplot boxplot = new Boxplot(KM_0002_02_30list);
                result.put("KM_0002_02_30MidNum",boxplot.getMedian());
                result.put("KM_0002_02_30FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_30TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_30UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_30DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_30", 0);

        if (KM_0002_02_31!=null)
        {
            result.put("KM_0002_02_31", KM_0002_02_31list.size());
            if (KM_0002_02_31list.size() != 0) {
                result.put("KM_0002_02_31Max", KM_0002_02_31list.get(KM_0002_02_31list.size() - 1));
                result.put("KM_0002_02_31Min", KM_0002_02_31list.get(0));
                result.put("KM_0002_02_31AVG", avgNum.avgNumDouble(KM_0002_02_31list));
                Boxplot boxplot = new Boxplot(KM_0002_02_31list);
                result.put("KM_0002_02_31MidNum",boxplot.getMedian());
                result.put("KM_0002_02_31FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_31TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_31UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_31DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_31", 0);

        if (KM_0002_02_32list!=null)
        {
            result.put("KM_0002_02_32", KM_0002_02_32list.size());
            if (KM_0002_02_32.size() != 0) {
                result.put("KM_0002_02_32Max", KM_0002_02_32list.get(KM_0002_02_32list.size() - 1));
                result.put("KM_0002_02_32Min", KM_0002_02_32list.get(0));
                result.put("KM_0002_02_32AVG", avgNum.avgNumDouble(KM_0002_02_32list));
                Boxplot boxplot = new Boxplot(KM_0002_02_32list);
                result.put("KM_0002_02_32MidNum",boxplot.getMedian());
                result.put("KM_0002_02_32FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_32TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_32UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_32DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_32", 0);

        if (KM_0002_02_33!=null)
        {
            result.put("KM_0002_02_33", KM_0002_02_33list.size());
            if (KM_0002_02_33list.size() != 0) {
                result.put("KM_0002_02_33Max", KM_0002_02_33list.get(KM_0002_02_33list.size() - 1));
                result.put("KM_0002_02_33Min", KM_0002_02_33list.get(0));
                result.put("KM_0002_02_33AVG", avgNum.avgNumDouble(KM_0002_02_33list));
                Boxplot boxplot = new Boxplot(KM_0002_02_33list);
                result.put("KM_0002_02_33MidNum",boxplot.getMedian());
                result.put("KM_0002_02_33FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_33TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_33UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_33DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_33", 0);

        if (KM_0002_02_34!=null)
        {
            result.put("KM_0002_02_34", KM_0002_02_34list.size());
            if (KM_0002_02_34list.size() != 0) {
                result.put("KM_0002_02_34Max", KM_0002_02_34list.get(KM_0002_02_34list.size() - 1));
                result.put("KM_0002_02_34Min", KM_0002_02_34list.get(0));
                result.put("KM_0002_02_34AVG", avgNum.avgNumDouble(KM_0002_02_34list));
                Boxplot boxplot = new Boxplot(KM_0002_02_34list);
                result.put("KM_0002_02_34MidNum",boxplot.getMedian());
                result.put("KM_0002_02_34FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_34TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_34UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_34DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_34", 0);

        if (KM_0002_02_35!=null)
        {
            result.put("KM_0002_02_35", KM_0002_02_35list.size());
            if (KM_0002_02_35list.size() != 0) {
                result.put("KM_0002_02_35Max", KM_0002_02_35list.get(KM_0002_02_35list.size() - 1));
                result.put("KM_0002_02_35Min", KM_0002_02_35list.get(0));
                result.put("KM_0002_02_35AVG", avgNum.avgNumDouble(KM_0002_02_35list));
                Boxplot boxplot = new Boxplot(KM_0002_02_35list);
                result.put("KM_0002_02_35MidNum",boxplot.getMedian());
                result.put("KM_0002_02_35FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_35TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_35UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_35DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_35", 0);

        if (KM_0002_02_36!=null)
        {
            result.put("KM_0002_02_36", KM_0002_02_36list.size());
            if (KM_0002_02_36list.size() != 0) {
                result.put("KM_0002_02_36Max", KM_0002_02_36list.get(KM_0002_02_36list.size() - 1));
                result.put("KM_0002_02_36Min", KM_0002_02_36list.get(0));
                result.put("KM_0002_02_36AVG", avgNum.avgNumDouble(KM_0002_02_36list));
                Boxplot boxplot = new Boxplot(KM_0002_02_36list);
                result.put("KM_0002_02_36MidNum",boxplot.getMedian());
                result.put("KM_0002_02_36FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_36TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_36UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_36DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_36", 0);

        if (KM_0002_02_37!=null)
        {
            result.put("KM_0002_02_37", KM_0002_02_37list.size());
            if (KM_0002_02_37list.size() != 0) {
                result.put("KM_0002_02_37Max", KM_0002_02_37list.get(KM_0002_02_37list.size() - 1));
                result.put("KM_0002_02_37Min", KM_0002_02_37list.get(0));
                result.put("KM_0002_02_37AVG", avgNum.avgNumDouble(KM_0002_02_37list));
                Boxplot boxplot = new Boxplot(KM_0002_02_37list);
                result.put("KM_0002_02_37MidNum",boxplot.getMedian());
                result.put("KM_0002_02_37FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_37TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_37UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_37DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_37", 0);

        if (KM_0002_02_38!=null)
        {
            result.put("KM_0002_02_38", KM_0002_02_38list.size());
            if (KM_0002_02_38list.size() != 0) {
                result.put("KM_0002_02_38Max", KM_0002_02_38list.get(KM_0002_02_38list.size() - 1));
                result.put("KM_0002_02_38Min", KM_0002_02_38list.get(0));
                result.put("KM_0002_02_38AVG", avgNum.avgNumDouble(KM_0002_02_38list));
                Boxplot boxplot = new Boxplot(KM_0002_02_38list);
                result.put("KM_0002_02_38MidNum",boxplot.getMedian());
                result.put("KM_0002_02_38FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_38TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_38UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_38DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_38", 0);

        if (KM_0002_02_39!=null)
        {
            result.put("KM_0002_02_39", KM_0002_02_39list.size());
            if (KM_0002_02_39list.size() != 0) {
                result.put("KM_0002_02_39Max", KM_0002_02_39list.get(KM_0002_02_39list.size() - 1));
                result.put("KM_0002_02_39Min", KM_0002_02_39list.get(0));
                result.put("KM_0002_02_39AVG", avgNum.avgNumDouble(KM_0002_02_39list));
                Boxplot boxplot = new Boxplot(KM_0002_02_39list);
                result.put("KM_0002_02_39MidNum",boxplot.getMedian());
                result.put("KM_0002_02_39FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_39TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_39UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_39DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_39", 0);

        if (KM_0002_02_40!=null)
        {
            result.put("KM_0002_02_40", KM_0002_02_40list.size());
            if (KM_0002_02_40list.size() != 0) {
                result.put("KM_0002_02_40Max", KM_0002_02_40list.get(KM_0002_02_40list.size() - 1));
                result.put("KM_0002_02_40Min", KM_0002_02_40list.get(0));
                result.put("KM_0002_02_40AVG", avgNum.avgNumDouble(KM_0002_02_40list));
                Boxplot boxplot = new Boxplot(KM_0002_02_40list);
                result.put("KM_0002_02_40MidNum",boxplot.getMedian());
                result.put("KM_0002_02_40FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_40TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_40UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_40DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_40", 0);

        if (KM_0002_02_41!=null)
        {
            result.put("KM_0002_02_41", KM_0002_02_41list.size());

            if (KM_0002_02_41list.size() != 0) {
                result.put("KM_0002_02_41Max", KM_0002_02_41list.get(KM_0002_02_41list.size() - 1));
                result.put("KM_0002_02_41Min", KM_0002_02_41list.get(0));
                result.put("KM_0002_02_41AVG", avgNum.avgNumDouble(KM_0002_02_41list));
                Boxplot boxplot = new Boxplot(KM_0002_02_41list);
                result.put("KM_0002_02_41MidNum",boxplot.getMedian());
                result.put("KM_0002_02_41FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_41TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_41UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_41DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_41", 0);

        if (KM_0002_02_42!=null)
        {
            result.put("KM_0002_02_42", KM_0002_02_42list.size());
            if (KM_0002_02_42list.size() != 0) {
                result.put("KM_0002_02_42Max", KM_0002_02_42list.get(KM_0002_02_42list.size() - 1));
                result.put("KM_0002_02_42Min", KM_0002_02_42list.get(0));
                result.put("KM_0002_02_42AVG", avgNum.avgNumDouble(KM_0002_02_42list));
                Boxplot boxplot = new Boxplot(KM_0002_02_42list);
                result.put("KM_0002_02_42MidNum",boxplot.getMedian());
                result.put("KM_0002_02_42FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_42TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_42UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_42DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_42", 0);

        if (TC_0001_00_1!=null)
            result.put("TC_0001_00_1", TC_0001_00_1.size());
        else
            result.put("TC_0001_00_1", 0);
        if (TC_0002_02_17!=null)
            result.put("TC_0002_02_17", TC_0002_02_17.size());
        else
            result.put("TC_0002_02_17", 0);
        if (TC_0002_02_18!=null)
        {
            result.put("TC_0002_02_18", TC_0002_02_18list.size());
            if (TC_0002_02_18list.size() != 0) {
                result.put("TC_0002_02_18Max", TC_0002_02_18list2.get(TC_0002_02_18list2.size() - 1));
                result.put("TC_0002_02_18Min", TC_0002_02_18list2.get(0));
                result.put("TC_0002_02_18AVG", avgNum.avgNumint(TC_0002_02_18list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_18list);
                result.put("TC_0002_02_18MidNum",boxplot.getMedian());
                result.put("TC_0002_02_18FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_18TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_18UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_18DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_18", 0);

        if (TC_0002_02_19!=null)
        {
            result.put("TC_0002_02_19", TC_0002_02_19list.size());
            if (TC_0002_02_19list.size() != 0) {
                result.put("TC_0002_02_19Max", TC_0002_02_19list2.get(TC_0002_02_19list2.size() - 1));
                result.put("TC_0002_02_19Min", TC_0002_02_19list2.get(0));
                result.put("TC_0002_02_19AVG", avgNum.avgNumint(TC_0002_02_19list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_19list);
                result.put("TC_0002_02_19MidNum",boxplot.getMedian());
                result.put("TC_0002_02_19FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_19TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_19UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_19DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_19", 0);

        if (TC_0002_02_20!=null)
        {
            result.put("TC_0002_02_20", TC_0002_02_20list.size());
            if (TC_0002_02_20list.size() != 0) {
                result.put("TC_0002_02_20Max", TC_0002_02_20list2.get(TC_0002_02_20list2.size() - 1));
                result.put("TC_0002_02_20Min", TC_0002_02_20list2.get(0));
                result.put("TC_0002_02_20AVG", avgNum.avgNumint(TC_0002_02_20list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_20list);
                result.put("TC_0002_02_20MidNum",boxplot.getMedian());
                result.put("TC_0002_02_20FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_20TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_20UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_20DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_20", TC_0002_02_20list.size());

        if (TC_0002_02_21!=null)
        {
            result.put("TC_0002_02_21", TC_0002_02_21list.size());
            if (TC_0002_02_21list.size() != 0) {
                result.put("TC_0002_02_21Max", TC_0002_02_21list2.get(TC_0002_02_21list2.size() - 1));
                result.put("TC_0002_02_21Min", TC_0002_02_21list2.get(0));
                result.put("TC_0002_02_21AVG", avgNum.avgNumint(TC_0002_02_21list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_21list);
                result.put("TC_0002_02_21MidNum",boxplot.getMedian());
                result.put("TC_0002_02_21FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_21TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_21UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_21DownLimit",boxplot.getDownLimit());
            }

        }else
            result.put("TC_0002_02_21", 0);

        if (TC_0002_02_22!=null)
        {
            result.put("TC_0002_02_22", TC_0002_02_22list.size());
            if (TC_0002_02_22list.size() != 0) {
                result.put("TC_0002_02_22Max", TC_0002_02_22list2.get(TC_0002_02_22list2.size() - 1));
                result.put("TC_0002_02_22Min", TC_0002_02_22list2.get(0));
                result.put("TC_0002_02_22AVG", avgNum.avgNumint(TC_0002_02_22list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_22list);
                result.put("TC_0002_02_22MidNum",boxplot.getMedian());
                result.put("TC_0002_02_22FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_22TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_22UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_22DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_22", 0);

        if (TC_0002_02_23!=null)
        {
            result.put("TC_0002_02_23", TC_0002_02_23list.size());
            if (TC_0002_02_23list.size() != 0) {
                result.put("TC_0002_02_23Max", TC_0002_02_23list2.get(TC_0002_02_23list2.size() - 1));
                result.put("TC_0002_02_23Min", TC_0002_02_23list2.get(0));
                result.put("TC_0002_02_23AVG", avgNum.avgNumint(TC_0002_02_23list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_23list);
                result.put("TC_0002_02_23MidNum",boxplot.getMedian());
                result.put("TC_0002_02_23FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_23TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_23UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_23DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_23", 0);


        if (TC_0002_02_24!=null)
        {
            result.put("TC_0002_02_24", TC_0002_02_24list.size());
            if (TC_0002_02_24list.size() != 0) {
                result.put("TC_0002_02_24Max", TC_0002_02_24list2.get(TC_0002_02_24list2.size() - 1));
                result.put("TC_0002_02_24Min", TC_0002_02_24list2.get(0));
                result.put("TC_0002_02_24AVG", avgNum.avgNumint(TC_0002_02_24list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_24list);
                result.put("TC_0002_02_24MidNum",boxplot.getMedian());
                result.put("TC_0002_02_24FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_24TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_24UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_24DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_24", 0);

        if (TC_0002_02_25!=null)
        {
            if (TC_0002_02_25list.size() != 0) {
                result.put("TC_0002_02_25Max", TC_0002_02_25list2.get(TC_0002_02_25list2.size() - 1));
                result.put("TC_0002_02_25Min", TC_0002_02_25list2.get(0));
                result.put("TC_0002_02_25AVG", avgNum.avgNumint(TC_0002_02_25list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_25list);
                result.put("TC_0002_02_25MidNum",boxplot.getMedian());
                result.put("TC_0002_02_25FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_25TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_25UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_25DownLimit",boxplot.getDownLimit());
            }
            result.put("TC_0002_02_25", TC_0002_02_25list.size());
        }else
            result.put("TC_0002_02_25", 0);


        if (TC_0002_02_26!=null)
        {
            result.put("TC_0002_02_26", TC_0002_02_26list.size());
            if (TC_0002_02_27list.size() != 0) {
                result.put("TC_0002_02_26Max", TC_0002_02_26list2.get(TC_0002_02_26list2.size() - 1));
                result.put("TC_0002_02_26Min", TC_0002_02_26list2.get(0));
                result.put("TC_0002_02_26AVG", avgNum.avgNumint(TC_0002_02_26list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_26list);
                result.put("TC_0002_02_26MidNum",boxplot.getMedian());
                result.put("TC_0002_02_26FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_26TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_26UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_26DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_26", 0);


        if (TC_0002_02_27!=null)
        {
            result.put("TC_0002_02_27", TC_0002_02_27list.size());
            if (TC_0002_02_28list.size() != 0) {
                result.put("TC_0002_02_27Max", TC_0002_02_27list2.get(TC_0002_02_27list2.size() - 1));
                result.put("TC_0002_02_27Min", TC_0002_02_27list2.get(0));
                result.put("TC_0002_02_27AVG", avgNum.avgNumint(TC_0002_02_27list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_27list);
                result.put("TC_0002_02_27MidNum",boxplot.getMedian());
                result.put("TC_0002_02_27FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_27TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_27UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_27DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_27", 0);


        if (TC_0002_02_28!=null)
        {
            result.put("TC_0002_02_28", TC_0002_02_28list.size());
            if (TC_0002_02_28list.size() != 0) {
                result.put("TC_0002_02_28Max", TC_0002_02_28list2.get(TC_0002_02_28list2.size() - 1));
                result.put("TC_0002_02_28Min", TC_0002_02_28list2.get(0));
                result.put("TC_0002_02_28AVG", avgNum.avgNumint(TC_0002_02_28list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_28list);
                result.put("TC_0002_02_28MidNum",boxplot.getMedian());
                result.put("TC_0002_02_28FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_28TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_28UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_28DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_28", 0);

        if (TC_0002_02_29!=null)
        {
            result.put("TC_0002_02_29", TC_0002_02_29list.size());
            if (TC_0002_02_29list.size() != 0) {
                result.put("TC_0002_02_29Max", TC_0002_02_29list2.get(TC_0002_02_29list2.size() - 1));
                result.put("TC_0002_02_29Min", TC_0002_02_29list2.get(0));
                result.put("TC_0002_02_29AVG", avgNum.avgNumint(TC_0002_02_29list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_29list);
                result.put("TC_0002_02_29MidNum",boxplot.getMedian());
                result.put("TC_0002_02_29FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_29TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_29UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_29DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_29", 0);

        if (TC_0002_02_30!=null)
        {
            result.put("TC_0002_02_30", TC_0002_02_30list.size());
            if (TC_0002_02_30list.size() != 0) {
                result.put("TC_0002_02_30Max", TC_0002_02_30list2.get(TC_0002_02_30list2.size() - 1));
                result.put("TC_0002_02_30Min", TC_0002_02_30list2.get(0));
                result.put("TC_0002_02_30AVG", avgNum.avgNumint(TC_0002_02_30list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_30list);
                result.put("TC_0002_02_30MidNum",boxplot.getMedian());
                result.put("TC_0002_02_30FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_30TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_30UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_30DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_30", 0);

        if (TC_0002_02_31!=null)
        {
            result.put("TC_0002_02_31", TC_0002_02_31list.size());
            if (TC_0002_02_31list.size() != 0) {
                result.put("TC_0002_02_31Max", TC_0002_02_31list2.get(TC_0002_02_31list2.size() - 1));
                result.put("TC_0002_02_31Min", TC_0002_02_31list2.get(0));
                result.put("TC_0002_02_31AVG", avgNum.avgNumint(TC_0002_02_31list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_31list);
                result.put("TC_0002_02_31MidNum",boxplot.getMedian());
                result.put("TC_0002_02_31FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_31TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_31UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_31DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_31", 0);


        if (TC_0002_02_32!=null)
        {
            result.put("TC_0002_02_32", TC_0002_02_32list.size());

            if (TC_0002_02_32list.size() != 0) {
                result.put("TC_0002_02_32Max", TC_0002_02_32list2.get(TC_0002_02_32list2.size() - 1));
                result.put("TC_0002_02_32Min", TC_0002_02_32list2.get(0));
                result.put("TC_0002_02_32AVG", avgNum.avgNumint(TC_0002_02_32list2));
                Boxplot boxplot = new Boxplot(TC_0002_02_32list);
                result.put("TC_0002_02_32MidNum",boxplot.getMedian());
                result.put("TC_0002_02_32FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_32TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_32UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_32DownLimit",boxplot.getDownLimit());
            }
        }

        if (TC_0002_02_33!=null)
            result.put("TC_0002_02_33", TC_0002_02_33.size());
        if (TC_0002_02_34 == null)
            result.put("TC_0002_02_34", 0);
        else
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_34.size();i++)
            {
                if (TC_0002_02_34.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_34", TC_0002_02_34.size());
            result.put("TC_0002_02_34Alarm",KeyOnTime.size());
        }


        if (TC_0002_02_35!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_35.size();i++)
            {
                if (TC_0002_02_35.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_35", TC_0002_02_35.size());
            result.put("TC_0002_02_35Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_35", 0);

        if (TC_0002_02_36!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_36.size();i++)
            {
                if (TC_0002_02_36.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_36", TC_0002_02_36.size());
            result.put("TC_0002_02_36Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_36", 0);

        if (TC_0002_02_37!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_37.size();i++)
            {
                if (TC_0002_02_37.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_37", TC_0002_02_37.size());
            result.put("TC_0002_02_37Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_37", 0);

        if (TC_0002_02_38!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_38.size();i++)
            {
                if (TC_0002_02_38.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_38", TC_0002_02_38.size());
            result.put("TC_0002_02_38Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_38", 0);

        if (TC_0002_02_39!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_39.size();i++)
            {
                if (TC_0002_02_39.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_39", TC_0002_02_39.size());
            result.put("TC_0002_02_39Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_39", 0);

        if (TC_0002_02_40!=null)
        {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_40.size();i++)
            {
                if (TC_0002_02_40.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_40", TC_0002_02_40.size());
            result.put("TC_0002_02_40Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_40", 0);

        if (TC_0002_02_41!=null) {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_41.size();i++)
            {
                if (TC_0002_02_41.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_41", TC_0002_02_41.size());
            result.put("TC_0002_02_41Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_41", 0);

        if (TC_0002_02_42!=null) {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_42.size();i++)
            {
                if (TC_0002_02_42.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_42", TC_0002_02_42.size());
            result.put("TC_0002_02_42Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_42", 0);

        if (TC_0002_02_43!=null) {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_43.size();i++)
            {
                if (TC_0002_02_43.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_43", TC_0002_02_43.size());
            result.put("TC_0002_02_43Alarm",KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_43", 0);

        if (TC_0002_02_44!=null) {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_44.size();i++)
            {
                if (TC_0002_02_44.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_44", TC_0002_02_44.size());
            result.put("TC_0002_02_44Alarm", KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_44", 0);

        if (TC_0002_02_45!=null) {
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_45.size();i++)
            {
                if (TC_0002_02_45.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_45", TC_0002_02_45.size());
            result.put("TC_0002_02_45Alarm", KeyOnTime.size());
        }
        else
            result.put("TC_0002_02_45", 0);

        if (TC_0002_02_46!=null){
            List<Integer> onenum = new ArrayList<>();
            List<Integer> onenum2 = new ArrayList<>();
            List<List<Integer>> KeyOnTime = new ArrayList<>();
            for (int i=0;i<TC_0002_02_46.size();i++)
            {
                if (TC_0002_02_46.get(i).getValue().equals("1"))
                    onenum.add(i);
            }
            if (onenum.size()>0)
            {
                AlarmNum alarmNum = new AlarmNum();
                Arrays array = new Arrays();
                int[][] arrays = alarmNum.AlarmNum(array.Sub(onenum));
                for (int i = 0; i < arrays.length; i++) {
                    onenum2 = Ints.asList(arrays[i]);
                    List arrList = new ArrayList(onenum2);
                    Remove remove = new Remove();
                    remove.RemoveList(arrList);
                    if (arrList.size() > 0)
                        KeyOnTime.add(arrList);
                }
            }
            result.put("TC_0002_02_46", TC_0002_02_46.size());
            result.put("TC_0002_02_46Alarm", KeyOnTime.size());
        }

        else
            result.put("TC_0002_02_46", 0);

        if (TC_0002_02_47!=null)
            result.put("TC_0002_02_47", TC_0002_02_47.size());
        else
            result.put("TC_0002_02_47", 0);

        if (TC_0002_02_48!=null)
            result.put("TC_0002_02_48", TC_0002_02_48.size());
        else
            result.put("TC_0002_02_48", 0);

        if (TC_0002_02_49!=null)
            result.put("TC_0002_02_49", TC_0002_02_49.size());
        else
            result.put("TC_0002_02_49", 0);

        if (TC_0002_02_57!=null)
            result.put("TC_0002_02_57", TC_0002_02_57.size());
        else
            result.put("TC_0002_02_57", 0);

        if (TC_0002_00_01.size()>0||TC_0002_00_01!=null)
            result.put("SourceNum",TC_0002_00_01.size());
        outputSql.add(result);

    }
}
