package com.pas.analy;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CoutOil类  2018/4/10 9:28
 * 计算单位时间内的油耗
 *
 * @author liufupo
 */

public class CoutOil {
    //总油耗
    private Double allOil = 0D;
    //时间间隔限制（毫秒）
    private Long range = 101L;

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

        return range+5;
    }

    //计算当前时间段的油耗
    public void Calculation(List<Long> times, List<Double> oils) {
        int sample = (int) Math.floor(times.size() / 20);

        range = getRange(sample,times);

        for (int i = 1; i < times.size(); i++) {
            Long interval = times.get(i) - times.get(i - 1);
            if (interval <= range) {
                allOil += ((interval * ((oils.get(i) + oils.get(i - 1)) / 2)));
            }
        }
        allOil = allOil / 3600000;
    }

    public Double getAllOil() {
        return allOil;
    }

    public void setRange(Long range) {
        this.range = range;
    }
}
