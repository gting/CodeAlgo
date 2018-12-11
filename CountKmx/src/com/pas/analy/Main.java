package com.pas.analy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Main类  2018/3/31 15:10
 *
 * @author liufupo
 */

public class Main {
    public static void main(String[] args) {
        List<Double> data = new ArrayList<>();
        for (int i =0;i<100;i++){
            data.add(Math.random()*100);
        }
/*        Collections.sort(data, new Comparator<Double>(){
            @Override
            public int compare(Double arg0, Double arg1) {
                  return arg0.compareTo(arg1);
            }
        });
        for (Double one:data){
            System.out.println(one);
        }*/
        Boxplot boxplot = new Boxplot(data);
        System.out.println(boxplot.getMedian());
        System.out.println(boxplot.getFirstQuantiles());
        System.out.println(boxplot.getThirdQuantiles());
        System.out.println(boxplot.getUpLimit());
        System.out.println(boxplot.getDownLimit());
    }
}
