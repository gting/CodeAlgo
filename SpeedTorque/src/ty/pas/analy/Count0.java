package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count0 extends UserFunction {
    private static int n = 31;
    private static int m = 11;

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
        List<Map<String, String>> sqllist = (List) ((Map) sqlData.get("Vcl_DayInfo")).get(deviceID);
        for (int i = 0; i < sqllist.size(); i++) {
            String MsgTime = sqllist.get(i).get("MsgTime");
            int count = 0;
            for (int k = 0; k < n-1; k++) {
                for (int j = 0; j < m-1; j++) {
                    String s = "";
                    int t=(k)*10+j;
                    s="Range"+t;
                    String Range = sqllist.get(i).get(s);
                    if (Range.equals("0"))
                    {
                        count++;
                    }
                }
            }
            HashMap<String, Object> result = new HashMap<>();
            result.put("Count0",count);
            result.put("Vcl_ID",deviceID);
            result.put("MsgTime",MsgTime);
            outputSql.add(result);
        }

    }

}
