package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class LogWriter
{
    private static boolean fileLog = true;
    private static String logFileName = "C:/Users/guoting.TYCMC/Desktop/Source3.log";
    private static String readFileName = "C:/Users/guoting/Desktop/864811033279071.txt";

    public static void log(String info)
            throws IOException
    {
        OutputStream out = getOutputStream();
        out.write(info.getBytes("utf-8"));
    }

    public static OutputStream getOutputStream()
            throws IOException
    {
        if (fileLog)
        {
            File file = new File(logFileName);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
            }
            return new FileOutputStream(file, true);
        }
        return System.out;
    }

    public static String readtxt(String path)
            throws IOException
    {
        File file = new File(path);
        BufferedInputStream fls = new BufferedInputStream(new FileInputStream(file));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fls, "utf-8"), 5242880);

        String result = "";

        return result;
    }
}
