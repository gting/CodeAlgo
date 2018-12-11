package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.SimpleDateFormat;
import java.util.*;

public class LastECM extends UserFunction {
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

        List<StringPoint> KM_0002_02_16 = stringInput.get(deviceID).get("KM_0002_02_16");
        List<StringPoint> TY_0001_00_42 = stringInput.get(deviceID).get("TY_0001_00_42");

        System.out.println(KM_0002_02_16.size());
        List<String> stringList = new ArrayList<>();
        if (KM_0002_02_16==null || KM_0002_02_16.size()==0)
        {
            return;
        }
        else
        {
            if (TY_0001_00_42.get(0).getValue().equals("106505"))
            {
                int size=KM_0002_02_16.size();
                long time=KM_0002_02_16.get(size-1).getPrimaryTime();
                SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                Date date=new Date(time);
                String msgTime=dateFormat.format(date);
                Date date1=new Date();
                String ECM = KM_0002_02_16.get(size-1).getValue();
                HashMap<String,Object> result=new HashMap<>();
                result.put("Vcl_ID",deviceID);
                result.put("MsgTime",msgTime);
                result.put("ECM",ECM);
                outputSql.add(result);
            }

        }

    }
}
