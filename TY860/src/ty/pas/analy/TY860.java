package ty.pas.analy;

import com.sagittarius.bean.result.*;
import tykj.userfn.UserFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TY860 extends UserFunction {
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
        System.out.println(deviceID);
        List<DoublePoint> TY860_0002_00_18 = doubleInput.get(deviceID).get("860_0002_00_18"); //电池电压
//        List<IntPoint> TY860_0002_00_08 = intInput.get(deviceID).get("860_0002_00_08"); //发送短信成功次数
        HashMap<String, Object> result = new HashMap<>();
        LongToDate longToDate = new LongToDate();
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        if (TY860_0002_00_18 != null) {
            alldata.addAll(TY860_0002_00_18);
        }
//        if (TY860_0002_00_08 != null) {
//            alldata.addAll(TY860_0002_00_08);
//        }
        if (alldata.size() == 0)
            return;
//        System.out.println("TY860_0002_00_08:"+TY860_0002_00_08);
        System.out.println("TY860_0002_00_08:"+TY860_0002_00_18);
//        System.out.println("TY_08:"+TY860_0002_00_08.size());
        System.out.println("TY_18:"+TY860_0002_00_18.size());
        String date="";
        if ((TY860_0002_00_18 != null && TY860_0002_00_18.size() > 0)) {
            result.put("Voltage", TY860_0002_00_18.get(TY860_0002_00_18.size() - 1).getValue());
            date = longToDate.timeStamp2Date(String.valueOf(TY860_0002_00_18.get(TY860_0002_00_18.size()-1).getPrimaryTime()), "yyyy-MM-dd HH:mm:ss");
            result.put("Msgtime",date);
        }else
            result.put("Voltage",null);
//        if (TY860_0002_00_08 != null && TY860_0002_00_08.size() > 0) {
//            date = longToDate.timeStamp2Date(String.valueOf(TY860_0002_00_08.get(TY860_0002_00_08.size()-1).getPrimaryTime()), "yyyy-MM-dd");
//            result.put("SuccNum", TY860_0002_00_08.get(TY860_0002_00_08.size() - 1).getValue());
//            result.put("Msgtime",date);
//        }else
//            result.put("SuccNum",null);
        result.put("Vcl_ID",deviceID);
        outputSql.add(result);
    }
}
