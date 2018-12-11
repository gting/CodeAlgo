package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TimeDiff {
    //时间间隔限制（毫秒）
    private Long range = 0L;
    //通过众数得到时间间隔
    public Long getRange(int sample, List<Long> times) {
        List<List<Long>> indexs = new ArrayList<>();
        for (int i = 1; i < sample; i++) {
            Long interval = times.get(i) - times.get(i - 1);
            int flag = 0;
            for (List<Long> index : indexs) {
                if (Objects.equals(index.get(0), interval)) {
                    index.add(interval);
                    flag++;
                }
            }
            if (flag == 0) {
                List<Long> newIndex = new ArrayList<>();
                newIndex.add(interval);
                indexs.add(newIndex);
            }
        }
        int max = 0;
        for (int i = 0; i < indexs.size(); i++) {
            if (max<indexs.get(i).size()){
                max =indexs.get(i).size();
                range = indexs.get(i).get(0);
            }
        }

        return range;
    }
    public void setRange(Long range) {
        this.range = range;
    }
}
