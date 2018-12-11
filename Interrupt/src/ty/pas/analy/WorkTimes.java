package ty.pas.analy;

import com.sagittarius.bean.result.DoublePoint;
import com.sagittarius.bean.result.IntPoint;
import com.sagittarius.bean.result.StringPoint;

import java.util.ArrayList;
import java.util.List;

public class WorkTimes {

    public List<Long> doubleworkTimes(List<DoublePoint> list)
    {
        List<Long> workTimes = new ArrayList<>();
        if (list!=null || list.size()>0)
        {
            for (DoublePoint one : list) {
                workTimes.add(one.getPrimaryTime());

            }
        }

        return workTimes;
    }
    public List<Long> intworkTimes(List<IntPoint> list)
    {
        List<Long> workTimes = new ArrayList<>();
        if (list!=null || list.size()>0)
        {
            for (IntPoint one : list) {
                workTimes.add(one.getPrimaryTime());

            }
        }

        return workTimes;
    }
    public List<Long> stringworkTimes(List<StringPoint> list)
    {
        List<Long> workTimes = new ArrayList<>();
        if (list!=null || list.size()>0)
        {
            for (StringPoint one : list) {
                workTimes.add(one.getPrimaryTime());

            }
        }

        return workTimes;
    }

}
