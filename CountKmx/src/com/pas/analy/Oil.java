package com.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;
import sun.rmi.transport.Connection;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Oil extends UserFunction {
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
        List<DoublePoint> KM_0002_02_03 = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        List<String> list = new ArrayList<String>();
        if (KM_0002_02_03 != null) {
            alldata.addAll(KM_0002_02_03);
            list.add("KM_0002_02_03");
        }
        if (alldata.size() == 0)
            return;
        HashMap<String, Object> result = new HashMap<>();

        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        Map<Long, List<AbstractPoint>> resultMap2 = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getSecondaryTime));

        double KM_0002_02_03_1;
        for (DoublePoint oil : KM_0002_02_03) {
            KM_0002_02_03_1 = oil.getValue() * 1000 / 3600;
            result.put("开始时间", oil.getPrimaryTime());
            result.put("结束时间", oil.getSecondaryTime());
            result.put("设备号", deviceID);
            result.put("TC_0003_02_07", KM_0002_02_03_1);
        }

    }
}
