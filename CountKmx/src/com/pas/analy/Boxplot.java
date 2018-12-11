package com.pas.analy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Boxplot类  2018/3/31 15:10
 *
 * @author liufupo
 */

public class Boxplot {
    private List<Double> data = new ArrayList<>();

    //中位数
    private Double median;
    //第一四分位数
    private Double firstQuantiles;
    //第三四分位数
    private Double thirdQuantiles;
    //上限
    private Double upLimit;
    //下限
    private Double downLimit;
    //IQR
    private Double IQR;

    public Boxplot(List<Double> data) {

        Collections.sort(data, new Comparator<Double>() {
            @Override
            public int compare(Double arg0, Double arg1) {
                return arg0.compareTo(arg1);
            }
        });

        this.data.addAll(data);
        this.median = this.data.get((int) Math.floor((data.size() - 1) / 2));
        this.firstQuantiles = this.data.get((int) Math.floor((data.size() - 1) / 4));
        this.thirdQuantiles = this.data.get((int) Math.floor(((data.size() - 1) * 3) / 4));
        IQR = thirdQuantiles - firstQuantiles;
        calculationUpLimit();
        calculationDownLimit();
    }


    private void calculationUpLimit() {
        upLimit = thirdQuantiles + (1.5 * IQR);
        int i = data.size() - 1;
        while (i > 0) {
            if (data.get(i) <= upLimit) {
                upLimit = data.get(i);
                break;
            }
            i--;
        }
    }

    private void calculationDownLimit() {
        downLimit = firstQuantiles - (1.5 * IQR);
        int i = 0;
        while (i < data.size() - 1) {
            if (data.get(i) >= downLimit) {
                downLimit = data.get(i);
                break;
            }
            i++;
        }
    }

    public List<Double> getData() {
        return data;
    }

    public Double getMedian() {
        return median;
    }

    public Double getFirstQuantiles() {
        return firstQuantiles;
    }

    public Double getThirdQuantiles() {
        return thirdQuantiles;
    }

    public Double getUpLimit() {
        return upLimit;
    }

    public Double getDownLimit() {
        return downLimit;
    }
}

