package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<DoublePoint> oil = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<Double>oils = new ArrayList<>();
        List<Long>oilTimes = new ArrayList<>();
        for (DoublePoint one:oil){
            oils.add(Double.valueOf(one.getValue()));
            oilTimes.add(one.getPrimaryTime());
        }
        LongToDate longToDate = new LongToDate();
        String date = "";
        date = longToDate.timeStamp2Date(String.valueOf(oilTimes.get(0)), "yyyy-MM-dd");
        CountOil coutOil = new CountOil();
        coutOil.Calculation(oilTimes,oils);

        HashMap<String, Object> result = new HashMap<>();
        result.put("Vcl_ID",deviceID);
        result.put("MsgTime",date);
        result.put("Oil",coutOil.getAllOil());
        outputSql.add(result);

    }
}
