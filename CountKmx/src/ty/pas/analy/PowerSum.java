package ty.pas.analy;

import com.sagittarius.bean.result.*;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PowerSum extends UserFunction {

    @Override
    public void runOne(List<String> deviceList,
                       Map<String, Map<String, List<Map<String, String>>>> sqlData,
                       Map<String, Map<String, List<FloatPoint>>> floatInput,
                       Map<String, Map<String, List<DoublePoint>>> doubleInput,
                       Map<String, Map<String, List<StringPoint>>> stringInput, Map<String, Map<String, List<IntPoint>>> intInput,
                       Map<String, Map<String, List<LongPoint>>> longInput,
                       Map<String, Map<String, List<BooleanPoint>>> booleanInput,
                       Map<String, Map<String, List<GeoPoint>>> geoInput, long startTime, long endTime) {
        String device = deviceList.get(0);

        List<AbstractPoint> alldata = new ArrayList<AbstractPoint>();
        List<StringPoint> version = stringInput.get(device).get("TY_0001_00_42");
        List<DoublePoint> youhao = doubleInput.get(device).get("KM_0002_02_03");
        List<DoublePoint> niujubaifenbi = doubleInput.get(device).get("KM_0002_02_05");
        List<DoublePoint> Fdianliu = doubleInput.get(device).get("KM_0002_02_09");
        List<DoublePoint> Rdianliu = doubleInput.get(device).get("KM_0002_02_10");
        List<IntPoint> action = intInput.get(device).get("KM_0002_02_11");
        List<StringPoint> actiontype = stringInput.get(device).get("KM_0002_02_12");
        List<DoublePoint> zhuansu=doubleInput.get(device).get("KM_0002_02_04");
        List<DoublePoint> niuju=doubleInput.get(device).get("KM_0002_02_06");

        if(version !=null && version.size()>0) {
            String ver = version.get(0).getValue();
            System.out.println(ver);
            if (zhuansu != null && zhuansu.size() > 0)
                minus(zhuansu, device, ver, true);
            if (niuju != null && niuju.size() > 0)
                minus(niuju, device, ver, false);
            alldata.addAll(zhuansu);
            //106504 新工况，时间间隔是>80ms
            alldata.addAll(niuju);
            if (alldata != null) {
                Map<Long, List<AbstractPoint>> resultMap = alldata.stream().collect(
                        Collectors.groupingBy(AbstractPoint::getPrimaryTime));
                for (List<AbstractPoint> list : resultMap.values()) {
                    if(list.size()>1) {
                        Double zhuansu1 = ((DoublePoint) list.get(0)).getValue();
                        Double niuju1 = ((DoublePoint) list.get(1)).getValue();
                        Double gonglv = niuju1 * zhuansu1;
                        HashMap<String, Object> rs = new HashMap<>();

                        rs.put("开始时间", list.get(0).getPrimaryTime());
                        rs.put("结束时间", list.get(1).getSecondaryTime());
                        rs.put("设备号", device);
                        rs.put("TC_0003_02_65", Float.parseFloat(String.valueOf(gonglv)));

                        System.out.println(rs);
                        outputKmx.add(rs);


                    }
                    else
                    {
                        HashMap<String, Object> rs = new HashMap<>();
                        Double zhuansu1 = ((DoublePoint) list.get(0)).getValue();
                        rs.put("开始时间", list.get(0).getPrimaryTime());
                        rs.put("结束时间", list.get(0).getSecondaryTime());
                        rs.put("设备号", device);
                        rs.put("TC_0003_02_65", -99.99F);

                        // System.out.println(rs);
                        outputKmx.add(rs);
                    }
                }
            }
        }
        if (version != null && version.size() > 0) {
            String ver = version.get(0).getValue();
            System.out.println(ver);
            if (niujubaifenbi != null && niujubaifenbi.size() > 0)
                minus2(niujubaifenbi, device, ver, 2);
            if (Fdianliu != null && Fdianliu.size() > 0)
                minus2(Fdianliu, device, ver, 0);
            if (Rdianliu != null && Rdianliu.size() > 0)
                minus2(Rdianliu, device, ver, 1);
            if (action != null && action.size() > 0)
                minuint(action, device, ver);
            if (actiontype != null && actiontype.size() > 0)
                minusstring(actiontype, device, ver);
            if (youhao!=null&&youhao.size()>0)
                minus2(youhao,device,ver,0);

        }
    }
    //按照最开始的是最正确的原理
    private void minus(List<DoublePoint> list,String device,String Version,boolean para){
        int i=0;
        HashMap<String,Object> result=new HashMap<>();

        while(i<list.size()-1){
            float tm=list.get(i+1).getPrimaryTime()-list.get(i).getPrimaryTime();

            //记录时间差值
            float vm=(float) list.get(i+1).getValue()-(float) list.get(i).getValue();


            if(Version.equals("106504") && tm>=980 && tm<=1020){
                float rs=vm/tm;
                result.put("设备号",device);
                result.put("开始时间",list.get(i).getPrimaryTime());
                result.put("结束时间",list.get(i+1).getPrimaryTime());
                if(para==true) {
                    result.put("TC_0003_02_01", tm);
                    result.put("TC_0003_02_03", rs);
                    result.put("TC_0003_02_05", vm);
                    //记录加速度
                }
                else
                {
                    result.put("TC_0003_02_02", tm);
                    result.put("TC_0003_02_04", rs);
                    result.put("TC_0003_02_06", vm);
                }
                // System.out.println(result);
                outputKmx.add(result);
                result=new HashMap<>();
            }
            if(!Version.equals("106504") && tm>=60 && tm<=100){
                float rs=vm/tm;
                result.put("设备号",device);
                result.put("开始时间",list.get(i).getPrimaryTime());
                result.put("结束时间",list.get(i+1).getPrimaryTime());
                if(para==true) {
                    result.put("TC_0003_02_01", tm);
                    result.put("TC_0003_02_03", rs);
                    result.put("TC_0003_02_05", vm);
                    //记录加速度
                }
                else
                {
                    result.put("TC_0003_02_02", tm);
                    result.put("TC_0003_02_04", rs);
                    result.put("TC_0003_02_06", vm);
                }
                // System.out.println(result);
                outputKmx.add(result);
                result=new HashMap<>();
            }
            i++;
        }

    }
    //按照最开始的是最正确的原理
    private void minus2(List<DoublePoint> list, String device, String Version, int para) {
        int i = 0;
        HashMap<String, Object> result = new HashMap<>();

        while (i < list.size() - 1) {
            float tm = list.get(i + 1).getPrimaryTime() - list.get(i).getPrimaryTime();

            //记录时间差值
            float vm = (float) list.get(i + 1).getValue() - (float) list.get(i).getValue();

            float rs;

            if (Version.equals("106504") && tm >= 980 && tm <= 1020) {
                rs= vm / tm;
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());
                if (para == 0) {
                    result.put("TC_0003_02_09", tm);

                    //记录加速度
                } else if (para == 1) {
                    result.put("TC_0003_02_10", tm);

                } else if (para == 2) {
                    result.put("TC_0003_02_08", tm);

                }
                // System.out.println(result);
                outputKmx.add(result);
                result = new HashMap<>();
            }

            if (Version.equals("106504") && tm > 29980 && tm < 30020) {
                rs= vm / tm;
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());
                if (para == 0) {
                    result.put("TC_0003_02_13", tm);


                    //记录加速度
                }
                // System.out.println(result);
                outputKmx.add(result);
                result = new HashMap<>();
            }
            if (!Version.equals("106504") && tm >= 60 && tm <= 100) {
                rs= vm / tm;
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());
                if (para == 0) {
                    result.put("TC_0003_02_09", tm);

                    //记录加速度
                } else if (para == 1) {
                    result.put("TC_0003_02_10", tm);


                } else if (para == 2) {
                    result.put("TC_0003_02_08", tm);

                }
                // System.out.println(result);
                outputKmx.add(result);
                result = new HashMap<>();
            }
            if (!Version.equals("106504") && tm > 80 && tm < 120) {
                rs= vm / tm;
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());
                if (para == 0) {
                    result.put("TC_0003_02_13", tm);


                    //记录加速度
                }
                // System.out.println(result);
                outputKmx.add(result);
                result = new HashMap<>();
            }

            i++;
        }

    }

    private void minuint(List<IntPoint> list, String device, String Version) {
        int i = 0;
        HashMap<String, Object> result = new HashMap<>();

        while (i < list.size() - 1) {
            float tm = list.get(i + 1).getPrimaryTime() - list.get(i).getPrimaryTime();
            if (Version.equals("106504") && tm > 480 && tm < 520) {
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());

                result.put("TC_0003_02_11", tm);
                //记录加速度


                outputKmx.add(result);
                result = new HashMap<>();
            }
            if (!Version.equals("106503") && tm > 80 && tm < 120) {
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());

                result.put("TC_0003_02_11", tm);
                //记录加速度

                outputKmx.add(result);
                result = new HashMap<>();
            }
            i++;
        }
    }

    private void minusstring(List<StringPoint> list, String device, String Version) {
        int i = 0;
        HashMap<String, Object> result = new HashMap<>();

        while (i < list.size() - 1) {
            float tm = list.get(i + 1).getPrimaryTime() - list.get(i).getPrimaryTime();
            if (Version.equals("106504") && tm > 480 && tm < 520) {
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());

                result.put("TC_0003_02_12", tm);
                //记录加速度


                outputKmx.add(result);
                result = new HashMap<>();
            }
            if (!Version.equals("106503") && tm > 80 && tm < 120) {
                result.put("设备号", device);
                result.put("开始时间", list.get(i).getPrimaryTime());
                result.put("结束时间", list.get(i + 1).getPrimaryTime());

                result.put("TC_0003_02_12", tm);
                //记录加速度

                outputKmx.add(result);
                result = new HashMap<>();
            }
            i++;
        }
    }

}
