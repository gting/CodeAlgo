package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorSource extends UserFunction {
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
        List<StringPoint> TC_0002_00_01 = stringInput.get(deviceID).get("TC_0002_00_01"); //源码工况
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_Info_new")).get(deviceID);
        if (TC_0002_00_01!=null && TC_0002_00_01.size()>0)
        {
            for (StringPoint s:TC_0002_00_01)
            {
                if (s.getValue().indexOf("16FF0100000106CBFFFFFFFF")!=-1)
                {
                    LongToDate longToDate = new LongToDate();
                    String date="";
                    date = longToDate.timeStamp2Date(String.valueOf(s.getPrimaryTime()), "yyyy-MM-dd HH:mm:ss");
                    HashMap<String, Object> result = new HashMap<>();
                    result.put("Vcl_ID",deviceID);
                    result.put("Vcl_No",sqllist.get(0).get("Vcl_VinCode"));
                    result.put("Code",s.getValue());
                    result.put("MsgTime",date);
                    outputSql.add(result);
                    return;
                }
            }
        }
    }
}
