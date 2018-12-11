package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeDiff  extends UserFunction{
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
        List<DoublePoint> KM_0002_02_03 = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<DoublePoint> KM_0002_02_04 = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<DoublePoint> KM_0002_02_05 = doubleInput.get(deviceID).get("KM_0002_02_05");
        List<DoublePoint> KM_0002_02_06 = doubleInput.get(deviceID).get("KM_0002_02_06");
        List<DoublePoint> KM_0002_02_09 = doubleInput.get(deviceID).get("KM_0002_02_09");
        List<DoublePoint> KM_0002_02_10 = doubleInput.get(deviceID).get("KM_0002_02_10");
        List<IntPoint> KM_0002_02_11 = intInput.get(deviceID).get("KM_0002_02_11");
        List<StringPoint> KM_0002_02_12 = stringInput.get(deviceID).get("KM_0002_02_12");

        if (KM_0002_02_03!=null&&KM_0002_02_03.size()>0)
        {
            for (DoublePoint time:KM_0002_02_03)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_14",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_04!=null&&KM_0002_02_04.size()>0)
        {
            for (DoublePoint time:KM_0002_02_04)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_15",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_05!=null&&KM_0002_02_05.size()>0)
        {
            for (DoublePoint time:KM_0002_02_05)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_16",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_06!=null&&KM_0002_02_06.size()>0)
        {
            for (DoublePoint time:KM_0002_02_06)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_17",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_09!=null&&KM_0002_02_09.size()>0)
        {
            for (DoublePoint time:KM_0002_02_09)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_18",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_10!=null&&KM_0002_02_10.size()>0)
        {
            for (DoublePoint time:KM_0002_02_10)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_19",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_11!=null&&KM_0002_02_11.size()>0)
        {
            for (IntPoint time:KM_0002_02_11)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_20",timediff);
                outputKmx.add(result);
            }
        }
        if (KM_0002_02_12!=null&&KM_0002_02_12.size()>0)
        {
            for (StringPoint time:KM_0002_02_12)
            {
                HashMap<String,Object> result = new HashMap<>();
                long timediff;
                timediff=time.getSecondaryTime()-time.getPrimaryTime();
                result.put("设备号",deviceID);
                result.put("开始时间",time.getPrimaryTime());
                result.put("结束时间",time.getSecondaryTime());
                result.put("TC_0003_02_21",timediff);
                outputKmx.add(result);
            }
        }
    }
}
