package test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class GetDevice
{
    Kmx kmx = new Kmx();

    public ArrayList<String> GetDevice(String pathname)
    {
        ArrayList<String> deviceIds = new ArrayList();
        ArrayList<String> device = new ArrayList();
        try
        {
            deviceIds = this.kmx.deviceIdsSql(pathname);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < deviceIds.size(); i++)
        {
            device.add(deviceIds.get(i));
            if (device.size() > 1)
            {
                device.remove(device.size() - 2);
                System.out.println(device);
                return device;
            }
        }
        return null;
    }

    public static void device(int i)
    {
        if (i > 0) {}
    }
}
