package com.pas.analy;

import java.util.List;
import java.util.Objects;

/**
 * WorkTime类  2018/4/10 9:49
 * 统计各个工作模式的工作时间
 * @author liufupo
 */

public class CoutWorkTime {
    //P+B模式工作时间
    private Long P_B = 0L;
    //E模式工作时间
    private Long E = 0L;
    //L模式工作时间
    private Long L = 0L;
    //间隔时间限制(毫秒)
    private Long range = 1100L;

    //计算
    public void Calculation(List<Long> times, List<Integer> patterns) {
        for (int i = 1; i < times.size(); i++) {
            if (times.get(i) - times.get(i - 1) > range && Objects.equals(patterns.get(i), patterns.get(i - 1))) {
                int type = patterns.get(i);
                switch (patterns.get(i)) {
                    case 11:
                        P_B += times.get(i) - times.get(i - 1);
                        break;
                    case 33:
                        E += times.get(i) - times.get(i - 1);
                        break;
                    case 34:
                        L += times.get(i) - times.get(i - 1);
                        break;
                    default:
                        System.out.println("无效的类型");
                }
            }
        }
    }

    private Double toMinute(Long time){
        return Double.valueOf(time)/60000;
    }

    public Double getHourE() {
        return toMinute(E);
    }

    public Double getHourL() {
        return toMinute(L);
    }

    public Double getHourB_P() {
        return toMinute(P_B);
    }

    public void setRange(Long range) {
        this.range = range;
    }
}
