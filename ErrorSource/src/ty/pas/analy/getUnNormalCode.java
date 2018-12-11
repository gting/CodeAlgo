package ty.pas.analy;

import com.sagittarius.bean.result.*;
import com.sagittarius.util.TimeUtil;
import edu.thss.platform.pas.userfunc.UserFunction;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getUnNormalCode extends UserFunction {
    public void runOne(List<String> list,
                       Map<String, Map<String, List<Map<String, String>>>> map,
                       Map<String, Map<String, List<FloatPoint>>> map1,
                       Map<String, Map<String, List<DoublePoint>>> map2,
                       Map<String, Map<String, List<StringPoint>>> map3,
                       Map<String, Map<String, List<IntPoint>>> map4,
                       Map<String, Map<String, List<LongPoint>>> map5,
                       Map<String, Map<String, List<BooleanPoint>>> map6,
                       Map<String, Map<String, List<GeoPoint>>> map7, long l, long l1) {

        String device = list.get(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        if (map3 != null && map3.size() > 0) {
            List<StringPoint> codelist = map3.get(device).get("TC_0002_00_01");
            String Vcl_No = null;
            List<Map<String, String>> vclmap = map.get(device).get("Vcl_Info");

            if (vclmap != null && vclmap.size() > 0) {
                Vcl_No = vclmap.get(0).get("Vcl_No");
            }

            if (codelist != null && codelist.size() > 0) {
                for (StringPoint sp : codelist) {
                    String code = sp.getValue();
                    if (code.indexOf("16FF0100000106CBFFFFFFFF") > -1) {
                        HashMap<String, Object> rs = new HashMap<String, Object>();
                        rs.put("Vcl_ID", device);
                        rs.put("Vcl_No", Vcl_No);
                        Long time = sp.getPrimaryTime();
                        String happentime = TimeUtil.date2String(time, df);
                        rs.put("MsgTime", happentime);
                        rs.put("Code", code);
                        outputSql.add(rs);
                        break;
                    }
                }
            }
        }
        return;
    }
}
