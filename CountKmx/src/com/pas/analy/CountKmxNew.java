package com.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountKmxNew extends UserFunction {
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
        List<IntPoint> KM_0002_02_13 = intInput.get(deviceID).get("KM_0002_02_13");
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
        List<FloatPoint> oil = floatInput.get(deviceID).get("KM_0002_02_03");
        List<StringPoint> work = stringInput.get(deviceID).get("KM_0002_02_13");
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
        List<Double> KM_0002_02_01list = new ArrayList<>();
        List<Double> KM_0002_02_01listNew = new ArrayList<>();
        List<Double> KM_0002_02_02list = new ArrayList<>();
        List<Double> KM_0002_02_02listNew = new ArrayList<>();
        List<Double> KM_0002_02_03list = new ArrayList<>();
        List<Double> KM_0002_02_03listNew = new ArrayList<>();
        List<Double> KM_0002_02_04list = new ArrayList<>();
        List<Double> KM_0002_02_04listNew = new ArrayList<>();
        List<Double> KM_0002_02_05list = new ArrayList<>();
        List<Double> KM_0002_02_05listNew = new ArrayList<>();
        List<Double> KM_0002_02_06list = new ArrayList<>();
        List<Double> KM_0002_02_06listNew = new ArrayList<>();
        List<Double> KM_0002_02_07list = new ArrayList<>();
        List<Double> KM_0002_02_07listNew = new ArrayList<>();
        List<Double> KM_0002_02_08list = new ArrayList<>();
        List<Double> KM_0002_02_08listNew = new ArrayList<>();
        List<Double> KM_0002_02_09list = new ArrayList<>();
        List<Double> KM_0002_02_09listNew = new ArrayList<>();
        List<Double> KM_0002_02_10list = new ArrayList<>();
        List<Double> KM_0002_02_10listNew = new ArrayList<>();
        List<Double> KM_0002_02_17list = new ArrayList<>();
        List<Double> KM_0002_02_17listNew = new ArrayList<>();
        List<Double> KM_0002_02_20list = new ArrayList<>();
        List<Double> KM_0002_02_20listNew = new ArrayList<>();
        List<Double> KM_0002_02_21list = new ArrayList<>();
        List<Double> KM_0002_02_21listNew = new ArrayList<>();
        List<Double> KM_0002_02_22list = new ArrayList<>();
        List<Double> KM_0002_02_22listNew = new ArrayList<>();
        List<Double> KM_0002_02_23list = new ArrayList<>();
        List<Double> KM_0002_02_23listNew = new ArrayList<>();
        List<Double> KM_0002_02_24list = new ArrayList<>();
        List<Double> KM_0002_02_24listNew = new ArrayList<>();
        List<Double> KM_0002_02_25list = new ArrayList<>();
        List<Double> KM_0002_02_25listNew = new ArrayList<>();
        List<Double> KM_0002_02_26list = new ArrayList<>();
        List<Double> KM_0002_02_26listNew = new ArrayList<>();
        List<Double> KM_0002_02_27list = new ArrayList<>();
        List<Double> KM_0002_02_27listNew = new ArrayList<>();
        List<Double> KM_0002_02_28list = new ArrayList<>();
        List<Double> KM_0002_02_28listNew = new ArrayList<>();
        List<Double> KM_0002_02_29list = new ArrayList<>();
        List<Double> KM_0002_02_29listNew = new ArrayList<>();
        List<Double> KM_0002_02_30list = new ArrayList<>();
        List<Double> KM_0002_02_30listNew = new ArrayList<>();
        List<Double> KM_0002_02_31list = new ArrayList<>();
        List<Double> KM_0002_02_31listNew = new ArrayList<>();
        List<Double> KM_0002_02_32list = new ArrayList<>();
        List<Double> KM_0002_02_32listNew = new ArrayList<>();
        List<Double> KM_0002_02_33list = new ArrayList<>();
        List<Double> KM_0002_02_33listNew = new ArrayList<>();
        List<Double> KM_0002_02_34list = new ArrayList<>();
        List<Double> KM_0002_02_34listNew = new ArrayList<>();
        List<Double> KM_0002_02_35list = new ArrayList<>();
        List<Double> KM_0002_02_35listNew = new ArrayList<>();
        List<Double> KM_0002_02_36list = new ArrayList<>();
        List<Double> KM_0002_02_36listNew = new ArrayList<>();
        List<Double> KM_0002_02_37list = new ArrayList<>();
        List<Double> KM_0002_02_37listNew = new ArrayList<>();
        List<Double> KM_0002_02_38list = new ArrayList<>();
        List<Double> KM_0002_02_38listNew = new ArrayList<>();
        List<Double> KM_0002_02_39list = new ArrayList<>();
        List<Double> KM_0002_02_39listNew = new ArrayList<>();
        List<Double> KM_0002_02_40list = new ArrayList<>();
        List<Double> KM_0002_02_40listNew = new ArrayList<>();
        List<Double> KM_0002_02_41list = new ArrayList<>();
        List<Double> KM_0002_02_41listNew = new ArrayList<>();
        List<Double> KM_0002_02_42list = new ArrayList<>();
        List<Double> KM_0002_02_42listNew = new ArrayList<>();
        List<Double> TC_0002_02_18list = new ArrayList<>();
        List<Double> TC_0002_02_18listNew = new ArrayList<>();
        List<Double> TC_0002_02_19list = new ArrayList<>();
        List<Double> TC_0002_02_19listNew = new ArrayList<>();
        List<Double> TC_0002_02_20list = new ArrayList<>();
        List<Double> TC_0002_02_20listNew = new ArrayList<>();
        List<Double> TC_0002_02_21list = new ArrayList<>();
        List<Double> TC_0002_02_21listNew = new ArrayList<>();
        List<Double> TC_0002_02_22list = new ArrayList<>();
        List<Double> TC_0002_02_22listNew = new ArrayList<>();
        List<Double> TC_0002_02_23list = new ArrayList<>();
        List<Double> TC_0002_02_23listNew = new ArrayList<>();
        List<Double> TC_0002_02_24list = new ArrayList<>();
        List<Double> TC_0002_02_24listNew = new ArrayList<>();
        List<Double> TC_0002_02_25list = new ArrayList<>();
        List<Double> TC_0002_02_25listNew = new ArrayList<>();
        List<Double> TC_0002_02_26list = new ArrayList<>();
        List<Double> TC_0002_02_26listNew = new ArrayList<>();
        List<Double> TC_0002_02_27list = new ArrayList<>();
        List<Double> TC_0002_02_27listNew = new ArrayList<>();
        List<Double> TC_0002_02_28list = new ArrayList<>();
        List<Double> TC_0002_02_28listNew = new ArrayList<>();
        List<Double> TC_0002_02_29list = new ArrayList<>();
        List<Double> TC_0002_02_29listNew = new ArrayList<>();
        List<Double> TC_0002_02_30list = new ArrayList<>();
        List<Double> TC_0002_02_30listNew = new ArrayList<>();
        List<Double> TC_0002_02_31list = new ArrayList<>();
        List<Double> TC_0002_02_31listNew = new ArrayList<>();
        List<Double> TC_0002_02_32list = new ArrayList<>();
        List<Double> TC_0002_02_32listNew = new ArrayList<>();
        LongToDate longToDate = new LongToDate();
        String date="";
        date = longToDate.timeStamp2Date(String.valueOf(timeLong2.get(0)), "yyyy-MM-dd");
        for (int i = 0; i < timeLong2.size(); i++) {
            List<AbstractPoint> listpoint = resultMap.get(timeLong2.get(i));
            if (listpoint != null) {
                for (AbstractPoint ap : listpoint) {
                    if (ap.getMetric().equals("KM_0002_02_01")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_01list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_02")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_02list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_03")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_03list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_04")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_04list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_05")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_05list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_06")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_06list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_07")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_07list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_08")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_08list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_09")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_09list.add(d);

                    }
                    if (ap.getMetric().equals("KM_0002_02_10")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_10list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_17")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        KM_0002_02_17list.add(d);
                    }
                    if (ap.getMetric().equals("KM_0002_02_20")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_20list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_21")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_21list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_22")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_22list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_23")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_23list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_24")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_24list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_25")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_25list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_26")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_26list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_27")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_27list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_28")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_28list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_29")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_29list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_30")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_30list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_31")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_31list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_32")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_32list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_33")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_33list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_34")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_34list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_35")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_35list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_36")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_36list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_37")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_37list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_38")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_38list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_39")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_39list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_40")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_40list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_41")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_41list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("KM_0002_02_42")) {
                        DoublePoint ap2 = (DoublePoint) ap;
                        KM_0002_02_42list.add(ap2.getValue());
                    }
                    if (ap.getMetric().equals("TC_0002_02_18")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_18list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_19")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_19list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_20")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_20list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_21")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_21list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_22")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_22list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_23")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_23list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_24")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_24list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_25")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_25list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_26")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_26list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_27")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_27list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_28")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_28list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_29")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_29list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_30")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_30list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_31")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_31list.add(d);
                    }
                    if (ap.getMetric().equals("TC_0002_02_32")) {
                        IntPoint ap2 = (IntPoint) ap;
                        BigDecimal b = new BigDecimal(String.valueOf(ap2.getValue()));
                        double d = b.doubleValue();
                        TC_0002_02_32list.add(d);
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
        for (FloatPoint one:oil){
            oils.add(Double.valueOf(one.getValue()));
            oilTimes.add(one.getPrimaryTime());
        }
        CoutOil coutOil = new CoutOil();
        coutOil.Calculation(oilTimes,oils);
        System.out.println(coutOil.getAllOil());

        List<Integer>works = new ArrayList<>();
        List<Long>workTimes = new ArrayList<>();
        for (StringPoint one:work){
            works.add(Integer.parseInt(one.getValue()));
            workTimes.add(one.getPrimaryTime());
        }
        CoutWorkTime coutWorkTime = new CoutWorkTime();
        coutWorkTime.Calculation(workTimes,works);
        System.out.println(coutWorkTime.getHourB_P()+" "+coutWorkTime.getHourE()+" "+coutWorkTime.getHourL());
        AvgNumNew avgNum = new AvgNumNew();

        MinNum minNum = new MinNum();

        result.put("Vcl_ID", deviceID);
        result.put("MsgTime", date);
        if (KM_0002_02_01 != null) {
            if (KM_0002_02_01.size() != 0) {
                Boxplot boxplot = new Boxplot(KM_0002_02_01list);
                result.put("KM_0002_02_01Max", KM_0002_02_01list.get(KM_0002_02_01list.size() - 1));
                result.put("KM_0002_02_01Min", minNum.minNumDouble(KM_0002_02_01list,KM_0002_02_01listNew).get(0));
                result.put("KM_0002_02_01AVG", avgNum.avgNumDouble(KM_0002_02_01list));
                result.put("KM_0002_02_01MidNum",boxplot.getMedian());
                result.put("KM_0002_02_01FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_01TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_01UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_01DownLimit",boxplot.getDownLimit());
            }
            result.put("KM_0002_02_01", KM_0002_02_01.size());
        }
        else
            result.put("KM_0002_02_01", 0);

        if (KM_0002_02_02 != null) {
            if (KM_0002_02_02.size()!=0)
            {
                Boxplot boxplot = new Boxplot(KM_0002_02_02list);
                result.put("KM_0002_02_02Max", KM_0002_02_02list.get(KM_0002_02_02list.size() - 1));
                result.put("KM_0002_02_02Min", minNum.minNumDouble(KM_0002_02_02list,KM_0002_02_02listNew).get(0));
                result.put("KM_0002_02_02AVG", avgNum.avgNumDouble(KM_0002_02_02list));
                result.put("KM_0002_02_02MidNum",boxplot.getMedian());
                result.put("KM_0002_02_02FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_02TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_02UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_02DownLimit",boxplot.getDownLimit());
            }
            result.put("KM_0002_02_02", KM_0002_02_02.size());

        }else
            result.put("KM_0002_02_02", 0);

        if (KM_0002_02_03!=null)
        {
            if (KM_0002_02_03.size()!=0)
            {
                Boxplot boxplot = new Boxplot(KM_0002_02_03list);
                result.put("KM_0002_02_03Max", KM_0002_02_03list.get(KM_0002_02_03list.size() - 1));
                result.put("KM_0002_02_03Min", minNum.minNumDouble(KM_0002_02_03list,KM_0002_02_03listNew).get(0));
                result.put("KM_0002_02_03AVG", avgNum.avgNumDouble(KM_0002_02_03list));
                result.put("KM_0002_02_03MidNum",boxplot.getMedian());
                result.put("KM_0002_02_03FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_03TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_03UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_03DownLimit",boxplot.getDownLimit());
                result.put("Oil",coutOil.getAllOil());
            }
            result.put("KM_0002_02_03", KM_0002_02_03.size());
        }else
            result.put("KM_0002_02_03", 0);

        if (KM_0002_02_04!=null)
        {
            if (KM_0002_02_04.size() != 0) {
                result.put("KM_0002_02_04Max", KM_0002_02_04list.get(KM_0002_02_04list.size() - 1));
                result.put("KM_0002_02_04Min", minNum.minNumDouble(KM_0002_02_04list,KM_0002_02_04listNew).get(0));
                result.put("KM_0002_02_04AVG", avgNum.avgNumDouble(KM_0002_02_04list));
                Boxplot boxplot = new Boxplot(KM_0002_02_04list);
                result.put("KM_0002_02_04MidNum",boxplot.getMedian());
                result.put("KM_0002_02_04FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_04TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_04UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_04DownLimit",boxplot.getDownLimit());
            }
            result.put("KM_0002_02_04", KM_0002_02_04.size());
        }else
            result.put("KM_0002_02_04", 0);

        if (KM_0002_02_05!=null)
        {
            result.put("KM_0002_02_05", KM_0002_02_05.size());
            if (KM_0002_02_05.size() != 0) {
                result.put("KM_0002_02_05Max", KM_0002_02_05list.get(KM_0002_02_05list.size() - 1));
                result.put("KM_0002_02_05Min", minNum.minNumDouble(KM_0002_02_05list,KM_0002_02_05listNew).get(0));
                result.put("KM_0002_02_05AVG", avgNum.avgNumDouble(KM_0002_02_05list));
                Boxplot boxplot = new Boxplot(KM_0002_02_05list);
                result.put("KM_0002_02_05MidNum",boxplot.getMedian());
                result.put("KM_0002_02_05FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_05TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_05UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_05DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_05", 0);

        if (KM_0002_02_06!=null)
        {
            result.put("KM_0002_02_06", KM_0002_02_06.size());
            if (KM_0002_02_06.size() != 0) {
                result.put("KM_0002_02_06Max", KM_0002_02_06list.get(KM_0002_02_06list.size() - 1));
                result.put("KM_0002_02_06Min", minNum.minNumDouble(KM_0002_02_06list,KM_0002_02_06listNew).get(0));
                result.put("KM_0002_02_06AVG", avgNum.avgNumDouble(KM_0002_02_06list));
                Boxplot boxplot = new Boxplot(KM_0002_02_06list);
                result.put("KM_0002_02_06MidNum",boxplot.getMedian());
                result.put("KM_0002_02_06FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_06TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_06UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_06DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_06", 0);

        if (KM_0002_02_07!=null)
        {
            if (KM_0002_02_07.size() != 0) {
                result.put("KM_0002_02_07Max", KM_0002_02_07list.get(KM_0002_02_07list.size() - 1));
                result.put("KM_0002_02_07Min", minNum.minNumDouble(KM_0002_02_07list,KM_0002_02_07listNew).get(0));
                result.put("KM_0002_02_07AVG", avgNum.avgNumDouble(KM_0002_02_07list));
                Boxplot boxplot = new Boxplot(KM_0002_02_07list);
                result.put("KM_0002_02_07MidNum",boxplot.getMedian());
                result.put("KM_0002_02_07FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_07TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_07UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_07DownLimit",boxplot.getDownLimit());
            }
            result.put("KM_0002_02_07", KM_0002_02_07.size());
        }else
            result.put("KM_0002_02_07", 0);


        if (KM_0002_02_08!=null)
        {
            result.put("KM_0002_02_08", KM_0002_02_08.size());
            if (KM_0002_02_08.size() != 0) {
                result.put("KM_0002_02_08Max", KM_0002_02_08list.get(KM_0002_02_08list.size() - 1));
                result.put("KM_0002_02_08Min", minNum.minNumDouble(KM_0002_02_08list,KM_0002_02_08listNew).get(0));
                result.put("KM_0002_02_08AVG", avgNum.avgNumDouble(KM_0002_02_08list));
                Boxplot boxplot = new Boxplot(KM_0002_02_08list);
                result.put("KM_0002_02_08MidNum",boxplot.getMedian());
                result.put("KM_0002_02_08FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_08TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_08UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_08DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_08", 0);


        if (KM_0002_02_09!=null)
        {
            result.put("KM_0002_02_09", KM_0002_02_09.size());
            if (KM_0002_02_09.size() != 0) {
                result.put("KM_0002_02_09Max", KM_0002_02_09list.get(KM_0002_02_09list.size() - 1));
                result.put("KM_0002_02_09Min", minNum.minNumDouble(KM_0002_02_09list,KM_0002_02_09listNew).get(0));
                result.put("KM_0002_02_09AVG", avgNum.avgNumDouble(KM_0002_02_09list));
                Boxplot boxplot = new Boxplot(KM_0002_02_09list);
                result.put("KM_0002_02_09MidNum",boxplot.getMedian());
                result.put("KM_0002_02_09FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_09TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_09UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_09DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("KM_0002_02_09", 0);


        if (KM_0002_02_10!=null)
        {
            result.put("KM_0002_02_10", KM_0002_02_10.size());
            if (KM_0002_02_10.size() != 0) {
                result.put("KM_0002_02_10Max", KM_0002_02_10list.get(KM_0002_02_10list.size() - 1));
                result.put("KM_0002_02_10Min", minNum.minNumDouble(KM_0002_02_10list,KM_0002_02_10listNew).get(0));
                result.put("KM_0002_02_10AVG", avgNum.avgNumDouble(KM_0002_02_10list));
                Boxplot boxplot = new Boxplot(KM_0002_02_10list);
                result.put("KM_0002_02_10MidNum",boxplot.getMedian());
                result.put("KM_0002_02_10FQtiles",boxplot.getFirstQuantiles());
                result.put("KM_0002_02_10TQtiles",boxplot.getThirdQuantiles());
                result.put("KM_0002_02_10UpLimit",boxplot.getUpLimit());
                result.put("KM_0002_02_10DownLimit",boxplot.getDownLimit());
            }
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
            result.put("KM_0002_02_13", KM_0002_02_13.size());
            result.put("B_Pmodel",coutWorkTime.getHourB_P());
            result.put("Emodel",coutWorkTime.getHourE());
            result.put("Lmodel",coutWorkTime.getHourE());
        }
        else
            result.put("KM_0002_02_13",0);

        if (KM_0002_02_14!=null)
            result.put("KM_0002_02_14", KM_0002_02_14.size());
        else
            result.put("KM_0002_02_14", 0);

        if (KM_0002_02_16!=null)
            result.put("KM_0002_02_16", KM_0002_02_16.size());
        else
            result.put("KM_0002_02_16", 0);

        if (KM_0002_02_17!=null)
        {
            result.put("KM_0002_02_17", KM_0002_02_17.size());
            if (KM_0002_02_17.size() != 0) {
                result.put("KM_0002_02_17Max", KM_0002_02_17list.get(KM_0002_02_17list.size() - 1));
                result.put("KM_0002_02_17Min", minNum.minNumDouble(KM_0002_02_17list,KM_0002_02_17listNew).get(0));
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
            result.put("KM_0002_02_18", KM_0002_02_18.size());
        else
            result.put("KM_0002_02_18", 0);

        if (KM_0002_02_19!=null)
            result.put("KM_0002_02_19", KM_0002_02_19.size());
        else
            result.put("KM_0002_02_19", 0);

        if (KM_0002_02_20!=null)
        {
            result.put("KM_0002_02_20", KM_0002_02_20.size());
            if (KM_0002_02_20.size() != 0) {
                result.put("KM_0002_02_20Max", KM_0002_02_20list.get(KM_0002_02_20list.size() - 1));
                result.put("KM_0002_02_20Min", minNum.minNumDouble(KM_0002_02_20list,KM_0002_02_20listNew).get(0));
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
            result.put("KM_0002_02_21", KM_0002_02_21.size());
            if (KM_0002_02_21.size() != 0) {
                result.put("KM_0002_02_21Max", KM_0002_02_21list.get(KM_0002_02_21list.size() - 1));
                result.put("KM_0002_02_21Min", minNum.minNumDouble(KM_0002_02_21list,KM_0002_02_21listNew).get(0));
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
            result.put("KM_0002_02_22", KM_0002_02_22.size());
            if (KM_0002_02_22.size() != 0) {
                result.put("KM_0002_02_22Max", KM_0002_02_22list.get(KM_0002_02_22list.size() - 1));
                result.put("KM_0002_02_22Min", minNum.minNumDouble(KM_0002_02_22list,KM_0002_02_22listNew).get(0));
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
            result.put("KM_0002_02_23", KM_0002_02_23.size());
            if (KM_0002_02_23.size() != 0) {
                result.put("KM_0002_02_23Max", KM_0002_02_23list.get(KM_0002_02_23list.size() - 1));
                result.put("KM_0002_02_23Min", minNum.minNumDouble(KM_0002_02_23list,KM_0002_02_23listNew).get(0));
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
            result.put("KM_0002_02_24", KM_0002_02_24.size());
            if (KM_0002_02_24.size() != 0) {
                result.put("KM_0002_02_24Max", KM_0002_02_24list.get(KM_0002_02_24list.size() - 1));
                result.put("KM_0002_02_24Min", minNum.minNumDouble(KM_0002_02_24list,KM_0002_02_24listNew).get(0));
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
            result.put("KM_0002_02_25", KM_0002_02_25.size());
            if (KM_0002_02_25.size() != 0) {
                result.put("KM_0002_02_25Max", KM_0002_02_25list.get(KM_0002_02_25list.size() - 1));
                result.put("KM_0002_02_25Min", minNum.minNumDouble(KM_0002_02_25list,KM_0002_02_25listNew).get(0));
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
            result.put("KM_0002_02_26", KM_0002_02_26.size());
            if (KM_0002_02_26.size() != 0) {
                result.put("KM_0002_02_26Max", KM_0002_02_26list.get(KM_0002_02_26list.size() - 1));
                result.put("KM_0002_02_26Min", minNum.minNumDouble(KM_0002_02_26list,KM_0002_02_26listNew).get(0));
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
            result.put("KM_0002_02_27", KM_0002_02_27.size());
            if (KM_0002_02_27.size() != 0) {
                result.put("KM_0002_02_27Max", KM_0002_02_27list.get(KM_0002_02_27list.size() - 1));
                result.put("KM_0002_02_27Min", minNum.minNumDouble(KM_0002_02_27list,KM_0002_02_27listNew).get(0));
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
            result.put("KM_0002_02_28", KM_0002_02_28.size());
            if (KM_0002_02_28.size() != 0) {
                result.put("KM_0002_02_28Max", KM_0002_02_28list.get(KM_0002_02_28list.size() - 1));
                result.put("KM_0002_02_28Min", minNum.minNumDouble(KM_0002_02_28list,KM_0002_02_28listNew).get(0));
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
            result.put("KM_0002_02_29", KM_0002_02_29.size());
            if (KM_0002_02_29.size() != 0) {
                result.put("KM_0002_02_29Max", KM_0002_02_29list.get(KM_0002_02_29list.size() - 1));
                result.put("KM_0002_02_29Min", minNum.minNumDouble(KM_0002_02_29list,KM_0002_02_29listNew).get(0));
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
            result.put("KM_0002_02_30", KM_0002_02_30.size());
            if (KM_0002_02_30.size() != 0) {
                result.put("KM_0002_02_30Max", KM_0002_02_30list.get(KM_0002_02_30list.size() - 1));
                result.put("KM_0002_02_30Min", minNum.minNumDouble(KM_0002_02_30list,KM_0002_02_30listNew).get(0));
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
            result.put("KM_0002_02_31", KM_0002_02_31.size());
            if (KM_0002_02_31.size() != 0) {
                result.put("KM_0002_02_31Max", KM_0002_02_31list.get(KM_0002_02_31list.size() - 1));
                result.put("KM_0002_02_31Min", minNum.minNumDouble(KM_0002_02_31list,KM_0002_02_31listNew).get(0));
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

        if (KM_0002_02_32!=null)
        {
            result.put("KM_0002_02_32", KM_0002_02_32.size());
            if (KM_0002_02_32.size() != 0) {
                result.put("KM_0002_02_32Max", KM_0002_02_32list.get(KM_0002_02_32list.size() - 1));
                result.put("KM_0002_02_32Min", minNum.minNumDouble(KM_0002_02_32list,KM_0002_02_32listNew).get(0));
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
            result.put("KM_0002_02_33", KM_0002_02_33.size());
            if (KM_0002_02_33.size() != 0) {
                result.put("KM_0002_02_33Max", KM_0002_02_33list.get(KM_0002_02_33list.size() - 1));
                result.put("KM_0002_02_33Min", minNum.minNumDouble(KM_0002_02_33list,KM_0002_02_33listNew).get(0));
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
            result.put("KM_0002_02_34", KM_0002_02_34.size());
            if (KM_0002_02_34.size() != 0) {
                result.put("KM_0002_02_34Max", KM_0002_02_34list.get(KM_0002_02_34list.size() - 1));
                result.put("KM_0002_02_34Min", minNum.minNumDouble(KM_0002_02_34list,KM_0002_02_34listNew).get(0));
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
            result.put("KM_0002_02_35", KM_0002_02_35.size());
            if (KM_0002_02_35.size() != 0) {
                result.put("KM_0002_02_35Max", KM_0002_02_35list.get(KM_0002_02_35list.size() - 1));
                result.put("KM_0002_02_35Min", minNum.minNumDouble(KM_0002_02_35list,KM_0002_02_35listNew).get(0));
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
            result.put("KM_0002_02_36", KM_0002_02_36.size());
            if (KM_0002_02_36.size() != 0) {
                result.put("KM_0002_02_36Max", KM_0002_02_36list.get(KM_0002_02_36list.size() - 1));
                result.put("KM_0002_02_36Min", minNum.minNumDouble(KM_0002_02_36list,KM_0002_02_36listNew).get(0));
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
            result.put("KM_0002_02_37", KM_0002_02_37.size());
            if (KM_0002_02_37.size() != 0) {
                result.put("KM_0002_02_37Max", KM_0002_02_37list.get(KM_0002_02_37list.size() - 1));
                result.put("KM_0002_02_37Min", minNum.minNumDouble(KM_0002_02_37list,KM_0002_02_37listNew).get(0));
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
            result.put("KM_0002_02_38", KM_0002_02_38.size());
            if (KM_0002_02_38.size() != 0) {
                result.put("KM_0002_02_38Max", KM_0002_02_38list.get(KM_0002_02_38list.size() - 1));
                result.put("KM_0002_02_38Min", minNum.minNumDouble(KM_0002_02_38list,KM_0002_02_38listNew).get(0));
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
            result.put("KM_0002_02_39", KM_0002_02_39.size());
            if (KM_0002_02_39.size() != 0) {
                result.put("KM_0002_02_39Max", KM_0002_02_39list.get(KM_0002_02_39list.size() - 1));
                result.put("KM_0002_02_39Min", minNum.minNumDouble(KM_0002_02_39list,KM_0002_02_39listNew).get(0));
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
            result.put("KM_0002_02_40", KM_0002_02_40.size());
            if (KM_0002_02_40.size() != 0) {
                result.put("KM_0002_02_40Max", KM_0002_02_40list.get(KM_0002_02_40list.size() - 1));
                result.put("KM_0002_02_40Min", minNum.minNumDouble(KM_0002_02_40list,KM_0002_02_40listNew).get(0));
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
            result.put("KM_0002_02_41", KM_0002_02_41.size());
            if (KM_0002_02_41.size() != 0) {
                result.put("KM_0002_02_41Max", KM_0002_02_41list.get(KM_0002_02_41list.size() - 1));
                result.put("KM_0002_02_41Min", minNum.minNumDouble(KM_0002_02_41list,KM_0002_02_41listNew).get(0));
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
            result.put("KM_0002_02_42", KM_0002_02_42.size());
            if (KM_0002_02_42.size() != 0) {
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
            result.put("TC_0002_02_18", TC_0002_02_18.size());
            if (TC_0002_02_18.size() != 0) {
                result.put("TC_0002_02_18Max", TC_0002_02_18list.get(TC_0002_02_18list.size() - 1));
                result.put("TC_0002_02_18Min", minNum.minNumDouble(TC_0002_02_18list,TC_0002_02_18listNew).get(0));
                result.put("TC_0002_02_18AVG", avgNum.avgNumDouble(TC_0002_02_18list));
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
            result.put("TC_0002_02_19", TC_0002_02_19.size());
            if (TC_0002_02_19.size() != 0) {
                result.put("TC_0002_02_19Max", TC_0002_02_19list.get(TC_0002_02_19list.size() - 1));
                result.put("TC_0002_02_19Min",  minNum.minNumDouble(TC_0002_02_19list,TC_0002_02_19listNew).get(0));
                result.put("TC_0002_02_19AVG", avgNum.avgNumDouble(TC_0002_02_19list));
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
            result.put("TC_0002_02_20", TC_0002_02_20.size());
            if (TC_0002_02_20.size() != 0) {
                result.put("TC_0002_02_20Max", TC_0002_02_20list.get(TC_0002_02_20list.size() - 1));
                result.put("TC_0002_02_20Min",  minNum.minNumDouble(TC_0002_02_20list,TC_0002_02_20listNew).get(0));
                result.put("TC_0002_02_20AVG", avgNum.avgNumDouble(TC_0002_02_20list));
                Boxplot boxplot = new Boxplot(TC_0002_02_20list);
                result.put("TC_0002_02_20MidNum",boxplot.getMedian());
                result.put("TC_0002_02_20FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_20TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_20UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_20DownLimit",boxplot.getDownLimit());
            }
        }else
            result.put("TC_0002_02_20", TC_0002_02_20.size());

        if (TC_0002_02_21!=null)
        {
            result.put("TC_0002_02_21", TC_0002_02_21.size());
            if (TC_0002_02_21.size() != 0) {
                result.put("TC_0002_02_21Max", TC_0002_02_21list.get(TC_0002_02_21list.size() - 1));
                result.put("TC_0002_02_21Min",  minNum.minNumDouble(TC_0002_02_21list,TC_0002_02_21listNew).get(0));
                result.put("TC_0002_02_21AVG", avgNum.avgNumDouble(TC_0002_02_21list));
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
            result.put("TC_0002_02_22", TC_0002_02_22.size());
            if (TC_0002_02_22.size() != 0) {
                result.put("TC_0002_02_22Max", TC_0002_02_22list.get(TC_0002_02_22list.size() - 1));
                result.put("TC_0002_02_22Min",  minNum.minNumDouble(TC_0002_02_22list,TC_0002_02_22listNew).get(0));
                result.put("TC_0002_02_22AVG", avgNum.avgNumDouble(TC_0002_02_22list));
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
            result.put("TC_0002_02_23", TC_0002_02_23.size());
            if (TC_0002_02_23.size() != 0) {
                result.put("TC_0002_02_23Max", TC_0002_02_23list.get(TC_0002_02_23list.size() - 1));
                result.put("TC_0002_02_23Min",  minNum.minNumDouble(TC_0002_02_23list,TC_0002_02_23listNew).get(0));
                result.put("TC_0002_02_23AVG", avgNum.avgNumDouble(TC_0002_02_23list));
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
            result.put("TC_0002_02_24", TC_0002_02_24.size());
            if (TC_0002_02_24.size() != 0) {
                result.put("TC_0002_02_24Max", TC_0002_02_24list.get(TC_0002_02_24list.size() - 1));
                result.put("TC_0002_02_24Min",  minNum.minNumDouble(TC_0002_02_24list,TC_0002_02_24listNew).get(0));
                result.put("TC_0002_02_24AVG", avgNum.avgNumDouble(TC_0002_02_24list));
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
            if (TC_0002_02_25.size() != 0) {
                result.put("TC_0002_02_25Max", TC_0002_02_25list.get(TC_0002_02_25list.size() - 1));
                result.put("TC_0002_02_25Min",  minNum.minNumDouble(TC_0002_02_25list,TC_0002_02_25listNew).get(0));
                result.put("TC_0002_02_25AVG", avgNum.avgNumDouble(TC_0002_02_25list));
                Boxplot boxplot = new Boxplot(TC_0002_02_25list);
                result.put("TC_0002_02_25MidNum",boxplot.getMedian());
                result.put("TC_0002_02_25FQtiles",boxplot.getFirstQuantiles());
                result.put("TC_0002_02_25TQtiles",boxplot.getThirdQuantiles());
                result.put("TC_0002_02_25UpLimit",boxplot.getUpLimit());
                result.put("TC_0002_02_25DownLimit",boxplot.getDownLimit());
            }
            result.put("TC_0002_02_25", TC_0002_02_25.size());
        }else
            result.put("TC_0002_02_25", 0);


        if (TC_0002_02_26!=null)
        {
            result.put("TC_0002_02_26", TC_0002_02_26.size());
            if (TC_0002_02_27.size() != 0) {
                result.put("TC_0002_02_26Max", TC_0002_02_26list.get(TC_0002_02_26list.size() - 1));
                result.put("TC_0002_02_26Min",  minNum.minNumDouble(TC_0002_02_26list,TC_0002_02_26listNew).get(0));
                result.put("TC_0002_02_26AVG", avgNum.avgNumDouble(TC_0002_02_26list));
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
            result.put("TC_0002_02_27", TC_0002_02_27.size());
            if (TC_0002_02_28.size() != 0) {
                result.put("TC_0002_02_27Max", TC_0002_02_27list.get(TC_0002_02_27list.size() - 1));
                result.put("TC_0002_02_27Min",  minNum.minNumDouble(TC_0002_02_27list,TC_0002_02_27listNew).get(0));
                result.put("TC_0002_02_27AVG", avgNum.avgNumDouble(TC_0002_02_27list));
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
            result.put("TC_0002_02_28", TC_0002_02_28.size());
            if (TC_0002_02_28.size() != 0) {
                result.put("TC_0002_02_28Max", TC_0002_02_28list.get(TC_0002_02_28list.size() - 1));
                result.put("TC_0002_02_28Min",  minNum.minNumDouble(TC_0002_02_28list,TC_0002_02_28listNew).get(0));
                result.put("TC_0002_02_28AVG", avgNum.avgNumDouble(TC_0002_02_28list));
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
            result.put("TC_0002_02_29", TC_0002_02_29.size());
            if (TC_0002_02_29.size() != 0) {
                result.put("TC_0002_02_29Max", TC_0002_02_29list.get(TC_0002_02_29list.size() - 1));
                result.put("TC_0002_02_29Min",  minNum.minNumDouble(TC_0002_02_29list,TC_0002_02_29listNew).get(0));
                result.put("TC_0002_02_29AVG", avgNum.avgNumDouble(TC_0002_02_29list));
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
            result.put("TC_0002_02_30", TC_0002_02_30.size());
            if (TC_0002_02_30.size() != 0) {
                result.put("TC_0002_02_30Max", TC_0002_02_30list.get(TC_0002_02_30list.size() - 1));
                result.put("TC_0002_02_30Min",  minNum.minNumDouble(TC_0002_02_30list,TC_0002_02_30listNew).get(0));
                result.put("TC_0002_02_30AVG", avgNum.avgNumDouble(TC_0002_02_30list));
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
            result.put("TC_0002_02_31", TC_0002_02_31.size());
            if (TC_0002_02_31.size() != 0) {
                result.put("TC_0002_02_31Max", TC_0002_02_31list.get(TC_0002_02_31list.size() - 1));
                result.put("TC_0002_02_31Min",  minNum.minNumDouble(TC_0002_02_31list,TC_0002_02_31listNew).get(0));
                result.put("TC_0002_02_31AVG", avgNum.avgNumDouble(TC_0002_02_31list));
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
            result.put("TC_0002_02_32", TC_0002_02_32.size());
            if (TC_0002_02_32.size() != 0) {
                result.put("TC_0002_02_32Max", TC_0002_02_32list.get(TC_0002_02_32list.size() - 1));
                result.put("TC_0002_02_32Min",  minNum.minNumDouble(TC_0002_02_32list,TC_0002_02_32listNew).get(0));
                result.put("TC_0002_02_32AVG", avgNum.avgNumDouble(TC_0002_02_32list));
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
            result.put("TC_0002_02_34", TC_0002_02_34.size());

        if (TC_0002_02_35!=null)
            result.put("TC_0002_02_35", TC_0002_02_35.size());
        else
            result.put("TC_0002_02_35", 0);

        if (TC_0002_02_36!=null)
            result.put("TC_0002_02_36", TC_0002_02_36.size());
        else
            result.put("TC_0002_02_36", 0);

        if (TC_0002_02_37!=null)
            result.put("TC_0002_02_37", TC_0002_02_37.size());
        else
            result.put("TC_0002_02_37", 0);

        if (TC_0002_02_38!=null)
            result.put("TC_0002_02_38", TC_0002_02_38.size());
        else
            result.put("TC_0002_02_38", 0);

        if (TC_0002_02_39!=null)
            result.put("TC_0002_02_39", TC_0002_02_39.size());
        else
            result.put("TC_0002_02_39", 0);

        if (TC_0002_02_40!=null)
            result.put("TC_0002_02_40", TC_0002_02_40.size());
        else
            result.put("TC_0002_02_40", 0);

        if (TC_0002_02_41!=null)
            result.put("TC_0002_02_41", TC_0002_02_41.size());
        else
            result.put("TC_0002_02_41", 0);

        if (TC_0002_02_42!=null)
            result.put("TC_0002_02_42", TC_0002_02_42.size());
        else
            result.put("TC_0002_02_42", 0);

        if (TC_0002_02_43!=null)
            result.put("TC_0002_02_43", TC_0002_02_43.size());
        else
            result.put("TC_0002_02_43", 0);

        if (TC_0002_02_44!=null)
            result.put("TC_0002_02_44", TC_0002_02_44.size());
        else
            result.put("TC_0002_02_44", 0);

        if (TC_0002_02_45!=null)
            result.put("TC_0002_02_45", TC_0002_02_45.size());
        else
            result.put("TC_0002_02_45", 0);

        if (TC_0002_02_46!=null)
            result.put("TC_0002_02_46", TC_0002_02_46.size());
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

        outputSql.add(result);

    }
}
