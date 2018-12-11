package ty.pas.analy;

import com.google.common.primitives.Ints;
import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interrupt extends UserFunction {
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

        List<Map<String, String>> sqllist = sqlData.get("TC_Sourceinfo").get(deviceID);
        List<Map<String, String>> Rate = sqlData.get("Rate").get(deviceID);
        String KeyOn = sqllist.get(0).get("Egn_Source");
        String MsgTime = sqllist.get(0).get("Msgtime");


        if (KeyOn == null)
            return;
        List<Integer> KeyOnList = new ArrayList<>();
        KeyOn keyOn = new KeyOn();
        Subscript subscript = new Subscript();
        List<List<Integer>> KeyOnTime = new ArrayList<>();
        int[][] arrays = keyOn.KeyOn(subscript.Sub(KeyOn));

        //获取开机时间段
        for (int i = 0; i < arrays.length; i++) {
            KeyOnList = Ints.asList(arrays[i]);
            List arrList = new ArrayList(KeyOnList);
            Remove remove = new Remove();
            remove.RemoveList(arrList);
            if (arrList.size() > 0)
                KeyOnTime.add(arrList);
        }
        double keyontime = subscript.Sub(KeyOn).length;

        for (Map<String, String> map : Rate) {
            HashMap<String, Object> result = new HashMap<>();
            for (String key : map.keySet()) {
                if (key.equals("Vcl_ID"))
                    continue;

                //获取工况的频率
                if (map.get(key) == null) {
                    result.put(key, "未采集到数据");
                    result.put(key + "Scale", "未采集到数据");
                    result.put(key + "KeyOn", keyontime / 60);
                } else if (Integer.parseInt(map.get(key)) == 0) {
                    result.put(key, "该设备异常");
                    result.put(key + "Scale", "该设备异常");
                    result.put(key + "KeyOn", keyontime / 60);
                } else if (Integer.parseInt(map.get(key)) > 0) {
                    LongToDate longToDate = new LongToDate();
                    List sensor;
                    WorkTimes Times = new WorkTimes();
                    long rate;
                    rate = Long.parseLong(map.get(key)) + 20;
                    List<Long> workTimes = new ArrayList<>();
                    if (key.equals("KM_0002_02_11")) {
                        sensor = intInput.get(deviceID).get(key);
                        workTimes = Times.intworkTimes(sensor);
                    } else if (key.equals("KM_0002_02_12")) {
                        sensor = stringInput.get(deviceID).get(key);
                        workTimes = Times.stringworkTimes(sensor);
                    } else {
                        sensor = doubleInput.get(deviceID).get(key);
                        workTimes = Times.doubleworkTimes(sensor);
                    }
                    if (sensor.size() > 0 && subscript.Sub(KeyOn).length > 0) {
                        List<String> jsonList = new ArrayList<>();
                        double time = 0;
                        double scale = 0;
                        for (int i = 0; i < KeyOnTime.size(); i++) {
                            long start = KeyOnTime.get(i).get(0) * 60000 + startTime;
                            long end = KeyOnTime.get(i).get(KeyOnTime.get(i).size() - 1) * 60000 + startTime;

                            for (int j = 1; j < workTimes.size(); j++) {
                                if (workTimes.get(j) <= end && workTimes.get(j) >= start) {
                                    if (workTimes.get(j) - workTimes.get(j - 1) > rate && workTimes.get(j - 1) >= start) {
                                        time += workTimes.get(j) - workTimes.get(j - 1);
                                        jsonList.add(longToDate.timeStamp2Date(workTimes.get(j).toString(), "yyyy-MM-dd HH:mm:ss.SSS "));
                                    }
                                }
                            }
                        }
                        scale = (time / 60000) / keyontime * 100;
                        BigDecimal   b   =   new   BigDecimal(scale);
                        BigDecimal c = new BigDecimal(keyontime);
                        double   scale2   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                        double keyontime2 = c.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                        BigDecimal d = new BigDecimal(time);
                        double time2 = d.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                        if (jsonList.size() > 0)
                        {
                            result.put(key, jsonList.toString());
                            result.put(key + "Scale", scale2 + "%");
                            result.put(key + "KeyOn", keyontime2 / 60);
                            result.put(key + "Breaktime", time2 / 3600000);
                        }
                        else
                            continue;

                    }
                }
            }
            result.put("Vcl_ID", deviceID);
            result.put("MsgTime", MsgTime);

            if (result.size() > 2)
                outputSql.add(result);
        }
    }
}
