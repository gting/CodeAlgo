package ty.pas.analy;

import com.sagittarius.bean.result.*;
import com.sagittarius.util.TimeUtil;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class RepeatCompare extends UserFunction {
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, String>> sqllistPgn = sqlData.get("PGN_CompareData").get(deviceID);
        List<Map<String, String>> sqllistTiming = sqlData.get("Timing_CompareData").get(deviceID);
        int allcount=0;
        int wrongnum=0;
        if ((sqllistPgn!=null&&sqllistPgn.size()>0)||(sqllistTiming!=null&&sqllistTiming.size()>0))
        {
            List<FloatPoint> J_0001_EE_917 = floatInput.get(deviceID).get("J_0001_EE_917");
            List<FloatPoint> J_0001_00_84 = floatInput.get(deviceID).get("J_0001_00_84");
            List<FloatPoint> J_0001_00_917 = floatInput.get(deviceID).get("J_0001_00_917");
            List<String> list = new ArrayList<String>();
            List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
            if (J_0001_EE_917 != null) {
                alldata.addAll(J_0001_EE_917);
                list.add("J_0001_EE_917");
            }
            if (J_0001_00_84 != null) {
                alldata.addAll(J_0001_00_84);
                list.add("J_0001_00_84");
            }
            if (J_0001_00_917 != null) {
                alldata.addAll(J_0001_00_917);
                list.add("J_0001_00_917");
            }
            HashMap<String, Object> result = new HashMap<String, Object>();
            //对齐
            Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                    Collectors.groupingBy(AbstractPoint::getPrimaryTime));
            if (list != null) {
                if (resultMap != null) {
                    if (resultMap.keySet().size() != 0) {
                        for (Map<String, String> smap : sqllistPgn) {
                            String MsgP_SysPIP_ID1=smap.get("MsgP_PGNValue1");
                            String MsgP_SysPIP_ID4=smap.get("MsgP_PGNValue4");
                            String MsgP_SysPIP_ID16=smap.get("MsgP_PGNValue5");
                            String MsgP_MsgTime = smap.get("MsgP_MsgTime");
                            long time = 0L;
                            try {
                                time = TimeUtil.string2Date(MsgP_MsgTime, df);

                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            List<AbstractPoint> listpoint = resultMap.get(time);
                            if (listpoint != null) {
                                for (AbstractPoint ap : listpoint) {
                                    if (ap.getMetric().equals("J_0001_EE_917")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgP_SysPIP_ID1 != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgP_SysPIP_ID1.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                    if (ap.getMetric().equals("J_0001_00_84")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgP_SysPIP_ID4 != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgP_SysPIP_ID4.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                    if (ap.getMetric().equals("J_0001_00_917")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgP_SysPIP_ID16 != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgP_SysPIP_ID16.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                }
                            }
                        }
                        for (Map<String, String> smap : sqllistPgn) {
                            String MsgT_VclSpeed=smap.get("MsgT_VclSpeed");
                            String MsgT_tRunKmExact_PGN=smap.get("MsgT_tRunKmExact_PGN");
                            String MsgT_tRunKmExact=smap.get("MsgT_tRunKmExact");
                            String MsgT_MsgTime = smap.get("MsgT_MsgTime");
                            long time = 0L;
                            try {
                                time = TimeUtil.string2Date(MsgT_MsgTime, df);

                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            List<AbstractPoint> listpoint = resultMap.get(time);
                            if (listpoint != null) {
                                for (AbstractPoint ap : listpoint) {
                                    if (ap.getMetric().equals("J_0001_EE_917")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgT_tRunKmExact_PGN != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgT_tRunKmExact_PGN.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                    if (ap.getMetric().equals("J_0001_00_84")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgT_VclSpeed != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgT_VclSpeed.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                    if (ap.getMetric().equals("J_0001_00_917")) {
                                        FloatPoint ap2 = (FloatPoint) ap;
                                        if (MsgT_tRunKmExact != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgT_tRunKmExact.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            result.put("Vcl_ID",deviceID);
            result.put("Msg_Time",new SimpleDateFormat("yyyy-MM-dd").format(new Date(startTime)));
            result.put("Table_Name","");
            result.put("Wrong_count",wrongnum+"");
            result.put("All_count",allcount+"");
            outputSql.add(result);
        }
    }
}
