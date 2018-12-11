package test;

import edu.thss.platform.pas.userfunc.*;
import com.sagittarius.bean.result.*;
import java.util.function.*;
import java.util.stream.*;
import com.sagittarius.util.*;
import java.text.*;
import java.math.*;
import java.util.*;
import com.alibaba.fastjson.*;

public class EventCompare extends UserFunction
{
    public void runOne( List<String> deviceList,  Map<String, Map<String, List<Map<String, String>>>> sqlData,  Map<String, Map<String, List<FloatPoint>>> floatInput,  Map<String, Map<String, List<DoublePoint>>> doubleInput,  Map<String, Map<String, List<StringPoint>>> stringInput,  Map<String, Map<String, List<IntPoint>>> intInput,  Map<String, Map<String, List<LongPoint>>> longInput,  Map<String, Map<String, List<BooleanPoint>>> booleanInput,  Map<String, Map<String, List<GeoPoint>>> geoInput,  long startTime,  long endTime) {
         String deviceID = deviceList.get(0);
         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         List<Map<String, String>> sqllist = sqlData.get("v_Msg_Event_Report").get(deviceID);
        if (sqllist.size() != 0) {
             List<IntPoint> distList = intInput.get(deviceID).get("TY_0001_00_18");
             List<IntPoint> distList2 = intInput.get(deviceID).get("TY_0002_00_677");
             List<LongPoint> distList3 = longInput.get(deviceID).get("TY_0002_00_678");
             List<LongPoint> distList4 = longInput.get(deviceID).get("TY_0002_00_679");
             List<StringPoint> distList5 = stringInput.get(deviceID).get("TY_0002_00_680");
             List<LongPoint> distList6 = longInput.get(deviceID).get("TY_0002_00_681");
             List<LongPoint> distList7 = longInput.get(deviceID).get("TY_0002_00_682");
             List<FloatPoint> distList8 = floatInput.get(deviceID).get("TY_0002_00_683");
             List<FloatPoint> distList9 = floatInput.get(deviceID).get("TY_0002_00_684");
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
             List<FloatPoint> distList20 = floatInput.get(deviceID).get("TY_0002_00_695");
             List<FloatPoint> distList21 = floatInput.get(deviceID).get("TY_0002_00_696");
             List<FloatPoint> distList22 = floatInput.get(deviceID).get("TY_0002_00_697");
             List<LongPoint> distList23 = longInput.get(deviceID).get("TY_0002_00_698");
             List<LongPoint> distList24 = longInput.get(deviceID).get("TY_0002_00_699");
             List<FloatPoint> distList25 = floatInput.get(deviceID).get("TY_0002_00_700");
             List<FloatPoint> distList26 = floatInput.get(deviceID).get("TY_0002_00_701");
             List<LongPoint> distList27 = longInput.get(deviceID).get("TY_0002_00_702");
             List<LongPoint> distList28 = longInput.get(deviceID).get("TY_0002_00_703");
             List<StringPoint> distList29 = stringInput.get(deviceID).get("TY_0002_00_704");
             List<LongPoint> distList30 = longInput.get(deviceID).get("TY_0002_00_705");
             List<LongPoint> distList31 = longInput.get(deviceID).get("TY_0002_00_706");
             List<FloatPoint> distList32 = floatInput.get(deviceID).get("TY_0002_00_707");
             List<FloatPoint> distList33 = floatInput.get(deviceID).get("TY_0002_00_708");
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
             List<FloatPoint> distList47 = floatInput.get(deviceID).get("TY_0002_00_722");
             List<FloatPoint> distList48 = floatInput.get(deviceID).get("TY_0002_00_723");
             List<StringPoint> distList49 = stringInput.get(deviceID).get("TY_0002_00_724");
             List<LongPoint> distList50 = longInput.get(deviceID).get("TY_0002_00_725");
             List<IntPoint> distList51 = intInput.get(deviceID).get("TY_0002_00_726");
             List<FloatPoint> distList52 = floatInput.get(deviceID).get("TY_0002_00_727");
             List<FloatPoint> distList53 = floatInput.get(deviceID).get("TY_0002_00_728");
             List<StringPoint> distList54 = stringInput.get(deviceID).get("TY_0002_00_729");
             List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
             List<String> list = new ArrayList<String>();
            if (distList != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList);
                list.add("TY_0001_00_18");
            }
            if (distList2 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList2);
                list.add("TY_0002_00_677");
            }
            if (distList3 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList3);
                list.add("TY_0002_00_678");
            }
            if (distList4 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList4);
                list.add("TY_0002_00_679");
            }
            if (distList5 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList5);
                list.add("TY_0002_00_680");
            }
            if (distList6 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList6);
                list.add("TY_0002_00_681");
            }
            if (distList7 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList7);
                list.add("TY_0002_00_682");
            }
            if (distList8 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList8);
                list.add("TY_0002_00_683");
            }
            if (distList9 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList9);
                list.add("TY_0002_00_684");
            }
            if (distList10 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList10);
                list.add("TY_0002_00_685");
            }
            if (distList11 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList11);
                list.add("TY_0002_00_686");
            }
            if (distList12 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList12);
                list.add("TY_0002_00_687");
            }
            if (distList13 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList13);
                list.add("TY_0002_00_688");
            }
            if (distList14 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList14);
                list.add("TY_0002_00_689");
            }
            if (distList15 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList15);
                list.add("TY_0002_00_690");
            }
            if (distList16 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList16);
                list.add("TY_0002_00_691");
            }
            if (distList17 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList17);
                list.add("TY_0002_00_692");
            }
            if (distList18 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList18);
                list.add("TY_0002_00_693");
            }
            if (distList19 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList19);
                list.add("TY_0002_00_694");
            }
            if (distList20 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList20);
                list.add("TY_0002_00_695");
            }
            if (distList21 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList21);
                list.add("TY_0002_00_696");
            }
            if (distList22 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList22);
                list.add("TY_0002_00_697");
            }
            if (distList23 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList23);
                list.add("TY_0002_00_698");
            }
            if (distList24 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList24);
                list.add("TY_0002_00_699");
            }
            if (distList25 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList25);
                list.add("TY_0002_00_700");
            }
            if (distList26 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList26);
                list.add("TY_0002_00_701");
            }
            if (distList27 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList27);
                list.add("TY_0002_00_702");
            }
            if (distList28 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList28);
                list.add("TY_0002_00_703");
            }
            if (distList29 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList29);
                list.add("TY_0002_00_704");
            }
            if (distList30 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList30);
                list.add("TY_0002_00_705");
            }
            if (distList31 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList31);
                list.add("TY_0002_00_706");
            }
            if (distList32 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList32);
                list.add("TY_0002_00_707");
            }
            if (distList33 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList33);
                list.add("TY_0002_00_708");
            }
            if (distList34 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList34);
                list.add("TY_0002_00_709");
            }
            if (distList35 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList35);
                list.add("TY_0002_00_710");
            }
            if (distList36 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList36);
                list.add("TY_0002_00_711");
            }
            if (distList37 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList37);
                list.add("TY_0002_00_712");
            }
            if (distList38 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList38);
                list.add("TY_0002_00_713");
            }
            if (distList39 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList39);
                list.add("TY_0002_00_714");
            }
            if (distList40 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList40);
                list.add("TY_0002_00_715");
            }
            if (distList41 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList41);
                list.add("TY_0002_00_716");
            }
            if (distList42 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList42);
                list.add("TY_0002_00_717");
            }
            if (distList43 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList43);
                list.add("TY_0002_00_718");
            }
            if (distList44 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList44);
                list.add("TY_0002_00_719");
            }
            if (distList45 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList45);
                list.add("TY_0002_00_720");
            }
            if (distList46 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList46);
                list.add("TY_0002_00_721");
            }
            if (distList47 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList47);
                list.add("TY_0002_00_722");
            }
            if (distList48 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList48);
                list.add("TY_0002_00_723");
            }
            if (distList49 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList49);
                list.add("TY_0002_00_724");
            }
            if (distList50 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList50);
                list.add("TY_0002_00_725");
            }
            if (distList51 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList51);
                list.add("TY_0002_00_726");
            }
            if (distList52 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList52);
                list.add("TY_0002_00_727");
            }
            if (distList53 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList53);
                list.add("TY_0002_00_728");
            }
            if (distList54 != null) {
                alldata.addAll((Collection<? extends AbstractPoint>)distList54);
                list.add("TY_0002_00_729");
            }
            HashMap<String, Object> result = new HashMap<String, Object>();
            Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                    Collectors.groupingBy(AbstractPoint::getPrimaryTime));

            if (list != null) {
                if (resultMap != null) {
                    if (resultMap.keySet().size() != 0) {
                        for ( Map<String, String> smap : sqllist) {
                             String MsgERC_ID = smap.get("MsgERC_ID");
                             String MsgERC_Vcl_ID = smap.get("MsgERC_Vcl_ID");
                             String MsgERC_MsgTime = smap.get("MsgERC_MsgTime");
                             String MsgERC_EventCount = smap.get("MsgERC_EventCount");
                             String MsgERC_SysE_ID = smap.get("MsgERC_SysE_ID");
                             String MsgERC_BgnTime = smap.get("MsgERC_BgnTime");
                             String MsgERC_EndTime = smap.get("MsgERC_EndTime");
                             String MsgERC_Lo = smap.get("MsgERC_Lo");
                             String MsgERC_La = smap.get("MsgERC_La");
                             String MsgERC_Direction = smap.get("MsgERC_Direction");
                             String MsgERC_Speed = smap.get("MsgERC_Speed");
                             String MsgERC_Satellite = smap.get("MsgERC_Satellite");
                             String MsgERC_GSMSignal = smap.get("MsgERC_GSMSignal");
                            String MsgERC_MaxSpeed = smap.get("MsgERC_MaxSpeed");
                            String MsgERC_AvgSpeed = smap.get("MsgERC_AvgSpeed");
                             String MsgERC_MaxAddSpeed = smap.get("MsgERC_MaxAddSpeed");
                             String MsgERC_AvgAddSpeed = smap.get("MsgERC_AvgAddSpeed");
                            String MsgERC_RunKm = smap.get("MsgERC_RunKm");
                            String MsgERC_AvgThrottle = smap.get("MsgERC_AvgThrottle");
                             String MsgERC_BgnSpeed = smap.get("MsgERC_BgnSpeed");
                             String MsgERC_EndSpeed = smap.get("MsgERC_EndSpeed");
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
                            }
                            catch (ParseException e) {
                                e.printStackTrace();
                            }
                             List<AbstractPoint> listpoint = resultMap.get(time);
                            if (listpoint == null) {
                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                result.put("MsgTime", MsgERC_MsgTime);
                                result.put("sql_id", "MsgERC_ID");
                                result.put("sql_value", MsgERC_ID);
                                result.put("kmx_value", "KMX\u65e0\u6570\u636e");
                                this.outputSql.add(result);
                                result = new HashMap<String, Object>();
                            }
                            else {
                                for ( AbstractPoint ap : listpoint) {
                                        if (ap.getMetric().equals("TY_0001_00_18")) {
                                             IntPoint ap2 = (IntPoint)ap;
                                            if (MsgERC_EventCount == null) {
                                                if (String.valueOf(ap2.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("sql_id", "MsgERC_EventCount");
                                                    result.put("kmx_id", "TY_0001_00_18");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break ;
                                                }
                                            }
                                            if (MsgERC_EventCount != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("sql_id", "MsgERC_EventCount");
                                                    result.put("kmx_id", "TY_0001_00_18");
                                                    result.put("sql_value", MsgERC_EventCount);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break ;
                                                }
                                            }
                                            if (MsgERC_EventCount.equals(String.valueOf(ap2.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("sql_id", "MsgERC_EventCount");
                                            result.put("kmx_id", "TY_0001_00_18");
                                            result.put("sql_value", MsgERC_EventCount);
                                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }

                                    Label_4440: {
                                        if (ap.getMetric().equals("TY_0002_00_677")) {
                                             IntPoint ap2 = (IntPoint)ap;
                                            if (MsgERC_SysE_ID == null) {
                                                if (String.valueOf(ap2.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("sql_id", "MsgERC_SysE_ID");
                                                    result.put("kmx_id", "TY_0002_00_677");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_4440;
                                                }
                                            }
                                            if (MsgERC_SysE_ID != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("sql_id", "MsgERC_SysE_ID");
                                                    result.put("kmx_id", "TY_0002_00_677");
                                                    result.put("sql_value", MsgERC_SysE_ID);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_4440;
                                                }
                                            }
                                            if (MsgERC_SysE_ID.equals(String.valueOf(ap2.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("sql_id", "MsgERC_SysE_ID");
                                            result.put("kmx_id", "TY_0002_00_677");
                                            result.put("sql_value", MsgERC_SysE_ID);
                                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }
                                    }
                                    if (MsgERC_SysE_ID.equals("1")) {
                                        Label_4903: {
                                            if (ap.getMetric().equals("TY_0002_00_678")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_BgnTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_678");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_4903;
                                                    }
                                                }
                                                if (MsgERC_BgnTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_678");
                                                        result.put("sql_value", MsgERC_BgnTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_4903;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "1");
                                                result.put("sql_id", "MsgERC_BgnTime");
                                                result.put("kmx_id", "TY_0002_00_678");
                                                result.put("sql_value", MsgERC_BgnTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_5350: {
                                            if (ap.getMetric().equals("TY_0002_00_679")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_EndTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_679");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_5350;
                                                    }
                                                }
                                                if (MsgERC_EndTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_679");
                                                        result.put("sql_value", MsgERC_EndTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_5350;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "1");
                                                result.put("sql_id", "MsgERC_EndTime");
                                                result.put("kmx_id", "TY_0002_00_679");
                                                result.put("sql_value", MsgERC_EndTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_680")) {
                                             StringPoint ap4 = (StringPoint)ap;
                                             String jsongps = "[" + ap4.getValue() + "]";
                                             JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                 Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                                for ( String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for ( String key2 : result2.keySet()) {
                                                Label_6013: {
                                                    if (key2.equals("Speed")) {
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_6013;
                                                            }
                                                        }
                                                        if (MsgERC_Speed != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("Event_id", "1");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", MsgERC_Speed);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_6013;
                                                            }
                                                        }
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_6633: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_6633;
                                                            }
                                                        }
                                                        if (MsgERC_Lo == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Lo1 == null) {
                                                            if (Lo2 != null) {
                                                                if (Lo2.equals(MsgERC_Lo)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (Lo1.equals(MsgERC_Lo)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("sql_id", "MsgERC_Lo");
                                                            result.put("Event_id", "1");
                                                            result.put("kmx_id", "Lo");
                                                            result.put("sql_value", MsgERC_Lo);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_7255: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_7255;
                                                            }
                                                        }
                                                        if (MsgERC_La == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (La1 == null) {
                                                            if (La2 != null) {
                                                                if (La2.equals(MsgERC_La)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (La1.equals(MsgERC_La)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "1");
                                                            result.put("sql_id", "MsgERC_La");
                                                            result.put("kmx_id", "La");
                                                            result.put("sql_value", MsgERC_La);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_7718: {
                                                    if (key2.equals("Satellite")) {
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_7718;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", MsgERC_Satellite);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_7718;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_8181: {
                                                    if (key2.equals("Direction")) {
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id:", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_8181;
                                                            }
                                                        }
                                                        if (MsgERC_Direction != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "1");
                                                                result.put("sql_id", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", MsgERC_Direction);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_8181;
                                                            }
                                                        }
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Direction)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                if (!key2.equals("GSMSignal")) {
                                                    continue;
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgREC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "1");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", MsgERC_GSMSignal);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "1");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    Label_11490: {
                                        if (MsgERC_SysE_ID.equals("2")) {
                                            Label_9114: {
                                                if (ap.getMetric().equals("TY_0002_00_681")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_681");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_9114;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_681");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_9114;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "2");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_681");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_9561: {
                                                if (ap.getMetric().equals("TY_0002_00_682")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_682");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_9561;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_682");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_9561;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "2");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_682");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_10263: {
                                                if (ap.getMetric().equals("TY_0002_00_683")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_MaxSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_683");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_10263;
                                                        }
                                                    }
                                                    if (MsgERC_MaxSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_683");
                                                            result.put("sql_value", MsgERC_MaxSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_10263;
                                                        }
                                                    }
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                     BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                     BigDecimal b6 = new BigDecimal(MsgERC_MaxSpeed);
                                                     int s2 = MsgERC_MaxSpeed.indexOf(".");
                                                    if (MsgERC_MaxSpeed.length() >= ap6.toString().length()) {
                                                        if (MsgERC_MaxSpeed.length() > ap6.toString().length()) {
                                                            MsgERC_MaxSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    }
                                                    else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_MaxSpeed.equals(ap6)) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "2");
                                                    result.put("sql_id", "MsgERC_MaxSpeed");
                                                    result.put("kmx_id", "TY_0002_00_683");
                                                    result.put("sql_value", MsgERC_MaxSpeed);
                                                    result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    System.out.println("\u5f53\u524d\u53c2\u6570\u4e0d\u76f8\u7b49\uff1aVcl_ID:" + MsgERC_Vcl_ID + ";" + "MsgTime:" + MsgERC_MsgTime + ";" + "sql_id:" + "MsgERC_MaxSpeed" + ";" + "sql_value:" + MsgERC_MaxSpeed + ";" + "sensorkmx:" + "TY_0002_00_683" + ";" + "kmx_value:" + String.valueOf(ap5.getValue()));
                                                }
                                            }
                                            Label_10877: {
                                                if (ap.getMetric().equals("TY_0002_00_684")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_AvgSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            return;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_684");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_10877;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "2");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_684");
                                                            result.put("sql_value", MsgERC_AvgSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_10877;
                                                        }
                                                    }
                                                    String ap6 = String.valueOf(ap5.getValue());
                                                     BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                     BigDecimal b6 = new BigDecimal(MsgERC_AvgSpeed);
                                                     int s2 = MsgERC_AvgSpeed.indexOf(".");
                                                    if (MsgERC_AvgSpeed.length() >= ap6.toString().length()) {
                                                        if (MsgERC_AvgSpeed.length() > ap6.toString().length()) {
                                                            MsgERC_AvgSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                        }
                                                    }
                                                    else {
                                                        ap6 = String.valueOf(b5.setScale(MsgERC_AvgSpeed.length() - s2 - 1, 4).doubleValue());
                                                    }
                                                    if (MsgERC_AvgSpeed.equals(ap6)) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "2");
                                                    result.put("sql_id", "MsgERC_AvgSpeed");
                                                    result.put("kmx_id", "TY_0002_00_684");
                                                    result.put("sql_value", MsgERC_AvgSpeed);
                                                    result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_685")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_RunKm == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "2");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_685");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_11490;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "2");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_685");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_11490;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        String ap6 = String.valueOf(ap5.getValue());
                                                         BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                         BigDecimal b6 = new BigDecimal(MsgERC_RunKm);
                                                         int s2 = MsgERC_RunKm.indexOf(".");
                                                        if (MsgERC_RunKm.length() >= ap6.toString().length()) {
                                                            if (MsgERC_RunKm.length() > ap6.toString().length()) {
                                                                MsgERC_RunKm = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                            }
                                                        }
                                                        else {
                                                            ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                        }
                                                        if (MsgERC_RunKm.equals(ap6)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "2");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_685");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Label_12400: {
                                        if (MsgERC_SysE_ID.equals("3")) {
                                            Label_11953: {
                                                if (ap.getMetric().equals("TY_0002_00_686")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "3");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_686");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_11953;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "3");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_686");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_11953;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "3");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_686");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_687")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_EndTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "3");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_687");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_12400;
                                                    }
                                                }
                                                if (MsgERC_EndTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_EndTime);
                                                        result.put("Event_id", "3");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_687");
                                                        result.put("sql_value", MsgERC_EndTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_12400;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "3");
                                                result.put("sql_id", "MsgERC_EndTime");
                                                result.put("kmx_id", "TY_0002_00_687");
                                                result.put("sql_value", MsgERC_EndTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    Label_13923: {
                                        if (MsgERC_SysE_ID.equals("4")) {
                                            Label_12863: {
                                                if (ap.getMetric().equals("TY_0002_00_688")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "4");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_688");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_12863;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "4");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_688");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_12863;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "4");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_688");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_13310: {
                                                if (ap.getMetric().equals("TY_0002_00_689")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "4");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_689");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_13310;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "4");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_689");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_13310;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "4");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_689");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_690")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_RunKm == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "4");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_690");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_13923;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "4");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_690");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_13923;
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
                                                        }
                                                        else {
                                                            ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                        }
                                                        if (MsgERC_RunKm.equals(ap6)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "4");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_690");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Label_14833: {
                                        if (MsgERC_SysE_ID.equals("5")) {
                                            Label_14386: {
                                                if (ap.getMetric().equals("TY_0002_00_691")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "5");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_691");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_14386;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "5");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_691");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_14386;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "5");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_691");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_692")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_EndTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "5");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_692");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_14833;
                                                    }
                                                }
                                                if (MsgERC_EndTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "5");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_692");
                                                        result.put("sql_value", MsgERC_EndTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_14833;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_EndTime);
                                                result.put("Event_id", "5");
                                                result.put("sql_id", "MsgERC_EndTime");
                                                result.put("kmx_id", "TY_0002_00_692");
                                                result.put("sql_value", MsgERC_EndTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    Label_17582: {
                                        if (MsgERC_SysE_ID.equals("6")) {
                                            Label_15296: {
                                                if (ap.getMetric().equals("TY_0002_00_693")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_693");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_15296;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_693");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_15296;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "6");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_693");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_15743: {
                                                if (ap.getMetric().equals("TY_0002_00_694")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_694");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_15743;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_694");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_15743;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "6");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_694");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_16356: {
                                                if (ap.getMetric().equals("TY_0002_00_695")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_MaxSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_695");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_16356;
                                                        }
                                                    }
                                                    if (MsgERC_MaxSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_695");
                                                            result.put("sql_value", MsgERC_MaxSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_16356;
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
                                                            }
                                                            else {
                                                                ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                            }
                                                            if (MsgERC_MaxSpeed.equals(ap6)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_695");
                                                            result.put("sql_value", MsgERC_MaxSpeed);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                            }
                                            Label_16969: {
                                                if (ap.getMetric().equals("TY_0002_00_696")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_AvgSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_696");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_16969;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_696");
                                                            result.put("sql_value", MsgERC_AvgSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_16969;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            String ap6 = String.valueOf(ap5.getValue());
                                                             BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                             BigDecimal b6 = new BigDecimal(MsgERC_AvgSpeed);
                                                             int s2 = MsgERC_AvgSpeed.indexOf(".");
                                                            if (MsgERC_AvgSpeed.length() >= ap6.toString().length()) {
                                                                if (MsgERC_AvgSpeed.length() > ap6.toString().length()) {
                                                                    MsgERC_AvgSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                                }
                                                            }
                                                            else {
                                                                ap6 = String.valueOf(b5.setScale(MsgERC_AvgSpeed.length() - s2 - 1, 4).doubleValue());
                                                            }
                                                            if (MsgERC_AvgSpeed.equals(ap6)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "6");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_696");
                                                            result.put("sql_value", MsgERC_AvgSpeed);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_697")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_RunKm == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "6");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_697");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_17582;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("Event_id", "6");
                                                        result.put("kmx_id", "TY_0002_00_697");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_17582;
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
                                                        }
                                                        else {
                                                            ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                        }
                                                        if (MsgERC_RunKm.equals(ap6)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "6");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_697");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Label_19721: {
                                        if (MsgERC_SysE_ID.equals("7")) {
                                            Label_18045: {
                                                if (ap.getMetric().equals("TY_0002_00_698")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_698");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_18045;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_698");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_18045;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "7");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_698");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_18492: {
                                                if (ap.getMetric().equals("TY_0002_00_699")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_699");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_18492;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_EndTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_699");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_18492;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "7");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_699");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_19108: {
                                                if (ap.getMetric().equals("TY_0002_00_700")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_AvgThrottle == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_AvgThrottle");
                                                            result.put("kmx_id", "TY_0002_00_700");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_19108;
                                                        }
                                                    }
                                                    if (MsgERC_AvgThrottle != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_AvgThrottle");
                                                            result.put("kmx_id", "TY_0002_00_700");
                                                            result.put("sql_value", MsgERC_AvgThrottle);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_19108;
                                                        }
                                                    }
                                                    if (MsgERC_AvgThrottle != null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            String ap6 = String.valueOf(ap5.getValue());
                                                             BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                             BigDecimal b6 = new BigDecimal(MsgERC_AvgThrottle);
                                                             int s2 = MsgERC_AvgThrottle.indexOf(".");
                                                            if (MsgERC_AvgThrottle.length() >= ap6.toString().length()) {
                                                                if (MsgERC_AvgThrottle.length() > ap6.toString().length()) {
                                                                    MsgERC_AvgThrottle = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                                }
                                                            }
                                                            else {
                                                                ap6 = String.valueOf(b5.setScale(MsgERC_AvgThrottle.length() - s2 - 1, 4).doubleValue());
                                                            }
                                                            if (MsgERC_AvgThrottle.equals(ap6)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "7");
                                                            result.put("sql_id", "MsgERC_AvgThrottle");
                                                            result.put("kmx_id", "TY_0002_00_700");
                                                            result.put("sql_value", MsgERC_AvgThrottle);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_701")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_RunKm == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "7");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_701");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_19721;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "7");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_701");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_19721;
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
                                                        }
                                                        else {
                                                            ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                        }
                                                        if (MsgERC_RunKm.equals(ap6)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "7");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_701");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (MsgERC_SysE_ID.equals("9")) {
                                        Label_20184: {
                                            if (ap.getMetric().equals("TY_0002_00_702")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_BgnTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_702");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_20184;
                                                    }
                                                }
                                                if (MsgERC_BgnTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_702");
                                                        result.put("sql_value", MsgERC_BgnTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_20184;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "9");
                                                result.put("sql_id", "MsgERC_BgnTime");
                                                result.put("kmx_id", "TY_0002_00_702");
                                                result.put("sql_value", MsgERC_BgnTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_20631: {
                                            if (ap.getMetric().equals("TY_0002_00_703")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_EndTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_703");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_20631;
                                                    }
                                                }
                                                if (MsgERC_EndTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_EndTime");
                                                        result.put("kmx_id", "TY_0002_00_703");
                                                        result.put("sql_value", MsgERC_EndTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_20631;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "9");
                                                result.put("sql_id", "MsgERC_EndTime");
                                                result.put("kmx_id", "TY_0002_00_703");
                                                result.put("sql_value", MsgERC_EndTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_704")) {
                                             StringPoint ap4 = (StringPoint)ap;
                                             String jsongps = "[" + ap4.getValue() + "]";
                                             JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                 Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                                for ( String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for ( String key2 : result2.keySet()) {
                                                Label_21294: {
                                                    if (key2.equals("Speed")) {
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_21294;
                                                            }
                                                        }
                                                        if (MsgERC_Speed != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", MsgERC_Speed);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_21294;
                                                            }
                                                        }
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_21926: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_21926;
                                                            }
                                                        }
                                                        if (MsgERC_Lo == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Lo1 == null) {
                                                            if (Lo2 != null) {
                                                                if (Lo2.equals(MsgERC_Lo)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (Lo1.equals(MsgERC_Lo)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "9");
                                                            result.put("sql_id", "MsgERC_Lo");
                                                            result.put("kmx_id", "Lo");
                                                            result.put("sql_value", MsgERC_Lo);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_22560: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_22560;
                                                            }
                                                        }
                                                        if (MsgERC_La == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (La1 == null) {
                                                            if (La2 != null) {
                                                                if (La2.equals(MsgERC_La)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (La1.equals(MsgERC_La)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "9");
                                                            result.put("sql_id", "MsgERC_La");
                                                            result.put("kmx_id", "La");
                                                            result.put("sql_value", MsgERC_La);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_23023: {
                                                    if (key2.equals("Satellite")) {
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_23023;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", MsgERC_Satellite);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_23023;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_23486: {
                                                    if (key2.equals("Direction")) {
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id:", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_23486;
                                                            }
                                                        }
                                                        if (MsgERC_Direction != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "9");
                                                                result.put("sql_id", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", MsgERC_Direction);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_23486;
                                                            }
                                                        }
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Direction)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                if (!key2.equals("GSMSignal")) {
                                                    continue;
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "9");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", MsgERC_GSMSignal);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "9");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    Label_26704: {
                                        if (MsgERC_SysE_ID.equals("10")) {
                                            Label_24418: {
                                                if (ap.getMetric().equals("TY_0002_00_705")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_705");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_24418;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_705");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_24418;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "10");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_705");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_24865: {
                                                if (ap.getMetric().equals("TY_0002_00_706")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_706");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_24865;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_706");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_24865;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "10");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_706");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_25478: {
                                                if (ap.getMetric().equals("TY_0002_00_707")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_MaxSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_707");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_25478;
                                                        }
                                                    }
                                                    if (MsgERC_MaxSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_707");
                                                            result.put("sql_value", MsgERC_MaxSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_25478;
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
                                                            }
                                                            else {
                                                                ap6 = String.valueOf(b5.setScale(MsgERC_MaxSpeed.length() - s2 - 1, 4).doubleValue());
                                                            }
                                                            if (MsgERC_MaxSpeed.equals(ap6)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_MaxSpeed");
                                                            result.put("kmx_id", "TY_0002_00_707");
                                                            result.put("sql_value", MsgERC_MaxSpeed);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                            }
                                            Label_26091: {
                                                if (ap.getMetric().equals("TY_0002_00_708")) {
                                                     FloatPoint ap5 = (FloatPoint)ap;
                                                    if (MsgERC_AvgSpeed == null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_708");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_26091;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_708");
                                                            result.put("sql_value", MsgERC_AvgSpeed);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_26091;
                                                        }
                                                    }
                                                    if (MsgERC_AvgSpeed != null) {
                                                        if (String.valueOf(ap5.getValue()) != null) {
                                                            String ap6 = String.valueOf(ap5.getValue());
                                                             BigDecimal b5 = new BigDecimal(Double.valueOf(ap6.toString()));
                                                             BigDecimal b6 = new BigDecimal(MsgERC_AvgSpeed);
                                                             int s2 = MsgERC_AvgSpeed.indexOf(".");
                                                            if (MsgERC_AvgSpeed.length() >= ap6.toString().length()) {
                                                                if (MsgERC_AvgSpeed.length() > ap6.toString().length()) {
                                                                    MsgERC_AvgSpeed = String.valueOf(b6.setScale(ap6.toString().length() - s2 - 1, 4).doubleValue());
                                                                }
                                                            }
                                                            else {
                                                                ap6 = String.valueOf(b5.setScale(MsgERC_AvgSpeed.length() - s2 - 1, 4).doubleValue());
                                                            }
                                                            if (MsgERC_AvgSpeed.equals(ap6)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "10");
                                                            result.put("sql_id", "MsgERC_AvgSpeed");
                                                            result.put("kmx_id", "TY_0002_00_708");
                                                            result.put("sql_value", MsgERC_AvgSpeed);
                                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_709")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_RunKm == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "10");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_709");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_26704;
                                                    }
                                                }
                                                if (MsgERC_RunKm != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "10");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_709");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_26704;
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
                                                        }
                                                        else {
                                                            ap6 = String.valueOf(b5.setScale(MsgERC_RunKm.length() - s2 - 1, 4).doubleValue());
                                                        }
                                                        if (MsgERC_RunKm.equals(ap6)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "10");
                                                        result.put("sql_id", "MsgERC_RunKm");
                                                        result.put("kmx_id", "TY_0002_00_709");
                                                        result.put("sql_value", MsgERC_RunKm);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (MsgERC_SysE_ID.equals("12")) {
                                        Label_27167: {
                                            if (ap.getMetric().equals("TY_0002_00_710")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_BgnTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_710");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_27167;
                                                    }
                                                }
                                                if (MsgERC_BgnTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_710");
                                                        result.put("sql_value", MsgERC_BgnTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_27167;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "12");
                                                result.put("sql_id", "MsgERC_BgnTime");
                                                result.put("kmx_id", "TY_0002_00_710");
                                                result.put("sql_value", MsgERC_BgnTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_27617: {
                                            if (ap.getMetric().equals("TY_0002_00_711")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_RecordTimes == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_RecordTimes");
                                                        result.put("kmx_id", "TY_0002_00_711");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_27617;
                                                    }
                                                }
                                                if (MsgERC_RecordTimes != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_RecordTimes);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_RecordTimes");
                                                        result.put("kmx_id", "TY_0002_00_711");
                                                        result.put("sql_value", MsgERC_RecordTimes);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_27617;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_RecordTimes).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "12");
                                                result.put("sql_id", "MsgERC_RecordTimes");
                                                result.put("kmx_id", "TY_0002_00_711");
                                                result.put("sql_value", MsgERC_RecordTimes);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_712")) {
                                             StringPoint ap4 = (StringPoint)ap;
                                             String jsongps = "[" + ap4.getValue() + "]";
                                             JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                 Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                                for ( String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for ( String key2 : result2.keySet()) {
                                                Label_28295: {
                                                    if (key2.equals("Speed")) {
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_28295;
                                                            }
                                                        }
                                                        if (MsgERC_Speed != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", MsgERC_Speed);
                                                                result.put("kmx_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_28295;
                                                            }
                                                        }
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_28927: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_28927;
                                                            }
                                                        }
                                                        if (MsgERC_Lo == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Lo1 == null) {
                                                            if (Lo2 != null) {
                                                                if (Lo2.equals(MsgERC_Lo)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (Lo1.equals(MsgERC_Lo)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "12");
                                                            result.put("sql_id", "MsgERC_Lo");
                                                            result.put("kmx_id", "Lo");
                                                            result.put("sql_value", MsgERC_Lo);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_29561: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_29561;
                                                            }
                                                        }
                                                        if (MsgERC_La == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (La1 == null) {
                                                            if (La2 != null) {
                                                                if (La2.equals(MsgERC_La)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (La1.equals(MsgERC_La)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "12");
                                                            result.put("sql_id", "MsgERC_La");
                                                            result.put("kmx_id", "La");
                                                            result.put("sql_value", MsgERC_La);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_30024: {
                                                    if (key2.equals("Satellite")) {
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_30024;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", MsgERC_Satellite);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_30024;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_30487: {
                                                    if (key2.equals("Direction")) {
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id:", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_30487;
                                                            }
                                                        }
                                                        if (MsgERC_Direction != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "12");
                                                                result.put("sql_id", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", MsgERC_Direction);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_30487;
                                                            }
                                                        }
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Direction)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                if (!key2.equals("GSMSignal")) {
                                                    continue;
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "12");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", MsgERC_GSMSignal);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "12");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    if (MsgERC_SysE_ID.equals("13")) {
                                        Label_31419: {
                                            if (ap.getMetric().equals("TY_0002_00_713")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_BgnTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_713");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_31419;
                                                    }
                                                }
                                                if (MsgERC_BgnTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_713");
                                                        result.put("sql_value", MsgERC_BgnTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_31419;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "13");
                                                result.put("sql_id", "MsgERC_BgnTime");
                                                result.put("kmx_id", "TY_0002_00_713");
                                                result.put("sql_value", MsgERC_BgnTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_31866: {
                                            if (ap.getMetric().equals("TY_0002_00_714")) {
                                                 IntPoint ap2 = (IntPoint)ap;
                                                if (MsgERC_DurationTime == null) {
                                                    if (String.valueOf(ap2.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_DurationTime");
                                                        result.put("kmx_id", "TY_0002_00_714");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_31866;
                                                    }
                                                }
                                                if (MsgERC_DurationTime != null) {
                                                    if (String.valueOf(ap2.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_DurationTime");
                                                        result.put("kmx_id", "TY_0002_00_714");
                                                        result.put("sql_value", MsgERC_DurationTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_31866;
                                                    }
                                                }
                                                if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "13");
                                                result.put("sql_id", "MsgERC_DurationTime");
                                                result.put("kmx_id", "TY_0002_00_714");
                                                result.put("sql_value", MsgERC_DurationTime);
                                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_715")) {
                                             StringPoint ap4 = (StringPoint)ap;
                                             String jsongps = "[" + ap4.getValue() + "]";
                                             JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                 Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                                for ( String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for ( String key2 : result2.keySet()) {
                                                Label_32529: {
                                                    if (key2.equals("Speed")) {
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_32529;
                                                            }
                                                        }
                                                        if (MsgERC_Speed != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", MsgERC_Speed);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_32529;
                                                            }
                                                        }
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_33161: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_33161;
                                                            }
                                                        }
                                                        if (MsgERC_Lo == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Lo1 == null) {
                                                            if (Lo2 != null) {
                                                                if (Lo2.equals(MsgERC_Lo)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (Lo1.equals(MsgERC_Lo)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "13");
                                                            result.put("sql_id", "MsgERC_Lo");
                                                            result.put("kmx_id", "Lo");
                                                            result.put("sql_value", MsgERC_Lo);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_33795: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_33795;
                                                            }
                                                        }
                                                        if (MsgERC_La == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (La1 == null) {
                                                            if (La2 != null) {
                                                                if (La2.equals(MsgERC_La)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (La1.equals(MsgERC_La)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "13");
                                                            result.put("sql_id", "MsgERC_La");
                                                            result.put("kmx_id", "La");
                                                            result.put("sql_value", MsgERC_La);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_34258: {
                                                    if (key2.equals("Satellite")) {
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_34258;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", MsgERC_Satellite);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_34258;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_34721: {
                                                    if (key2.equals("Direction")) {
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id:", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_34721;
                                                            }
                                                        }
                                                        if (MsgERC_Direction != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "13");
                                                                result.put("sql_id", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", MsgERC_Direction);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_34721;
                                                            }
                                                        }
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Direction)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                if (!key2.equals("GSMSignal")) {
                                                    continue;
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "13");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", MsgERC_GSMSignal);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "13");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    Label_36994: {
                                        if (MsgERC_SysE_ID.equals("14")) {
                                            Label_35653: {
                                                if (ap.getMetric().equals("TY_0002_00_716")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_716");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_35653;
                                                        }
                                                    }
                                                    if (MsgERC_BgnTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_BgnTime");
                                                            result.put("kmx_id", "TY_0002_00_716");
                                                            result.put("sql_value", MsgERC_BgnTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_35653;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "14");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_716");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_36100: {
                                                if (ap.getMetric().equals("TY_0002_00_717")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_BgnMileage == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_BgnMileage");
                                                            result.put("kmx_id", "TY_0002_00_717");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_36100;
                                                        }
                                                    }
                                                    if (MsgERC_BgnMileage != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_BgnMileage");
                                                            result.put("kmx_id", "TY_0002_00_717");
                                                            result.put("sql_value", MsgERC_BgnMileage);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_36100;
                                                        }
                                                    }
                                                    if (MsgERC_BgnMileage.equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "14");
                                                    result.put("sql_id", "MsgERC_BgnMileage");
                                                    result.put("kmx_id", "TY_0002_00_717");
                                                    result.put("sql_value", MsgERC_BgnMileage);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            Label_36547: {
                                                if (ap.getMetric().equals("TY_0002_00_718")) {
                                                     LongPoint ap3 = (LongPoint)ap;
                                                    if (MsgERC_EndTime == null) {
                                                        if (String.valueOf(ap3.getValue()) != null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_718");
                                                            result.put("sql_value", null);
                                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_36547;
                                                        }
                                                    }
                                                    if (MsgERC_EndTime != null) {
                                                        if (String.valueOf(ap3.getValue()) == null) {
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "14");
                                                            result.put("sql_id", "MsgERC_EndTime");
                                                            result.put("kmx_id", "TY_0002_00_718");
                                                            result.put("sql_value", MsgERC_EndTime);
                                                            result.put("kmx_value", null);
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                            break Label_36547;
                                                        }
                                                    }
                                                    if (String.valueOf(MsgERC_EndTime2).equals(String.valueOf(ap3.getValue()))) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "14");
                                                    result.put("sql_id", "MsgERC_EndTime");
                                                    result.put("kmx_id", "TY_0002_00_718");
                                                    result.put("sql_value", MsgERC_EndTime);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (ap.getMetric().equals("TY_0002_00_719")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_EndMileage == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "14");
                                                        result.put("sql_id", "MsgERC_EndMileage");
                                                        result.put("kmx_id", "TY_0002_00_719");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_36994;
                                                    }
                                                }
                                                if (MsgERC_EndMileage != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "14");
                                                        result.put("sql_id", "MsgERC_EndMileage");
                                                        result.put("kmx_id", "TY_0002_00_719");
                                                        result.put("sql_value", MsgERC_EndMileage);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_36994;
                                                    }
                                                }
                                                if (MsgERC_EndMileage.equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "14");
                                                result.put("sql_id", "MsgERC_EndMileage");
                                                result.put("kmx_id", "TY_0002_00_719");
                                                result.put("sql_value", MsgERC_EndMileage);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    if (MsgERC_SysE_ID.equals("15")) {
                                        Label_37457: {
                                            if (ap.getMetric().equals("TY_0002_00_720")) {
                                                 LongPoint ap3 = (LongPoint)ap;
                                                if (MsgERC_BgnTime == null) {
                                                    if (String.valueOf(ap3.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_720");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_37457;
                                                    }
                                                }
                                                if (MsgERC_BgnTime != null) {
                                                    if (String.valueOf(ap3.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_BgnTime");
                                                        result.put("kmx_id", "TY_0002_00_720");
                                                        result.put("sql_value", MsgERC_BgnTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_37457;
                                                    }
                                                }
                                                if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "15");
                                                result.put("sql_id", "MsgERC_BgnTime");
                                                result.put("kmx_id", "TY_0002_00_720");
                                                result.put("sql_value", MsgERC_BgnTime);
                                                result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_37904: {
                                            if (ap.getMetric().equals("TY_0002_00_721")) {
                                                 IntPoint ap2 = (IntPoint)ap;
                                                if (MsgERC_DurationTime == null) {
                                                    if (String.valueOf(ap2.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_DurationTime");
                                                        result.put("kmx_id", "TY_0002_00_721");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_37904;
                                                    }
                                                }
                                                if (MsgERC_DurationTime != null) {
                                                    if (String.valueOf(ap2.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_DurationTime");
                                                        result.put("kmx_id", "TY_0002_00_721");
                                                        result.put("sql_value", MsgERC_DurationTime);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_37904;
                                                    }
                                                }
                                                if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "15");
                                                result.put("sql_id", "MsgERC_DurationTime");
                                                result.put("kmx_id", "TY_0002_00_721");
                                                result.put("sql_value", MsgERC_DurationTime);
                                                result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_38351: {
                                            if (ap.getMetric().equals("TY_0002_00_722")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_BgnSpeed == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_BgnSpeed");
                                                        result.put("kmx_id", "TY_0002_00_722");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_38351;
                                                    }
                                                }
                                                if (MsgERC_BgnSpeed != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_BgnSpeed");
                                                        result.put("kmx_id", "TY_0002_00_722");
                                                        result.put("sql_value", MsgERC_BgnSpeed);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_38351;
                                                    }
                                                }
                                                if (MsgERC_BgnSpeed.equals(String.valueOf(ap5.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "15");
                                                result.put("sql_id", "MsgERC_BgnSpeed");
                                                result.put("kmx_id", "TY_0002_00_722");
                                                result.put("sql_value", MsgERC_BgnSpeed);
                                                result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_38798: {
                                            if (ap.getMetric().equals("TY_0002_00_723")) {
                                                 FloatPoint ap5 = (FloatPoint)ap;
                                                if (MsgERC_EndSpeed == null) {
                                                    if (String.valueOf(ap5.getValue()) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_EndSpeed");
                                                        result.put("kmx_id", "TY_0002_00_723");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_38798;
                                                    }
                                                }
                                                if (MsgERC_EndSpeed != null) {
                                                    if (String.valueOf(ap5.getValue()) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_EndSpeed");
                                                        result.put("kmx_id", "TY_0002_00_723");
                                                        result.put("sql_value", MsgERC_EndSpeed);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_38798;
                                                    }
                                                }
                                                if (MsgERC_EndSpeed.equals(String.valueOf(ap5.getValue()))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "15");
                                                result.put("sql_id", "MsgERC_EndSpeed");
                                                result.put("kmx_id", "TY_0002_00_723");
                                                result.put("sql_value", MsgERC_EndSpeed);
                                                result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (ap.getMetric().equals("TY_0002_00_724")) {
                                             StringPoint ap4 = (StringPoint)ap;
                                             String jsongps = "[" + ap4.getValue() + "]";
                                             JSONArray arrFC = JSON.parseArray(jsongps);
                                            for (int i = 0; i < arrFC.size(); ++i) {
                                                 Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                                for ( String key : mapTypes.keySet()) {
                                                    result2.put(key, mapTypes.get(key).toString());
                                                }
                                            }
                                            for ( String key2 : result2.keySet()) {
                                                Label_39461: {
                                                    if (key2.equals("Speed")) {
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_39461;
                                                            }
                                                        }
                                                        if (MsgERC_Speed != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Speed");
                                                                result.put("kmx_id", "Speed");
                                                                result.put("sql_value", MsgERC_Speed);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_39461;
                                                            }
                                                        }
                                                        if (MsgERC_Speed == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_40093: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_40093;
                                                            }
                                                        }
                                                        if (MsgERC_Lo == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (Lo1 == null) {
                                                            if (Lo2 != null) {
                                                                if (Lo2.equals(MsgERC_Lo)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Lo");
                                                                result.put("kmx_id", "Lo");
                                                                result.put("sql_value", MsgERC_Lo);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (Lo1.equals(MsgERC_Lo)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "15");
                                                            result.put("sql_id", "MsgERC_Lo");
                                                            result.put("kmx_id", "Lo");
                                                            result.put("sql_value", MsgERC_Lo);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_40727: {
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
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_40727;
                                                            }
                                                        }
                                                        if (MsgERC_La == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (La1 == null) {
                                                            if (La2 != null) {
                                                                if (La2.equals(MsgERC_La)) {
                                                                    continue;
                                                                }
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_La");
                                                                result.put("kmx_id", "La");
                                                                result.put("sql_value", MsgERC_La);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                            }
                                                        }
                                                        else {
                                                            if (La1.equals(MsgERC_La)) {
                                                                continue;
                                                            }
                                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                            result.put("MsgTime", MsgERC_MsgTime);
                                                            result.put("Event_id", "15");
                                                            result.put("sql_id", "MsgERC_La");
                                                            result.put("kmx_id", "La");
                                                            result.put("sql_value", MsgERC_La);
                                                            result.put("kmx_value", result2.get(key2));
                                                            this.outputSql.add(result);
                                                            result = new HashMap<String, Object>();
                                                        }
                                                    }
                                                }
                                                Label_41190: {
                                                    if (key2.equals("Satellite")) {
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_41190;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Satellite");
                                                                result.put("kmx_id", "Satellite");
                                                                result.put("sql_value", MsgERC_Satellite);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_41190;
                                                            }
                                                        }
                                                        if (MsgERC_Satellite == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                Label_41653: {
                                                    if (key2.equals("Direction")) {
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) != null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id:", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", null);
                                                                result.put("kmx_value", result2.get(key2));
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_41653;
                                                            }
                                                        }
                                                        if (MsgERC_Direction != null) {
                                                            if (result2.get(key2) == null) {
                                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                                result.put("MsgTime", MsgERC_MsgTime);
                                                                result.put("Event_id", "15");
                                                                result.put("sql_id", "MsgERC_Direction");
                                                                result.put("kmx_id", "Direction");
                                                                result.put("sql_value", MsgERC_Direction);
                                                                result.put("kmx_value", null);
                                                                this.outputSql.add(result);
                                                                result = new HashMap<String, Object>();
                                                                break Label_41653;
                                                            }
                                                        }
                                                        if (MsgERC_Direction == null) {
                                                            if (result2.get(key2) == null) {
                                                                continue;
                                                            }
                                                        }
                                                        if (result2.get(key2).equals(MsgERC_Direction)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                if (!key2.equals("GSMSignal")) {
                                                    continue;
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "15");
                                                        result.put("sql_id", "MsgERC_GSMSignal");
                                                        result.put("kmx_id", "GSMSignal");
                                                        result.put("sql_value", MsgERC_GSMSignal);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        continue;
                                                    }
                                                }
                                                if (MsgERC_GSMSignal == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "15");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                    }
                                    if (!MsgERC_SysE_ID.equals("16")) {
                                        continue;
                                    }
                                    Label_42585: {
                                        if (ap.getMetric().equals("TY_0002_00_725")) {
                                             LongPoint ap3 = (LongPoint)ap;
                                            if (MsgERC_BgnTime == null) {
                                                if (String.valueOf(ap3.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_725");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap3.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_42585;
                                                }
                                            }
                                            if (MsgERC_BgnTime != null) {
                                                if (String.valueOf(ap3.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_BgnTime");
                                                    result.put("kmx_id", "TY_0002_00_725");
                                                    result.put("sql_value", MsgERC_BgnTime);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_42585;
                                                }
                                            }
                                            if (String.valueOf(MsgERC_BgnTime2).equals(String.valueOf(ap3.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("Event_id", "16");
                                            result.put("sql_id", "MsgERC_BgnTime");
                                            result.put("kmx_id", "TY_0002_00_725");
                                            result.put("sql_value", MsgERC_BgnTime);
                                            result.put("kmx_value", String.valueOf(ap3.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }
                                    }
                                    Label_43027: {
                                        if (ap.getMetric().equals("TY_0002_00_726")) {
                                             IntPoint ap2 = (IntPoint)ap;
                                            if (MsgERC_DurationTime == null) {
                                                if (String.valueOf(ap2.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_DurationTime");
                                                    result.put("kmx_id", "TY_0002_00_726");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap2.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                            if (MsgERC_DurationTime != null) {
                                                if (String.valueOf(ap2.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_DurationTime");
                                                    result.put("kmx_id", "TY_0002_00_726");
                                                    result.put("sql_value", MsgERC_DurationTime);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_43027;
                                                }
                                            }
                                            if (MsgERC_DurationTime.equals(String.valueOf(ap2.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("Event_id", "16");
                                            result.put("sql_id", "MsgERC_DurationTime");
                                            result.put("kmx_id", "TY_0002_00_726");
                                            result.put("sql_value", MsgERC_DurationTime);
                                            result.put("kmx_value", String.valueOf(ap2.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }
                                    }
                                    Label_43474: {
                                        if (ap.getMetric().equals("TY_0002_00_727")) {
                                             FloatPoint ap5 = (FloatPoint)ap;
                                            if (MsgERC_BgnSpeed == null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_BgnSpeed");
                                                    result.put("kmx_id", "TY_0002_00_727");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_43474;
                                                }
                                            }
                                            if (MsgERC_BgnSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_BgnSpeed");
                                                    result.put("kmx_id", "TY_0002_00_727");
                                                    result.put("sql_value", MsgERC_BgnSpeed);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_43474;
                                                }
                                            }
                                            if (MsgERC_BgnSpeed.equals(String.valueOf(ap5.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("Event_id", "16");
                                            result.put("sql_id", "MsgERC_BgnSpeed");
                                            result.put("kmx_id", "TY_0002_00_727");
                                            result.put("sql_value", MsgERC_BgnSpeed);
                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }
                                    }
                                    Label_43921: {
                                        if (ap.getMetric().equals("TY_0002_00_728")) {
                                             FloatPoint ap5 = (FloatPoint)ap;
                                            if (MsgERC_EndSpeed == null) {
                                                if (String.valueOf(ap5.getValue()) != null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_EndSpeed");
                                                    result.put("kmx_id", "TY_0002_00_728");
                                                    result.put("sql_value", null);
                                                    result.put("kmx_value", String.valueOf(ap5.getValue()));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_43921;
                                                }
                                            }
                                            if (MsgERC_EndSpeed != null) {
                                                if (String.valueOf(ap5.getValue()) == null) {
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_EndSpeed");
                                                    result.put("kmx_id", "TY_0002_00_728");
                                                    result.put("sql_value", MsgERC_EndSpeed);
                                                    result.put("kmx_value", null);
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                    break Label_43921;
                                                }
                                            }
                                            if (MsgERC_EndSpeed.equals(String.valueOf(ap5.getValue()))) {
                                                continue;
                                            }
                                            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                            result.put("Vcl_ID", MsgERC_Vcl_ID);
                                            result.put("MsgTime", MsgERC_MsgTime);
                                            result.put("Event_id", "16");
                                            result.put("sql_id", "MsgERC_EndSpeed");
                                            result.put("kmx_id", "TY_0002_00_728");
                                            result.put("sql_value", MsgERC_EndSpeed);
                                            result.put("kmx_value", String.valueOf(ap5.getValue()));
                                            this.outputSql.add(result);
                                            result = new HashMap<String, Object>();
                                        }
                                    }
                                    if (!ap.getMetric().equals("TY_0002_00_729")) {
                                        continue;
                                    }
                                     StringPoint ap4 = (StringPoint)ap;
                                     String jsongps = "[" + ap4.getValue() + "]";
                                     JSONArray arrFC = JSON.parseArray(jsongps);
                                    for (int i = 0; i < arrFC.size(); ++i) {
                                         Map<String, Object> mapTypes = (Map<String, Object>)arrFC.getJSONObject(i);
                                        for ( String key : mapTypes.keySet()) {
                                            result2.put(key, mapTypes.get(key).toString());
                                        }
                                    }
                                    for ( String key2 : result2.keySet()) {
                                        Label_44584: {
                                            if (key2.equals("Speed")) {
                                                if (MsgERC_Speed == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_44584;
                                                    }
                                                }
                                                if (MsgERC_Speed != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Speed");
                                                        result.put("kmx_id", "Speed");
                                                        result.put("sql_value", MsgERC_Speed);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_44584;
                                                    }
                                                }
                                                if (MsgERC_Speed == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (Double.valueOf(result2.get(key2).toString()).equals(Double.valueOf(MsgERC_Speed))) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "16");
                                                result.put("sql_id", "MsgERC_Speed");
                                                result.put("kmx_id", "Speed");
                                                result.put("sql_value", MsgERC_Speed);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_45216: {
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
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Lo");
                                                        result.put("kmx_id", "Lo");
                                                        result.put("sql_value", MsgERC_Lo);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_45216;
                                                    }
                                                }
                                                if (MsgERC_Lo == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (Lo1 == null) {
                                                    if (Lo2 != null) {
                                                        if (Lo2.equals(MsgERC_Lo)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Lo");
                                                        result.put("kmx_id", "Lo");
                                                        result.put("sql_value", MsgERC_Lo);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                else {
                                                    if (Lo1.equals(MsgERC_Lo)) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_Lo");
                                                    result.put("kmx_id", "Lo");
                                                    result.put("sql_value", MsgERC_Lo);
                                                    result.put("kmx_value", result2.get(key2));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                        }
                                        Label_45850: {
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
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_La");
                                                        result.put("kmx_id", "La");
                                                        result.put("sql_value", MsgERC_La);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_45850;
                                                    }
                                                }
                                                if (MsgERC_La == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (La1 == null) {
                                                    if (La2 != null) {
                                                        if (La2.equals(MsgERC_La)) {
                                                            continue;
                                                        }
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_La");
                                                        result.put("kmx_id", "La");
                                                        result.put("sql_value", MsgERC_La);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                    }
                                                }
                                                else {
                                                    if (La1.equals(MsgERC_La)) {
                                                        continue;
                                                    }
                                                    result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                    result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                    result.put("MsgTime", MsgERC_MsgTime);
                                                    result.put("Event_id", "16");
                                                    result.put("sql_id", "MsgERC_La");
                                                    result.put("kmx_id", "La");
                                                    result.put("sql_value", MsgERC_La);
                                                    result.put("kmx_value", result2.get(key2));
                                                    this.outputSql.add(result);
                                                    result = new HashMap<String, Object>();
                                                }
                                            }
                                        }
                                        Label_46313: {
                                            if (key2.equals("Satellite")) {
                                                if (MsgERC_Satellite == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_46313;
                                                    }
                                                }
                                                if (MsgERC_Satellite != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Satellite");
                                                        result.put("kmx_id", "Satellite");
                                                        result.put("sql_value", MsgERC_Satellite);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_46313;
                                                    }
                                                }
                                                if (MsgERC_Satellite == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_Satellite)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "16");
                                                result.put("sql_id", "MsgERC_Satellite");
                                                result.put("kmx_id", "Satellite");
                                                result.put("sql_value", MsgERC_Satellite);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        Label_46776: {
                                            if (key2.equals("Direction")) {
                                                if (MsgERC_Direction == null) {
                                                    if (result2.get(key2) != null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id:", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", null);
                                                        result.put("kmx_value", result2.get(key2));
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_46776;
                                                    }
                                                }
                                                if (MsgERC_Direction != null) {
                                                    if (result2.get(key2) == null) {
                                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                        result.put("MsgTime", MsgERC_MsgTime);
                                                        result.put("Event_id", "16");
                                                        result.put("sql_id", "MsgERC_Direction");
                                                        result.put("kmx_id", "Direction");
                                                        result.put("sql_value", MsgERC_Direction);
                                                        result.put("kmx_value", null);
                                                        this.outputSql.add(result);
                                                        result = new HashMap<String, Object>();
                                                        break Label_46776;
                                                    }
                                                }
                                                if (MsgERC_Direction == null) {
                                                    if (result2.get(key2) == null) {
                                                        continue;
                                                    }
                                                }
                                                if (result2.get(key2).equals(MsgERC_Direction)) {
                                                    continue;
                                                }
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("sql_id", "MsgERC_Direction");
                                                result.put("Event_id", "16");
                                                result.put("kmx_id", "Direction");
                                                result.put("sql_value", MsgERC_Direction);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                            }
                                        }
                                        if (!key2.equals("GSMSignal")) {
                                            continue;
                                        }
                                        if (MsgERC_GSMSignal == null) {
                                            if (result2.get(key2) != null) {
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "16");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", null);
                                                result.put("kmx_value", result2.get(key2));
                                                this.outputSql.add(result);
                                                continue;
                                            }
                                        }
                                        if (MsgERC_GSMSignal != null) {
                                            if (result2.get(key2) == null) {
                                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                                result.put("MsgTime", MsgERC_MsgTime);
                                                result.put("Event_id", "16");
                                                result.put("sql_id", "MsgERC_GSMSignal");
                                                result.put("kmx_id", "GSMSignal");
                                                result.put("sql_value", MsgERC_GSMSignal);
                                                result.put("kmx_value", null);
                                                this.outputSql.add(result);
                                                result = new HashMap<String, Object>();
                                                continue;
                                            }
                                        }
                                        if (MsgERC_GSMSignal == null) {
                                            if (result2.get(key2) == null) {
                                                continue;
                                            }
                                        }
                                        if (result2.get(key2).equals(MsgERC_GSMSignal)) {
                                            continue;
                                        }
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("Event_id", "16");
                                        result.put("sql_id", "MsgERC_GSMSignal");
                                        result.put("kmx_id", "GSMSignal");
                                        result.put("sql_value", MsgERC_GSMSignal);
                                        result.put("kmx_value", result2.get(key2));
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0001_00_18")) {
                                    if (MsgERC_EventCount != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EventCount");
                                        result.put("sql_value", MsgERC_EventCount);
                                        result.put("kmx_id", "TY_0001_00_18");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_677")) {
                                    if (MsgERC_SysE_ID != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_SysE_ID");
                                        result.put("sql_value", MsgERC_SysE_ID);
                                        result.put("kmx_id", "TY_0002_00_677");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_678")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_678");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_679")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_679");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_681")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_681");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_682")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_682");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_683")) {
                                    if (MsgERC_MaxSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_MaxSpeed");
                                        result.put("sql_value", MsgERC_MaxSpeed);
                                        result.put("kmx_id", "TY_0002_00_683");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_684")) {
                                    if (MsgERC_AvgSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_AvgSpeed");
                                        result.put("sql_value", MsgERC_AvgSpeed);
                                        result.put("kmx_id", "TY_0002_00_684");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_685")) {
                                    if (MsgERC_RunKm != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_RunKm");
                                        result.put("sql_value", MsgERC_RunKm);
                                        result.put("kmx_id", "TY_0002_00_685");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_686")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_686");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_687")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_687");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_688")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_688");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_689")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_689");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_690")) {
                                    if (MsgERC_RunKm != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_RunKm");
                                        result.put("sql_value", MsgERC_RunKm);
                                        result.put("kmx_id", "TY_0002_00_690");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_691")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_691");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_692")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_692");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_693")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_693");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_694")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_694");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_695")) {
                                    if (MsgERC_MaxSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_MaxSpeed");
                                        result.put("sql_value", MsgERC_MaxSpeed);
                                        result.put("kmx_id", "TY_0002_00_695");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_696")) {
                                    if (MsgERC_AvgSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_AvgSpeed");
                                        result.put("sql_value", MsgERC_AvgSpeed);
                                        result.put("kmx_id", "TY_0002_00_696");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_697")) {
                                    if (MsgERC_RunKm != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_RunKm");
                                        result.put("sql_value", MsgERC_RunKm);
                                        result.put("kmx_id", "TY_0002_00_697");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_698")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_698");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_699")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_699");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_700")) {
                                    if (MsgERC_AvgThrottle != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_AvgThrottle);
                                        result.put("sql_id", "MsgERC_AvgThrottle");
                                        result.put("sql_value", MsgERC_EventCount);
                                        result.put("kmx_id", "TY_0002_00_700");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_701")) {
                                    if (MsgERC_RunKm != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_RunKm");
                                        result.put("sql_value", MsgERC_RunKm);
                                        result.put("kmx_id", "TY_0002_00_701");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_702")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_BgnTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_EventCount);
                                        result.put("kmx_id", "TY_0002_00_702");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_703")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_703");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_705")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_705");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_706")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_706");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_707")) {
                                    if (MsgERC_MaxSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_MaxSpeed");
                                        result.put("sql_value", MsgERC_MaxSpeed);
                                        result.put("kmx_id", "TY_0002_00_707");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_708")) {
                                    if (MsgERC_AvgSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_AvgSpeed");
                                        result.put("sql_value", MsgERC_AvgSpeed);
                                        result.put("kmx_id", "TY_0002_00_708");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_709")) {
                                    if (MsgERC_RunKm != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_RunKm");
                                        result.put("sql_value", MsgERC_RunKm);
                                        result.put("kmx_id", "TY_0002_00_709");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_710")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_710");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_711")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_711");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_713")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_713");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_714")) {
                                    if (MsgERC_AvgThrottle != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_AvgThrottle");
                                        result.put("sql_value", MsgERC_AvgThrottle);
                                        result.put("kmx_id", "TY_0002_00_714");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_716")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_716");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_717")) {
                                    if (MsgERC_BgnMileage != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnMileage");
                                        result.put("sql_value", MsgERC_BgnMileage);
                                        result.put("kmx_id", "TY_0002_00_717");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_718")) {
                                    if (MsgERC_EndTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndTime");
                                        result.put("sql_value", MsgERC_EndTime);
                                        result.put("kmx_id", "TY_0002_00_718");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_719")) {
                                    if (MsgERC_EndMileage != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndMileage");
                                        result.put("sql_value", MsgERC_EndMileage);
                                        result.put("kmx_id", "TY_0002_00_719");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_720")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_720");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_721")) {
                                    if (MsgERC_DurationTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_DurationTime");
                                        result.put("sql_value", MsgERC_DurationTime);
                                        result.put("kmx_id", "TY_0002_00_721");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_722")) {
                                    if (MsgERC_BgnSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnSpeed");
                                        result.put("sql_value", MsgERC_BgnSpeed);
                                        result.put("kmx_id", "TY_0002_00_722");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_723")) {
                                    if (MsgERC_EndSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_EndSpeed");
                                        result.put("sql_value", MsgERC_EndSpeed);
                                        result.put("kmx_id", "TY_0002_00_723");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_725")) {
                                    if (MsgERC_BgnTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnTime");
                                        result.put("sql_value", MsgERC_BgnTime);
                                        result.put("kmx_id", "TY_0002_00_725");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_726")) {
                                    if (MsgERC_DurationTime != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_DurationTime");
                                        result.put("sql_value", MsgERC_DurationTime);
                                        result.put("kmx_id", "TY_0002_00_726");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (!list.contains("TY_0002_00_727")) {
                                    if (MsgERC_BgnSpeed != null) {
                                        result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                        result.put("Vcl_ID", MsgERC_Vcl_ID);
                                        result.put("MsgTime", MsgERC_MsgTime);
                                        result.put("sql_id", "MsgERC_BgnSpeed");
                                        result.put("sql_value", MsgERC_BgnSpeed);
                                        result.put("kmx_id", "TY_0002_00_727");
                                        result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                        this.outputSql.add(result);
                                        result = new HashMap<String, Object>();
                                    }
                                }
                                if (list.contains("TY_0002_00_728")) {
                                    continue;
                                }
                                if (MsgERC_EndSpeed == null) {
                                    continue;
                                }
                                result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
                                result.put("Vcl_ID", MsgERC_Vcl_ID);
                                result.put("MsgTime", MsgERC_MsgTime);
                                result.put("sql_id", "MsgERC_EndSpeed");
                                result.put("sql_value", MsgERC_EndSpeed);
                                result.put("kmx_id", "TY_0002_00_728");
                                result.put("kmx_value", "kmx\u7f3a\u5c11\u6570\u636e");
                                this.outputSql.add(result);
                                result = new HashMap<String, Object>();
                            }
                        }
                        return;
                    }
                }
            }
            result.put("InfoType", "\u4e8b\u4ef6\u62a5\u544a");
            result.put("Vcl_ID", deviceID);
            result.put("kmx_value", "kmx\u65e0\u8be5\u8bbe\u5907\u6570\u636e");
            this.outputSql.add(result);
            result = new HashMap<String, Object>();
        }
    }
}
