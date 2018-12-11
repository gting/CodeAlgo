package ty.pas.analy;

import edu.thss.platform.pas.userfunc.*;
import com.sagittarius.bean.result.*;

import java.util.function.*;
import java.util.stream.*;

import com.sagittarius.util.*;

import java.text.*;
import java.math.*;
import java.util.*;

import com.alibaba.fastjson.*;

public class Event extends UserFunction {
    public void runOne(List<String> deviceList, Map<String, Map<String, List<Map<String, String>>>> sqlData, Map<String, Map<String, List<FloatPoint>>> floatInput, Map<String, Map<String, List<DoublePoint>>> doubleInput, Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput, Map<String, Map<String, List<LongPoint>>> longInput, Map<String, Map<String, List<BooleanPoint>>> booleanInput, Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String deviceID = deviceList.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Map<String, String>> sqllist = sqlData.get("Event_CompareData").get(deviceID);
        if (sqllist!=null && sqllist.size()>0) {
            int allcount = 0;
            int wrongnum = 0;
//            List<IntPoint> distList = intInput.get(deviceID).get("TY_0001_00_18");
            List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0002_00_677");
            List<LongPoint> distList3 = longInput.get(deviceID).get("TY_0002_00_678");
            List<LongPoint> distList4 = longInput.get(deviceID).get("TY_0002_00_679");
            List<StringPoint> distList5 = stringInput.get(deviceID).get("TY_0002_00_680");
            List<LongPoint> distList6 = longInput.get(deviceID).get("TY_0002_00_681");
            List<LongPoint> distList7 = longInput.get(deviceID).get("TY_0002_00_682");
            List<FloatPoint> distList8 = floatInput.get(deviceID).get("TY_0002_00_683");
//            List<FloatPoint> distList9 = floatInput.get(deviceID).get("TY_0002_00_684");
            List<FloatPoint> distList10 = floatInput.get(deviceID).get("TY_0002_00_685");
            List<LongPoint> distList11 = longInput.get(deviceID).get("TY_0002_00_686");
            List<LongPoint> distList12 = longInput.get(deviceID).get("TY_0002_00_687");
            List<LongPoint> distList13 = longInput.get(deviceID).get("TY_0002_00_688");
            List<LongPoint> distList14 = longInput.get(deviceID).get("TY_0002_00_689");
            List<FloatPoint> distList15 = floatInput.get(deviceID).get("TY_0002_00_690");
            List<LongPoint> distList16 = longInput.get(deviceID).get("TY_0002_00_691");
            List<LongPoint> distList17 = longInput.get(deviceID).get("TY_0002_00_692");
            List<LongPoint> distList18 = longInput.get(deviceID).get("TY_0002_00_693");
            List<LongPoint> distList19 = longInput.get(deviceID).get("TY_0002_00_694");
//            List<FloatPoint> distList20 = floatInput.get(deviceID).get("TY_0002_00_695");
//            List<FloatPoint> distList21 = floatInput.get(deviceID).get("TY_0002_00_696");
            List<FloatPoint> distList22 = floatInput.get(deviceID).get("TY_0002_00_697");
            List<LongPoint> distList23 = longInput.get(deviceID).get("TY_0002_00_698");
            List<LongPoint> distList24 = longInput.get(deviceID).get("TY_0002_00_699");
//            List<FloatPoint> distList25 = floatInput.get(deviceID).get("TY_0002_00_700");
            List<FloatPoint> distList26 = floatInput.get(deviceID).get("TY_0002_00_701");
            List<LongPoint> distList27 = longInput.get(deviceID).get("TY_0002_00_702");
            List<LongPoint> distList28 = longInput.get(deviceID).get("TY_0002_00_703");
            List<StringPoint> distList29 = stringInput.get(deviceID).get("TY_0002_00_704");
            List<LongPoint> distList30 = longInput.get(deviceID).get("TY_0002_00_705");
            List<LongPoint> distList31 = longInput.get(deviceID).get("TY_0002_00_706");
            List<FloatPoint> distList32 = floatInput.get(deviceID).get("TY_0002_00_707");
//            List<FloatPoint> distList33 = floatInput.get(deviceID).get("TY_0002_00_708");
            List<FloatPoint> distList34 = floatInput.get(deviceID).get("TY_0002_00_709");
            List<LongPoint> distList35 = longInput.get(deviceID).get("TY_0002_00_710");
            List<LongPoint> distList36 = longInput.get(deviceID).get("TY_0002_00_711");
            List<StringPoint> distList37 = stringInput.get(deviceID).get("TY_0002_00_712");
            List<LongPoint> distList38 = longInput.get(deviceID).get("TY_0002_00_713");
            List<IntPoint> distList39 = intInput.get(deviceID).get("TY_0002_00_714");
            List<StringPoint> distList40 = stringInput.get(deviceID).get("TY_0002_00_715");
            List<LongPoint> distList41 = longInput.get(deviceID).get("TY_0002_00_716");
            List<LongPoint> distList42 = longInput.get(deviceID).get("TY_0002_00_717");
            List<LongPoint> distList43 = longInput.get(deviceID).get("TY_0002_00_718");
            List<LongPoint> distList44 = longInput.get(deviceID).get("TY_0002_00_719");
            List<LongPoint> distList45 = longInput.get(deviceID).get("TY_0002_00_720");
            List<IntPoint> distList46 = intInput.get(deviceID).get("TY_0002_00_721");
//            List<FloatPoint> distList47 = floatInput.get(deviceID).get("TY_0002_00_722");
//            List<FloatPoint> distList48 = floatInput.get(deviceID).get("TY_0002_00_723");
            List<StringPoint> distList49 = stringInput.get(deviceID).get("TY_0002_00_724");
            List<LongPoint> distList50 = longInput.get(deviceID).get("TY_0002_00_725");
            List<IntPoint> distList51 = intInput.get(deviceID).get("TY_0002_00_726");
//            List<FloatPoint> distList52 = floatInput.get(deviceID).get("TY_0002_00_727");
//            List<FloatPoint> distList53 = floatInput.get(deviceID).get("TY_0002_00_728");
            List<StringPoint> distList54 = stringInput.get(deviceID).get("TY_0002_00_729");
            List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
            List<String> list = new ArrayList<String>();

            if (distList2 != null) {
                alldata.addAll(distList2);
                list.add("TY_0002_00_677");
            }
            if (distList3 != null) {
                alldata.addAll(distList3);
                list.add("TY_0002_00_678");
            }
            if (distList4 != null) {
                alldata.addAll(distList4);
                list.add("TY_0002_00_679");
            }
            if (distList5 != null) {
                alldata.addAll(distList5);
                list.add("TY_0002_00_680");
            }
            if (distList6 != null) {
                alldata.addAll(distList6);
                list.add("TY_0002_00_681");
            }
            if (distList7 != null) {
                alldata.addAll(distList7);
                list.add("TY_0002_00_682");
            }
            if (distList8 != null) {
                alldata.addAll(distList8);
                list.add("TY_0002_00_683");
            }

            if (distList10 != null) {
                alldata.addAll(distList10);
                list.add("TY_0002_00_685");
            }
            if (distList11 != null) {
                alldata.addAll(distList11);
                list.add("TY_0002_00_686");
            }
            if (distList12 != null) {
                alldata.addAll(distList12);
                list.add("TY_0002_00_687");
            }
            if (distList13 != null) {
                alldata.addAll(distList13);
                list.add("TY_0002_00_688");
            }
            if (distList14 != null) {
                alldata.addAll(distList14);
                list.add("TY_0002_00_689");
            }
            if (distList15 != null) {
                alldata.addAll(distList15);
                list.add("TY_0002_00_690");
            }
            if (distList16 != null) {
                alldata.addAll(distList16);
                list.add("TY_0002_00_691");
            }
            if (distList17 != null) {
                alldata.addAll(distList17);
                list.add("TY_0002_00_692");
            }
            if (distList18 != null) {
                alldata.addAll(distList18);
                list.add("TY_0002_00_693");
            }
            if (distList19 != null) {
                alldata.addAll(distList19);
                list.add("TY_0002_00_694");
            }

            if (distList22 != null) {
                alldata.addAll(distList22);
                list.add("TY_0002_00_697");
            }
            if (distList23 != null) {
                alldata.addAll(distList23);
                list.add("TY_0002_00_698");
            }
            if (distList24 != null) {
                alldata.addAll(distList24);
                list.add("TY_0002_00_699");
            }

            if (distList26 != null) {
                alldata.addAll(distList26);
                list.add("TY_0002_00_701");
            }
            if (distList27 != null) {
                alldata.addAll(distList27);
                list.add("TY_0002_00_702");
            }
            if (distList28 != null) {
                alldata.addAll(distList28);
                list.add("TY_0002_00_703");
            }
            if (distList29 != null) {
                alldata.addAll(distList29);
                list.add("TY_0002_00_704");
            }
            if (distList30 != null) {
                alldata.addAll(distList30);
                list.add("TY_0002_00_705");
            }
            if (distList31 != null) {
                alldata.addAll(distList31);
                list.add("TY_0002_00_706");
            }
            if (distList32 != null) {
                alldata.addAll(distList32);
                list.add("TY_0002_00_707");
            }

            if (distList34 != null) {
                alldata.addAll(distList34);
                list.add("TY_0002_00_709");
            }
            if (distList35 != null) {
                alldata.addAll(distList35);
                list.add("TY_0002_00_710");
            }
            if (distList36 != null) {
                alldata.addAll(distList36);
                list.add("TY_0002_00_711");
            }
            if (distList37 != null) {
                alldata.addAll(distList37);
                list.add("TY_0002_00_712");
            }
            if (distList38 != null) {
                alldata.addAll(distList38);
                list.add("TY_0002_00_713");
            }
            if (distList39 != null) {
                alldata.addAll(distList39);
                list.add("TY_0002_00_714");
            }
            if (distList40 != null) {
                alldata.addAll(distList40);
                list.add("TY_0002_00_715");
            }
            if (distList41 != null) {
                alldata.addAll(distList41);
                list.add("TY_0002_00_716");
            }
            if (distList42 != null) {
                alldata.addAll(distList42);
                list.add("TY_0002_00_717");
            }
            if (distList43 != null) {
                alldata.addAll(distList43);
                list.add("TY_0002_00_718");
            }
            if (distList44 != null) {
                alldata.addAll(distList44);
                list.add("TY_0002_00_719");
            }
            if (distList45 != null) {
                alldata.addAll(distList45);
                list.add("TY_0002_00_720");
            }
            if (distList46 != null) {
                alldata.addAll(distList46);
                list.add("TY_0002_00_721");
            }

            if (distList49 != null) {
                alldata.addAll(distList49);
                list.add("TY_0002_00_724");
            }
            if (distList50 != null) {
                alldata.addAll(distList50);
                list.add("TY_0002_00_725");
            }
            if (distList51 != null) {
                alldata.addAll(distList51);
                list.add("TY_0002_00_726");
            }

            if (distList54 != null) {
                alldata.addAll(distList54);
                list.add("TY_0002_00_729");
            }
            HashMap<String, Object> result = new HashMap<String, Object>();
            //对齐
            Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                    Collectors.groupingBy(AbstractPoint::getPrimaryTime));


            if (list != null) {
                if (resultMap != null) {
                    if (resultMap.keySet().size() != 0) {
                        for (Map<String, String> smap : sqllist) {
                            String MsgERC_ID = smap.get("MsgERC_ID");
                            String MsgERC_Vcl_ID = smap.get("MsgERC_Vcl_ID");
                            String MsgERC_MsgTime = smap.get("MsgERC_MsgTime");
//                            String MsgERC_EventCount = smap.get("MsgERC_EventCount");
                            String MsgERC_SysE_ID = smap.get("MsgERC_SysE_ID");
                            String MsgERC_BgnTime = smap.get("MsgERC_BgnTime");
                            String MsgERC_EndTime = smap.get("MsgERC_EndTime");
                            String MsgERC_Lo = smap.get("MsgERC_Lo");
                            String MsgERC_La = smap.get("MsgERC_La");
//                            String MsgERC_Direction = smap.get("MsgERC_Direction");
//                            String MsgERC_Speed = smap.get("MsgERC_Speed");
//                            String MsgERC_Satellite = smap.get("MsgERC_Satellite");
//                            String MsgERC_GSMSignal = smap.get("MsgERC_GSMSignal");
                            String MsgERC_MaxSpeed = smap.get("MsgERC_MaxSpeed");
//                            String MsgERC_AvgSpeed = smap.get("MsgERC_AvgSpeed");
//                            String MsgERC_MaxAddSpeed = smap.get("MsgERC_MaxAddSpeed");
//                            String MsgERC_AvgAddSpeed = smap.get("MsgERC_AvgAddSpeed");
                            String MsgERC_RunKm = smap.get("MsgERC_RunKm");
//                            String MsgERC_AvgThrottle = smap.get("MsgERC_AvgThrottle");
//                            String MsgERC_BgnSpeed = smap.get("MsgERC_BgnSpeed");
//                            String MsgERC_EndSpeed = smap.get("MsgERC_EndSpeed");
                            String MsgERC_RecordTimes = smap.get("MsgERC_RecordTimes");
                            String MsgERC_DurationTime = smap.get("MsgERC_DurationTime");
                            String MsgERC_BgnMileage = smap.get("MsgERC_BgnMileage");
                            String MsgERC_EndMileage = smap.get("MsgERC_EndMileage");
                            HashMap<String, Object> result2 = new HashMap<String, Object>();
                            long time = 0L;
                            long MsgERC_BgnTime2 = 0L;
                            long MsgERC_EndTime2 = 0L;
                            try {
                                time = TimeUtil.string2Date(MsgERC_MsgTime, df);
                                if (MsgERC_BgnTime != null) {
                                    MsgERC_BgnTime2 = TimeUtil.string2Date(MsgERC_BgnTime, df);
                                }
                                if (MsgERC_EndTime != null) {
                                    MsgERC_EndTime2 = TimeUtil.string2Date(MsgERC_EndTime, df);
                                }
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            List<AbstractPoint> listpoint = resultMap.get(time);
                            if (listpoint != null) {
                                for (AbstractPoint ap : listpoint) {
                                    if (ap.getMetric().equals("TY_0002_00_677")) {
                                        IntPoint ap2 = (IntPoint) ap;
                                        if (MsgERC_SysE_ID != null) {
                                            if (String.valueOf(ap2.getValue()) == null) {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }
                                        if (MsgERC_SysE_ID.equals(String.valueOf(ap2.getValue()))) {
                                            allcount = allcount + 1;
                                        } else {
                                            allcount = allcount + 1;
                                            wrongnum = wrongnum + 1;
                                        }

                                    }

                                    if (MsgERC_SysE_ID.equals("1")) {
                                        if (ap.getMetric().equals("TY_0002_00_678")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }
                                        if (ap.getMetric().equals("TY_0002_00_679")) {
                                            LongPoint ap3 = (LongPoint) ap;
                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }

                                        if (ap.getMetric().equals("TY_0002_00_680")) {
                                            StringPoint ap4 = (StringPoint) ap;
                                            String jsongps = "[" + ap4.getValue() + "]";
                                            JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                                for (String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for (String key2 : result2.keySet()) {

                                                if (key2.equals("Lo")) {
                                                    String Lo1 = null;
                                                    String Lo2 = null;
                                                    BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                    int s = MsgERC_Lo.indexOf(".");
                                                    if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                        Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                        Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }
                                                    }
                                                    if (Lo1 == null) {
                                                        if (Lo2 != null) {
                                                            if (Lo2.equals(MsgERC_Lo)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (Lo1.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;

                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                }

                                                if (key2.equals("La")) {
                                                    BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                    String La1 = null;
                                                    String La2 = null;
                                                    int s = MsgERC_La.indexOf(".");
                                                    if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                        La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                        La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }
                                                    }
                                                    if (La1 == null) {
                                                        if (La2 != null) {
                                                            if (La2.equals(MsgERC_La)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }
                                                        }
                                                    } else {
                                                        if (La1.equals(MsgERC_La)) {
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

                                    if (MsgERC_SysE_ID.equals("2")) {
                                        if (ap.getMetric().equals("TY_0002_00_681")) {
                                            LongPoint ap3 = (LongPoint) ap;


                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }
                                        if (ap.getMetric().equals("TY_0002_00_682")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }
                                        if (ap.getMetric().equals("TY_0002_00_683")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_MaxSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            } else if (MsgERC_MaxSpeed != null && String.valueOf(ap5.getValue()) != null) {
                                                String ap6 = String.valueOf(ap5.getValue());
                                                BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                BigDecimal b6 = new BigDecimal(MsgERC_MaxSpeed);
                                                int s2 = MsgERC_MaxSpeed.indexOf(".");
                                                if (MsgERC_MaxSpeed.length() >= ap6.toString().length()) {
                                                    if (MsgERC_MaxSpeed.length() > ap6.toString().length()) {
                                                        MsgERC_MaxSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                    }
                                                } else {
                                                    ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                }
                                                if (MsgERC_MaxSpeed.equals(ap6)) {
                                                    allcount = allcount + 1;

                                                } else {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_685")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                    int s2 = MsgERC_RunKm.indexOf(".");
                                                    if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                        if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                            MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_RunKm.equals(ap6)) {
                                                        allcount = allcount + 1;

                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }
                                    }

                                    if (MsgERC_SysE_ID.equals("3")) {

                                        if (ap.getMetric().equals("TY_0002_00_686")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    allcount = allcount + 1;
                                                } else {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }

                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_687")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }

                                    }
                                    if (MsgERC_SysE_ID.equals("4")) {

                                        if (ap.getMetric().equals("TY_0002_00_688")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }


                                        if (ap.getMetric().equals("TY_0002_00_689")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_690")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                    int s2 = MsgERC_RunKm.indexOf(".");
                                                    if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                        if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                            MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_RunKm.equals(ap6)) {
                                                        allcount = allcount + 1;

                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }
                                    }


                                    if (MsgERC_SysE_ID.equals("5")) {

                                        if (ap.getMetric().equals("TY_0002_00_691")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }
                                        if (ap.getMetric().equals("TY_0002_00_692")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                    }

                                    if (MsgERC_SysE_ID.equals("6")) {
                                        if (ap.getMetric().equals("TY_0002_00_693")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_694")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_695")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_MaxSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (MsgERC_MaxSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_MaxSpeed);
                                                    int s2 = MsgERC_MaxSpeed.indexOf(".");
                                                    if (MsgERC_MaxSpeed.length() >= ap6.toString().length()) {
                                                        if (MsgERC_MaxSpeed.length() > ap6.toString().length()) {
                                                            MsgERC_MaxSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_MaxSpeed.equals(ap6)) {
                                                        allcount = allcount + 1;
                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }

                                        if (ap.getMetric().equals("TY_0002_00_697")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                    int s2 = MsgERC_RunKm.indexOf(".");
                                                    if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                        if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                            MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_RunKm.equals(ap6)) {
                                                        allcount = allcount + 1;
                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }
                                    }

                                    if (MsgERC_SysE_ID.equals("7")) {

                                        if (ap.getMetric().equals("TY_0002_00_698")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_699")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_701")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                    int s2 = MsgERC_RunKm.indexOf(".");
                                                    if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                        if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                            MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_RunKm.equals(ap6)) {
                                                        allcount = allcount + 1;
                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }

                                        }
                                    }

                                    if (MsgERC_SysE_ID.equals("9")) {

                                        if (ap.getMetric().equals("TY_0002_00_702")) {
                                            LongPoint ap3 = (LongPoint) ap;
                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_703")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_704")) {
                                            StringPoint ap4 = (StringPoint) ap;
                                            String jsongps = "[" + ap4.getValue() + "]";
                                            JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                                for (String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for (String key2 : result2.keySet()) {
                                                if (key2.equals("Lo")) {
                                                    String Lo1 = null;
                                                    String Lo2 = null;
                                                    BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                    int s = MsgERC_Lo.indexOf(".");
                                                    if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                        Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                        Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }
                                                    }

                                                    if (Lo1 == null) {
                                                        if (Lo2 != null) {
                                                            if (Lo2.equals(MsgERC_Lo)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (Lo1.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;

                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }

                                                }


                                                if (key2.equals("La")) {
                                                    BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                    String La1 = null;
                                                    String La2 = null;
                                                    int s = MsgERC_La.indexOf(".");
                                                    if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                        La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                        La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }
                                                    }

                                                    if (La1 == null) {
                                                        if (La2 != null) {
                                                            if (La2.equals(MsgERC_La)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }
                                                        }
                                                    } else {
                                                        if (La1.equals(MsgERC_La)) {
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

                                    if (MsgERC_SysE_ID.equals("10")) {

                                        if (ap.getMetric().equals("TY_0002_00_705")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }

                                        if (ap.getMetric().equals("TY_0002_00_706")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_707")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_MaxSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_MaxSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_MaxSpeed);
                                                    int s2 = MsgERC_MaxSpeed.indexOf(".");
                                                    if (MsgERC_MaxSpeed.length() >= ap6.toString().length()) {
                                                        if (MsgERC_MaxSpeed.length() > ap6.toString().length()) {
                                                            MsgERC_MaxSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_MaxSpeed.equals(ap6)) {
                                                        allcount = allcount + 1;

                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }


                                        if (ap.getMetric().equals("TY_0002_00_709")) {
                                            FloatPoint ap5 = (FloatPoint) ap;

                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_RunKm != null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                    BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                    BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                    int s2 = MsgERC_RunKm.indexOf(".");
                                                    if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                        if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                            MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    } else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_RunKm.equals(ap6)) {
                                                        allcount = allcount + 1;

                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                        }
                                    }

                                    if (MsgERC_SysE_ID.equals("12")) {

                                        if (ap.getMetric().equals("TY_0002_00_710")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_711")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_RecordTimes != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_RecordTimes).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_712")) {
                                            StringPoint ap4 = (StringPoint) ap;
                                            String jsongps = "[" + ap4.getValue() + "]";
                                            JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                                for (String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for (String key2 : result2.keySet()) {

                                                if (key2.equals("Lo")) {
                                                    String Lo1 = null;
                                                    String Lo2 = null;
                                                    BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                    int s = MsgERC_Lo.indexOf(".");
                                                    if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                        Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                        Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;

                                                        }
                                                    }

                                                    if (Lo1 == null) {
                                                        if (Lo2 != null) {
                                                            if (Lo2.equals(MsgERC_Lo)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (Lo1.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;

                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                }


                                                if (key2.equals("La")) {
                                                    BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                    String La1 = null;
                                                    String La2 = null;
                                                    int s = MsgERC_La.indexOf(".");
                                                    if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                        La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                        La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;

                                                        }
                                                    }

                                                    if (La1 == null) {
                                                        if (La2 != null) {
                                                            if (La2.equals(MsgERC_La)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (La1.equals(MsgERC_La)) {
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
                                    if (MsgERC_SysE_ID.equals("13")) {

                                        if (ap.getMetric().equals("TY_0002_00_713")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_714")) {
                                            IntPoint ap2 = (IntPoint) ap;

                                            if (MsgERC_DurationTime != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_715")) {
                                            StringPoint ap4 = (StringPoint) ap;
                                            String jsongps = "[" + ap4.getValue() + "]";
                                            JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                                for (String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for (String key2 : result2.keySet()) {

                                                if (key2.equals("Lo")) {
                                                    String Lo1 = null;
                                                    String Lo2 = null;
                                                    BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                    int s = MsgERC_Lo.indexOf(".");
                                                    if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                        Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                        Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;

                                                        }
                                                    }

                                                    if (Lo1 == null) {
                                                        if (Lo2 != null) {
                                                            if (Lo2.equals(MsgERC_Lo)) {
                                                                allcount = allcount + 1;

                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (Lo1.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;
                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                }

                                                if (key2.equals("La")) {
                                                    BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                    String La1 = null;
                                                    String La2 = null;
                                                    int s = MsgERC_La.indexOf(".");
                                                    if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                        La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                        La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;

                                                        }
                                                    }
                                                    if (La1 == null) {
                                                        if (La2 != null) {
                                                            if (La2.equals(MsgERC_La)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (La1.equals(MsgERC_La)) {
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
                                    if (MsgERC_SysE_ID.equals("14")) {

                                        if (ap.getMetric().equals("TY_0002_00_716")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }
                                        }


                                        if (ap.getMetric().equals("TY_0002_00_717")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnMileage != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_BgnMileage.equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_718")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;

                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_719")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_EndMileage != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_EndMileage.equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }
                                    }

                                    if (MsgERC_SysE_ID.equals("15")) {

                                        if (ap.getMetric().equals("TY_0002_00_720")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_721")) {
                                            IntPoint ap2 = (IntPoint) ap;

                                            if (MsgERC_DurationTime != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }

                                        if (ap.getMetric().equals("TY_0002_00_724")) {
                                            StringPoint ap4 = (StringPoint) ap;
                                            String jsongps = "[" + ap4.getValue() + "]";
                                            JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                                for (String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for (String key2 : result2.keySet()) {
                                                if (key2.equals("Lo")) {
                                                    String Lo1 = null;
                                                    String Lo2 = null;
                                                    BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                    int s = MsgERC_Lo.indexOf(".");
                                                    if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                        Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                        Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                    }
                                                    if (MsgERC_Lo != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }
                                                    }

                                                    if (Lo1 == null) {
                                                        if (Lo2 != null) {
                                                            if (Lo2.equals(MsgERC_Lo)) {
                                                                allcount = allcount + 1;

                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (Lo1.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;
                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                }

                                                if (key2.equals("La")) {
                                                    BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                    BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                    String La1 = null;
                                                    String La2 = null;
                                                    int s = MsgERC_La.indexOf(".");
                                                    if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                        La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                        La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_La != null) {
                                                        if (result2.get(key2) == null) {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;

                                                        }
                                                    }

                                                    if (La1 == null) {
                                                        if (La2 != null) {
                                                            if (La2.equals(MsgERC_La)) {
                                                                allcount = allcount + 1;
                                                            } else {
                                                                allcount = allcount + 1;
                                                                wrongnum = wrongnum + 1;
                                                            }

                                                        }
                                                    } else {
                                                        if (La1.equals(MsgERC_La)) {
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


                                    if (MsgERC_SysE_ID.equals("16")) {

                                        if (ap.getMetric().equals("TY_0002_00_725")) {
                                            LongPoint ap3 = (LongPoint) ap;

                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (ap.getMetric().equals("TY_0002_00_726")) {
                                            IntPoint ap2 = (IntPoint) ap;

                                            if (MsgERC_DurationTime != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    allcount = allcount + 1;
                                                    wrongnum = wrongnum + 1;

                                                }
                                            }
                                            if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                allcount = allcount + 1;
                                            } else {
                                                allcount = allcount + 1;
                                                wrongnum = wrongnum + 1;
                                            }

                                        }


                                        if (!ap.getMetric().equals("TY_0002_00_729")) {
                                            continue;
                                        }
                                        StringPoint ap4 = (StringPoint) ap;
                                        String jsongps = "[" + ap4.getValue() + "]";
                                        JSONArray arrFC = JSON.parseArray(jsongps);
                                        for (int i = 0; i < arrFC.size(); ++i) {
                                            Map<String, Object> mapTypes = (Map<String, Object>) arrFC.getJSONObject(i);
                                            for (String key : mapTypes.keySet()) {
                                                result2.put(key, mapTypes.get(key).toString());
                                            }
                                        }
                                        for (String key2 : result2.keySet()) {

                                            if (key2.equals("Lo")) {
                                                String Lo1 = null;
                                                String Lo2 = null;
                                                BigDecimal b = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                BigDecimal b2 = new BigDecimal(MsgERC_Lo);
                                                int s = MsgERC_Lo.indexOf(".");
                                                if (MsgERC_Lo.length() < result2.get(key2).toString().length()) {
                                                    Lo1 = String.valueOf(b.setScale(MsgERC_Lo.length() - s - 1, 4).doubleValue());
                                                }
                                                if (MsgERC_Lo.length() > result2.get(key2).toString().length()) {
                                                    Lo2 = String.valueOf(b2.setScale(result2.get(key2).toString().length() - s, 4).doubleValue());
                                                }
                                                if (MsgERC_Lo != null) {
                                                    if (result2.get(key2) == null) {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;

                                                    }
                                                }
                                                if (MsgERC_Lo == null) {
                                                    if (result2.get(key2) == null) {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }
                                                }
                                                if (Lo1 == null) {
                                                    if (Lo2 != null) {
                                                        if (Lo2.equals(MsgERC_Lo)) {
                                                            allcount = allcount + 1;
                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                } else {
                                                    if (Lo1.equals(MsgERC_Lo)) {
                                                        allcount = allcount + 1;
                                                    } else {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }

                                                }
                                            }
                                            if (key2.equals("La")) {
                                                BigDecimal b3 = new BigDecimal(Double.valueOf(result2.get(key2).toString()));
                                                BigDecimal b4 = new BigDecimal(MsgERC_La);
                                                String La1 = null;
                                                String La2 = null;
                                                int s = MsgERC_La.indexOf(".");
                                                if (MsgERC_La.length() < result2.get(key2).toString().length()) {
                                                    La1 = String.valueOf(b3.setScale(MsgERC_La.length() - s - 1, 4).doubleValue());
                                                }
                                                if (MsgERC_La.length() > result2.get(key2).toString().length()) {
                                                    La2 = String.valueOf(b4.setScale(result2.get(key2).toString().length() - s - 1, 4).doubleValue());
                                                }
                                                if (MsgERC_La != null) {
                                                    if (result2.get(key2) == null) {
                                                        allcount = allcount + 1;
                                                        wrongnum = wrongnum + 1;
                                                    }
                                                }
                                                if (La1 == null) {
                                                    if (La2 != null) {
                                                        if (La2.equals(MsgERC_La)) {
                                                            allcount = allcount + 1;

                                                        } else {
                                                            allcount = allcount + 1;
                                                            wrongnum = wrongnum + 1;
                                                        }

                                                    }
                                                } else {
                                                    if (La1.equals(MsgERC_La)) {
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
                    }
                }
            }
            result.put("Vcl_ID",deviceID);
            result.put("Msg_Time",new SimpleDateFormat("yyyy-MM-dd").format(new Date(startTime)));
            result.put("Table_Name","Msg_Event_Report_Content");
            result.put("Wrong_count",wrongnum+"");
            result.put("All_count",allcount+"");
            outputSql.add(result);
        }
    }
}
