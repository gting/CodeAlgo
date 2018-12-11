package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class KeyOnCompare extends UserFunction {

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
        // Example:
        // 获取设备号
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<Map<String, String>> keyon15 = sqlData.get("EgnOn_table").get(deviceID);
        List<Map<String, String>> keyon88 = sqlData.get("v_Carlist_Kmx_notNUll").get(deviceID);
        System.out.println(keyon88);
        if (keyon15.size()==0 && keyon88.size()==0)
            return;

//        System.out.println(MAP_INFO_Q);
        String Result_1 ="";

        HashMap Result = new HashMap();
        if (keyon15.size()!=0 && keyon88.size()!=0)
        {
            //15


            Map<String, String> smap15 = keyon15.get(0);

            String MsgTime = smap15.get("Msgtime");
            String Egn_1=smap15.get("Egn_1");

            //88
            Map<String,String> smap88 = keyon88.get(0);

            String MAP_INFO_Q = smap88.get("MAP_INFO_Q");
            int n_1=0;
            for (int i=0;i<MAP_INFO_Q.length();i++) {
                char item1 = Egn_1.charAt(i);
                for (int j=0;j<Egn_1.length();j++)
                {
                    char item2 = MAP_INFO_Q.charAt(j);
                    if (item1 == item2)
                    {
                        n_1++;
                    }
                    if (j%15==0)
                        continue;
                }
            }
            NumberFormat numberFormat = NumberFormat.getInstance();
            // 设置精确到小数点后2位

            numberFormat.setMaximumFractionDigits(2);

            Result_1 = numberFormat.format((float) n_1 / (float) 96 * 100);
            System.out.println("Egn_1:" + Result_1 + "%");




            Result.put("Vcl_ID", deviceID);
            Result.put("MsgTime", MsgTime);
            Result.put("Result_1",Result_1 + "%");
            Result.put("Carlist_EngOn",MAP_INFO_Q);

        }
        else if (keyon15.size()!=0 && keyon88.size()==0)
        {
            //15

            Map<String, String> smap15 = keyon15.get(0);

            String MsgTime = smap15.get("Msgtime");
            String Egn_1=smap15.get("Egn_1");
            String Egn_8=smap15.get("Egn_8");
            String Egn_15=smap15.get("Egn_15");

            Result.put("Vcl_ID", deviceID);
            Result.put("MsgTime", MsgTime);

        }
        else if (keyon15.size()==0&&keyon88.size()!=0)
        {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date date=new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            calendar.set(Calendar.HOUR,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
//        calendar.set(Calendar.MILLISECOND,0);
            date = calendar.getTime();
//            System.out.println(sdf.format(date));
            //88
            Map<String,String> smap88 = keyon88.get(0);

            String MAP_INFO_Q = smap88.get("MAP_INFO_Q");
            Result.put("Vcl_ID", deviceID);
            Result.put("MsgTime", String.valueOf(sdf.format(date)));
            Result.put("Carlist_EngOn",MAP_INFO_Q);
        }

       if (Result.size()!=0)
            outputSql.add(Result);

    }
}
