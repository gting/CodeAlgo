package test;

import com.sagittarius.util.TimeUtil;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
            throws Exception
    {
        Kmx kmx = new Kmx();
        long time1 = TimeUtil.string2Date("2018-08-30 00:00:00.000000");
        long time2 = TimeUtil.string2Date("2018-09-01 00:00:00.000000");

        ArrayList<String> deviceIds = new ArrayList();
        ArrayList<String> sensorIds = new ArrayList();

        deviceIds = kmx.deviceIds();

        String[] strArr = { "TY_0002_00_04" };

        sensorIds = kmx.sensorIds(strArr, strArr.length);
        ArrayList<String> device = new ArrayList();
        for (int i = 0; i < deviceIds.size(); i++)
        {
            device.add(deviceIds.get(i));
            try
            {
                kmx.range(device, sensorIds, time1, time2);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            device.clear();
        }
        System.out.println("end");
    }
}
