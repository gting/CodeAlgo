package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SpeedTorque extends UserFunction {
    private static int n=31;
    private static int m=11;
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
        List<DoublePoint> KM_0002_02_04 = doubleInput.get(deviceID).get("KM_0002_02_04");
        List<DoublePoint> KM_0002_02_05 = doubleInput.get(deviceID).get("KM_0002_02_05");
        List<DoublePoint> oil = doubleInput.get(deviceID).get("KM_0002_02_03");
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();

        if (KM_0002_02_04==null||KM_0002_02_05==null||KM_0002_02_04.size()==0||KM_0002_02_05.size()==0)
            return;
        if (KM_0002_02_04 != null) {
            alldata.addAll(KM_0002_02_04);
        }
        if (KM_0002_02_05 != null) {
            alldata.addAll(KM_0002_02_05);
        }

        HashMap<String, Object> result = new HashMap<>();

        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));

        LongToDate longToDate = new LongToDate();
        String date = "";

        List<Double> Speed = new ArrayList<>();
        List<Double> Torque = new ArrayList<>();
        if (KM_0002_02_04!=null)
        {
            for (DoublePoint speed:KM_0002_02_04)
            {
                Speed.add(speed.getValue());
                date = longToDate.timeStamp2Date(String.valueOf(speed.getPrimaryTime()), "yyyy-MM-dd");
            }
        }
        if (KM_0002_02_05!=null)
        {
            for (DoublePoint torque:KM_0002_02_05)
            {
                Torque.add(torque.getValue());
            }
        }

        List<Double> newSpeed = new ArrayList<>();
        List<Double> newTorque = new ArrayList<>();
        for (int i = 0; i < Speed.size(); i++) {
            Double fs = Speed.get(i) / 100;
            Double ft = Torque.get(i) / 10;
            newSpeed.add(fs);
            newTorque.add(ft);
        }
        int[][] a = new int[n][m];
        for (int i = 0; i < newSpeed.size(); i++) {
            if (newSpeed.get(i).intValue()==30||newTorque.get(i).intValue()==10)
                a[29][9]++;
            else if (newTorque.get(i).intValue()>10 )
                a[29][10]++;
            else if (newSpeed.get(i).intValue()>30)
                a[30][10]++;
            else
            {
                a[newSpeed.get(i).intValue()][newTorque.get(i).intValue()]++;
            }

        }

        int count=0;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<m-1;j++)
            {
                if (a[i][j]==0)
                    count++;
            }
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                String s = "";
                int k=(i)*10+j;
                s="Range"+k;
//                System.out.println("["+i * 100+":"+(i+1)*100 + "~" +j * 10+":"+(j+1)*10+"]"+" int null,");
                result.put(s, a[i][j]);
            }
        }

        List<Double>oils = new ArrayList<>();
        List<Long>oilTimes = new ArrayList<>();
        if (oil!=null)
        {
            for (DoublePoint one:oil){
                oils.add(Double.valueOf(one.getValue()));
                oilTimes.add(one.getPrimaryTime());
            }
        }

        CountOil coutOil = new CountOil();
        coutOil.Calculation(oilTimes,oils);


        result.put("Vcl_ID",deviceID);
        result.put("MsgTime",date);
        result.put("Oil",coutOil.getAllOil());
        result.put("Count0",count);
        result.put("Speed3000",a[30][10]);
        result.put("Torque100",a[29][10]);
        outputSql.add(result);
    }
}
