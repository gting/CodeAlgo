package test;


import com.sagittarius.exceptions.NoHostAvailableException;
import com.sagittarius.exceptions.QueryExecutionException;
import com.sagittarius.exceptions.TimeoutException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tsinghua.thss.sdk.bean.common.Device;
import tsinghua.thss.sdk.bean.common.Point;
import tsinghua.thss.sdk.core.Client;
import tsinghua.thss.sdk.read.Reader;
import tsinghua.thss.sdk.write.Writer;

public class Kmx {
    private static Reader reader;
    private static Writer writer;
    private static final Logger logger = LoggerFactory.getLogger(Kmx.class);
    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private ArrayList<String> sensorIds = new ArrayList();
    private ArrayList<String> deviceIds = new ArrayList();
    private ArrayList<String> SqlDevices = new ArrayList();

    public ArrayList<String> deviceIds() {
        reader = KmxConn.getClient().getReader();
        writer = KmxConn.getClient().getWriter();

        List<Device> devices = null;

//        this.deviceIds.add("10021421174");
//        this.deviceIds.add("10021700450");
        try {
            devices = reader.getDevicesByType("DS20170418222357430");
        } catch (NoHostAvailableException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (QueryExecutionException e) {
            e.printStackTrace();
        }
        ArrayList<String> deviceIds = new ArrayList<>();
        for(Device d:devices){
            if(d.getId().startsWith("1001")){
                deviceIds.add(d.getId());
//                System.out.println(d.getId());
            }
//            System.out.println(d.getId());
            if(deviceIds.size()>20000){
                break;
            }
        }
        return this.deviceIds;
    }

    public ArrayList<String> sensorIds(String[] str, int n) {
        for (int i = 0; i < n; i++) {
            this.sensorIds.add(str[i]);
        }
        return this.sensorIds;
    }

    public ArrayList<String> deviceIdsSql(String pathname)
            throws IOException {
        reader = KmxConn.getClient().getReader();
        File ctoFile = new File(pathname);
        InputStreamReader rdCto = new InputStreamReader(new FileInputStream(ctoFile));
        BufferedReader bfReader = new BufferedReader(rdCto);
        String txtline = null;
        while ((txtline = bfReader.readLine()) != null) {
            this.SqlDevices.add(txtline);
        }
        bfReader.close();
        return this.SqlDevices;
    }

    public void range(ArrayList<String> deviceIds, ArrayList<String> sensorIds, long time1, long time2)
            throws NoHostAvailableException, QueryExecutionException, TimeoutException {
        Map<String, Map<String, List<Point>>> r7 = reader.getRange(deviceIds, sensorIds, time1, time2);
        System.out.println(r7);
        int num = 0;

        for (String key : r7.keySet()) {
            Map<String, List<Point>> sensorData = r7.get(key);
            sensorData = (Map) r7.get(key);
            System.out.println(key);
            for (String key2 : sensorData.keySet()) {
                System.out.println(key2);
                List<Point> list = (List) sensorData.get(key2);
                List<String> stringList=new ArrayList<>();
                for (Point p : list) {
//                    if (p.getValue().contains("7E0F861477034342566FF6")) {
//                        System.out.println("\t" + p.getPrimaryTime() + "\t" + df.format(new Date(p.getPrimaryTime())) + "\t" + p.getSecondaryTime() + "\t" + p.getValue() + "*****" + p.getValueType());
//
//                        String jsongps = "[" + p.getValue() + "]";
//                        JSONArray arrFC = JSON.parseArray(jsongps);
//                        Map<String, Object> mapTypes;
//                        for (int k = 0; k < arrFC.size(); k++) {
//                            mapTypes = arrFC.getJSONObject(k);
//                            for (String key3 : mapTypes.keySet()) {
//                                if (key3.equals("packetData"))
//                                {
//                                    stringList.add(mapTypes.get(key3).toString());
//                                    try {
//                                        LogWriter.log(mapTypes.get(key3).toString().substring(70,mapTypes.get(key3).toString().length()-6));
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//
//                            }
//                        }
//                        num += 1;
//                    }
//                    if(!p.getValue().equals("2368806.0"))
                        System.out.println("\t" + p.getPrimaryTime() + "\t" + df.format(new Date(p.getPrimaryTime())) + "\t" + p.getSecondaryTime() + "\t" + p.getValue()+"\t"+p.getValueType());
                    try {
                        LogWriter.log(df.format(new Date(p.getPrimaryTime())).toString());
                        LogWriter.log("\t");
                        LogWriter.log(df.format(new Date(p.getSecondaryTime())).toString());
                        LogWriter.log("\t");
                        LogWriter.log( p.getValue().toString());
                        LogWriter.log("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(stringList);
            }
        }
        Map<String, List<Point>> sensorData;
        System.out.println(num);
    }

    public void last(ArrayList<String> deviceIds, ArrayList<String> sensorIds)
            throws Exception {
        Map<String, Map<String, Point>> r6 = reader.getLatestPoint(deviceIds, sensorIds);
        System.out.println(r6);
        int num = 0;
        for (String key : r6.keySet()) {
            Map<String, Point> sensorData = r6.get(key);
            sensorData = (Map) r6.get(key);
            System.out.println(key);
            for (String key2 : sensorData.keySet()) {
                System.out.println(df.format(new Date(((Point) sensorData.get(key2)).getPrimaryTime())) + "\t" + key2 + "\t" + ((Point) sensorData.get(key2)).getPrimaryTime() + "\t" + ((Point) sensorData.get(key2)).getSecondaryTime() + "\t" + ((Point) sensorData.get(key2)).getValue() + "*****" + ((Point) sensorData.get(key2)).getValueType());

                num += 1;
            }
        }
        Map<String, Point> sensorData;
    }

    public void point(ArrayList<String> deviceIds, ArrayList<String> sensorIds, long time1)
            throws Exception {
        Map<String, Map<String, Point>> r4 = reader.getPrecisePoint(deviceIds, sensorIds, time1);
        System.out.println(r4);
        for (String key : r4.keySet()) {
            Map<String, Point> map = r4.get(key);
            map = (Map) r4.get(key);
            for (String key2 : map.keySet()) {
                System.out.println(key2 + "========" + ((Point) map.get(key2)).getValue());
            }
        }
        Map<String, Point> map;
    }
}
