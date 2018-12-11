package ty.pas.analy;

import com.sagittarius.bean.result.*;
import com.sagittarius.util.TimeUtil;
import edu.thss.platform.pas.userfunc.UserFunction;
import jnr.ffi.Struct;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class KeyOn extends UserFunction {
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

        List<StringPoint> distList = stringInput.get(deviceID).get("TC_0002_02_17");
        System.out.println(distList);
        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        List<String> list = new ArrayList<String>();
        if (distList != null) {
            alldata.addAll(distList);
            list.add("TC_0002_02_17");
        }
        if (list.size()==0)
            return;
        Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                Collectors.groupingBy(AbstractPoint::getPrimaryTime));
        HashMap<String, Object> result = new HashMap<>();

        List<String> timelong = new ArrayList<>();
        for(Long time:resultMap.keySet()){

            timelong.add(String.valueOf(time/60000));
        }

        List<Integer> strKeyOn = new ArrayList<>();
        List<String> longList = new ArrayList<>();

        Calendar c = Calendar.getInstance();
        Date date=new Date();

        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, -2);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        int i = 60 * 24;
        while(i > 0){

            c.add(Calendar.MINUTE, 1);
            longList.add(String.valueOf(c.getTimeInMillis()/60000));
            i--;
        }
//        System.out.println(longList);
        for (String str:longList)
        {
            if (!timelong.contains(str))
            {
                strKeyOn.add(0);

            }
            else
            {
                strKeyOn.add(1);

            }
        }
        System.out.println(strKeyOn.size());
        String str = "";
       /* for(int s=0;s<strKeyOn.size();s++){
            str += strKeyOn.get(s);
        }*/
       /* for (int m=0;m<str.length()/15;m+=15)
        {

        }*/
       List<String> listcontain = new ArrayList<>();
        List<String> listonly = new ArrayList<>();
        List<String> list8 = new ArrayList<>();
        AverageAssign averageAssign=new AverageAssign();
        List<List<Integer>> lists=averageAssign.averageAssign(strKeyOn, strKeyOn.size()/15);
        System.out.println(lists);
        for (int l=0;l<lists.size();l++)
        {
            if (String.valueOf(lists.get(l)).contains("1"))
                listcontain.add("1");
            else
                listcontain.add("0");

        }
        for(int s=0;s<listcontain.size();s++){
            str += listcontain.get(s);
        }
        for (int l=0;l<lists.size();l++)
        {
            Set s = new HashSet(lists.get(l));

            if (s.size()==1 && s.contains(1))
                listonly.add("1");
            else
                listonly.add("0");

        }
        String str2 ="";
        for(int s=0;s<listonly.size();s++){
            str2 += listonly.get(s);
        }
        for (int l=0;l<lists.size();l++)
        {
            int sum=0;
            for (int count:lists.get(l))
            {
                sum+=count;
            }
            if (String.valueOf(lists.get(l)).contains("1"))
                sum++;
            System.out.println(sum);
            if (sum>8)
                list8.add("1");
            else
                list8.add("0");
        }
        String str3="";
        for(int s=0;s<list8.size();s++){
            str3 += list8.get(s);
        }
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        result.put("Vcl_ID", deviceID);
        result.put("KeyOn15", str);
        outputSql.add(result);
    }
}
