package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rate extends UserFunction{
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
        List<Map<String, String>> Rate =  sqlData.get("Rate").get(deviceID);
        List<DoublePoint> KM_0002_02_03 = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<DoublePoint> KM_0002_02_04 = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<DoublePoint> KM_0002_02_05 = doubleInput.get(deviceID).get("KM_0002_02_05");
        List<DoublePoint> KM_0002_02_06 = doubleInput.get(deviceID).get("KM_0002_02_06");
        List<DoublePoint> KM_0002_02_09 = doubleInput.get(deviceID).get("KM_0002_02_09");
        List<DoublePoint> KM_0002_02_10 = doubleInput.get(deviceID).get("KM_0002_02_10");
        List<IntPoint> KM_0002_02_11 = intInput.get(deviceID).get("KM_0002_02_11");
        List<StringPoint> KM_0002_02_12 = stringInput.get(deviceID).get("KM_0002_02_12");

        List<Long> KM_0002_02_03times = new ArrayList<>();
        List<Long> KM_0002_02_04times = new ArrayList<>();
        List<Long> KM_0002_02_05times = new ArrayList<>();
        List<Long> KM_0002_02_06times = new ArrayList<>();
        List<Long> KM_0002_02_09times = new ArrayList<>();
        List<Long> KM_0002_02_10times = new ArrayList<>();
        List<Long> KM_0002_02_11times = new ArrayList<>();
        List<Long> KM_0002_02_12times = new ArrayList<>();

        long KM_0002_02_03Rate=0L;
        long KM_0002_02_04Rate=0L;
        long KM_0002_02_05Rate=0L;
        long KM_0002_02_06Rate=0L;
        long KM_0002_02_09Rate=0L;
        long KM_0002_02_10Rate=0L;
        long KM_0002_02_11Rate=0L;
        long KM_0002_02_12Rate=0L;
        TimeDiff timeDiff = new TimeDiff();
        if (KM_0002_02_03!=null || KM_0002_02_03.size()>0)
        {
            for (DoublePoint one:KM_0002_02_03){
                KM_0002_02_03times.add(one.getPrimaryTime());
            }
            KM_0002_02_03Rate=timeDiff.getRange(KM_0002_02_03times.size(),KM_0002_02_03times);
        }
        if (KM_0002_02_04!=null|| KM_0002_02_04.size()>0)
        {
            for (DoublePoint one:KM_0002_02_04){
                KM_0002_02_04times.add(one.getPrimaryTime());
            }
            KM_0002_02_04Rate=timeDiff.getRange(KM_0002_02_04times.size(),KM_0002_02_04times);
        }
        if (KM_0002_02_05!=null||KM_0002_02_05.size()>0)
        {
            for (DoublePoint one:KM_0002_02_05){
                KM_0002_02_05times.add(one.getPrimaryTime());
            }
            KM_0002_02_05Rate=timeDiff.getRange(KM_0002_02_05times.size(),KM_0002_02_05times);
        }
        if (KM_0002_02_06!=null||KM_0002_02_06.size()>0)
        {
            for (DoublePoint one:KM_0002_02_06){
                KM_0002_02_06times.add(one.getPrimaryTime());
            }
            KM_0002_02_06Rate=timeDiff.getRange(KM_0002_02_06times.size(),KM_0002_02_06times);
        }
        if (KM_0002_02_09!=null||KM_0002_02_09.size()>0)
        {
            for (DoublePoint one:KM_0002_02_09){
                KM_0002_02_09times.add(one.getPrimaryTime());
            }
            KM_0002_02_09Rate=timeDiff.getRange(KM_0002_02_09times.size(),KM_0002_02_09times);
        }
        if (KM_0002_02_10!=null||KM_0002_02_10.size()>0)
        {
            for (DoublePoint one:KM_0002_02_10){
                KM_0002_02_10times.add(one.getPrimaryTime());
            }
            KM_0002_02_10Rate=timeDiff.getRange(KM_0002_02_10times.size(),KM_0002_02_10times);
        }

        if (KM_0002_02_11!=null)
        {
            for (IntPoint one:KM_0002_02_11){
                KM_0002_02_11times.add(one.getPrimaryTime());
            }
            KM_0002_02_11Rate=timeDiff.getRange(KM_0002_02_11times.size(),KM_0002_02_11times);
        }

        if (KM_0002_02_12!=null)
        {
            for (StringPoint one:KM_0002_02_12){
                KM_0002_02_12times.add(one.getPrimaryTime());
            }
            KM_0002_02_12Rate=timeDiff.getRange(KM_0002_02_12times.size(),KM_0002_02_12times);
        }

        HashMap<String, Object> result = new HashMap<>();
        if (KM_0002_02_03==null||KM_0002_02_03.size()==0)
            result.put("KM_0002_02_03",null);
        else
        {
            /*if (KM_0002_02_03Rate>=120000)
                KM_0002_02_03Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_03"));*/
            if (KM_0002_02_03Rate>=120000 || KM_0002_02_03.size()<=5)
                result.put("KM_0002_02_03",0);
            else
                result.put("KM_0002_02_03",KM_0002_02_03Rate);
        }
        if (KM_0002_02_04==null||KM_0002_02_04.size()==0)
            result.put("KM_0002_02_04",null);
        else
        {
            /*if (KM_0002_02_04Rate>=120000)
                KM_0002_02_04Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_04"));*/
            if (KM_0002_02_04Rate>=120000||KM_0002_02_04.size()<=5)
                result.put("KM_0002_02_04",0);
            else
                result.put("KM_0002_02_04",KM_0002_02_04Rate);
        }
        if (KM_0002_02_05==null||KM_0002_02_05.size()==0)
            result.put("KM_0002_02_05",null);
        else
        {
           /* if (KM_0002_02_05Rate>=120000)
                KM_0002_02_05Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_05"));*/
           if (KM_0002_02_05Rate>=120000||KM_0002_02_05.size()<-5)
               result.put("KM_0002_02_05",0);
           else
               result.put("KM_0002_02_05",KM_0002_02_05Rate);
        }
        if (KM_0002_02_06==null||KM_0002_02_06.size()==0)
            result.put("KM_0002_02_06",null);
        else
        {
           /* if (KM_0002_02_06Rate>=120000)
                KM_0002_02_06Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_06"));*/
           if (KM_0002_02_06Rate>=120000||KM_0002_02_06.size()<=5)
               result.put("KM_0002_02_06",0);
           else
               result.put("KM_0002_02_06",KM_0002_02_06Rate);
        }
        if (KM_0002_02_09==null||KM_0002_02_09.size()==0)
            result.put("KM_0002_02_06",null);
        else
        {
            /*if (KM_0002_02_09Rate>=120000)
                KM_0002_02_09Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_09"));*/
            if (KM_0002_02_09Rate>=120000||KM_0002_02_09.size()<=5)
                result.put("KM_0002_02_09",0);
            else
                result.put("KM_0002_02_09",KM_0002_02_09Rate);
        }
        if (KM_0002_02_10==null||KM_0002_02_10.size()==0)
            result.put("KM_0002_02_10",null);
        else
        {
            /*if (KM_0002_02_10Rate>=120000)
                KM_0002_02_10Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_10"));*/
            if (KM_0002_02_10Rate>=120000||KM_0002_02_10.size()<=5)
                result.put("KM_0002_02_10",0);
            else
                result.put("KM_0002_02_10",KM_0002_02_10Rate);
        }
        if (KM_0002_02_11==null||KM_0002_02_11.size()==0)
            result.put("KM_0002_02_11",null);
        else
        {
            /*if (KM_0002_02_11Rate>=120000)
                KM_0002_02_11Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_11"));*/
            if (KM_0002_02_11Rate>=120000||KM_0002_02_11.size()<=5)
                result.put("KM_0002_02_11",0);
            else
                result.put("KM_0002_02_11",KM_0002_02_11Rate);
        }
       if (KM_0002_02_12==null||KM_0002_02_12.size()==0)
           result.put("KM_0002_02_12",null);
        else
       {
          /* if (KM_0002_02_12Rate>=120000)
               KM_0002_02_12Rate=Long.parseLong(Rate.get(0).get("KM_0002_02_12"));*/
          if (KM_0002_02_12Rate>=120000||KM_0002_02_12.size()<=5)
              result.put("KM_0002_02_12",0);
          else
              result.put("KM_0002_02_12",KM_0002_02_12Rate);
       }
        result.put("Vcl_ID",deviceID);

       outputSql.add(result);
    }
}
