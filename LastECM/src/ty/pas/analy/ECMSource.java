package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ECMSource extends UserFunction {
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
        List<StringPoint> TC_0002_00_01 = stringInput.get(deviceID).get("TC_0002_00_01");

        System.out.println(TC_0002_00_01.size());
        HashMap<String,Object> result=new HashMap<>();
        if (TC_0002_00_01.size()==0 || TC_0002_00_01==null)
            return;
        else
        {
            for (StringPoint stringPoint:TC_0002_00_01)
            {
                String str2 = stringPoint.getValue().substring(50, stringPoint.getValue().length() - 6);
                for (int i = 0; i + 28 <= str2.length(); i += 28)
                {
                    String strs = str2.substring(i, i + 28);
                    String s = strs.substring(4,28);
                    if (s.contains("16FF010000")&&s.contains("01D8")&&!s.contains("C308"))
                    {
                        result.put("Vcl_ID",deviceID);
                        result.put("MsgTime",String.valueOf(stringPoint.getPrimaryTime()));
                        result.put("ECM",stringPoint.getValue());
                        outputSql.add(result);
                        result=new HashMap<>();

                    }
                }
            }
        }
    }
}
