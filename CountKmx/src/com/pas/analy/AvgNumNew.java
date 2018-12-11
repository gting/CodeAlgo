package com.pas.analy;

import java.util.List;


public class AvgNumNew {
    public float avgNumFloat(List<Float> list){
        float sum=0f;
        int n=0;
        for (int i=0;i<list.size();i++)
        {
            if (list.get(1)==0)
            {
                n++;
                continue;
            }
            else
                sum+=list.get(i);
        }
        float avg;
        if (n<list.size())
            avg=sum/(list.size()-n);
        else
            avg=0;
        return avg;
    }
    public int avgNumint(List<Integer> list){
        int sum=0;
        int n=0;
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==0)
            {
                n++;
                continue;
            }
            else
                sum+=list.get(i);
        }
        int avg;
        if (n<list.size())
            avg=sum/(list.size()-n);
        else
            avg=0;
        return avg;
    }
    public double avgNumDouble(List<Double> list){
        double sum=0;
        int n=0;
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==0)
            {
                n++;
                continue;
            }
            else
                sum+=list.get(i);
        }
        double avg;
        if (n<list.size())
            avg=sum/(list.size()-n);
        else
            avg=0;
        return avg;
    }

}
