package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SupplTime extends UserFunction {
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
//        List<Map<String, String>> sqllist = sqlData.get("InterruptTime").get(deviceID);
        List<LongPoint> TC_0003_02_14 = longInput.get(deviceID).get("TC_0003_02_14");
        List<DoublePoint> KM_0002_02_03 = doubleInput.get(deviceID).get("KM_0002_02_03");
        LongToDate longToDate = new LongToDate();
        List<Long> TimeList = new ArrayList<>();
        if (KM_0002_02_03.size() != 0 || KM_0002_02_03 != null) {
            for (int i = 1; i < KM_0002_02_03.size(); i++) {
                long time = KM_0002_02_03.get(i).getPrimaryTime() - KM_0002_02_03.get(i - 1).getPrimaryTime();

                if (time > 100L) {
                    for (int i1 = 0; i1 < time / 100; i1++) {
                        long time2 = KM_0002_02_03.get(i).getPrimaryTime();
                        time2 = time2 - i1 * 100;
                        //System.out.println(time2);
                        TimeList.add(time2);
                        System.out.println(longToDate.timeStamp2Date(String.valueOf(time2), "yyyy-MM-dd HH:mm:ss.SSS "));
                    }
                } else if (time > 10000) {
                    for (int i1 = 0; i1 < time / 100; i1++) {
                        long time2 = KM_0002_02_03.get(i).getPrimaryTime();
                        time2 = time2 - i1 * 100;
//                        System.out.println(time2);
                        TimeList.add(time2);
                        System.out.println(longToDate.timeStamp2Date(String.valueOf(time2), "yyyy-MM-dd HH:mm:ss.SSS "));
                    }
                } else {
                    TimeList.add(KM_0002_02_03.get(i).getPrimaryTime());
                    System.out.println(longToDate.timeStamp2Date(String.valueOf(KM_0002_02_03.get(i).getPrimaryTime()), "yyyy-MM-dd HH:mm:ss.SSS "));
                }
            }
        }
        Collections.sort(TimeList);
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        if (TC_0003_02_14 != null) {
            alldata.addAll(TC_0003_02_14);
        }
        HashMap<String, Object> result = new HashMap<>();

        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        for (int i = 0; i < TimeList.size(); i++) {
            List<AbstractPoint> listpoint = resultMap.get(TimeList.get(i));
            {
                if (listpoint != null) {
                    for (AbstractPoint ap : listpoint) {
                        if (ap.getMetric().equals("TC_0003_02_14")) {
                            LongPoint ap2 = (LongPoint) ap;
                            result.put("Time", longToDate.timeStamp2Date(String.valueOf(TimeList.get(i)), "yyyy-MM-dd HH:mm:ss.SSS "));
                            result.put("Value", String.valueOf(ap2.getValue()));
                            result.put("Vcl_ID", deviceID);
                            outputSql.add(result);
                            result = new HashMap<>();
                        }
                    }
                } else {
                    result.put("Time", longToDate.timeStamp2Date(String.valueOf(TimeList.get(i)), "yyyy-MM-dd HH:mm:ss.SSS "));
                    result.put("Vcl_ID", deviceID);
                    outputSql.add(result);
                    result = new HashMap<>();
                }
            }
        }
    }
}
