package ty.pas.analy;

import java.util.List;


public class AvgNum {
    public float avgNumFloat(List<Float> list){
        float sum=0f;

        for (int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        float avg;
        avg=sum/(list.size());
        return avg;
    }
    public int avgNumint(List<Integer> list){
        int sum=0;

        for (int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        int avg;
        avg=sum/(list.size());

        return avg;


    }
    public double avgNumDouble(List<Double> list){
        float sum=0;

        for (int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        float avg;
        avg=sum/(list.size());

        return avg;
    }
}
