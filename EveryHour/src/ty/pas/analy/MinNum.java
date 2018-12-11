package ty.pas.analy;

import java.util.List;

public class MinNum {
    public List minNumFloat(List<Float> list,List<Float> listNew)
    {
        for(int i = 0; i < list.size(); i++){
            float item = list.get(i);
            if(item>0.0){
                listNew.add(item);
            }
        }
        return listNew;
    }
    public List minNumInt(List<Integer> list,List<Integer> listNew)
    {
        for(int i = 0; i < list.size(); i++){
            int item = list.get(i);
            if(item>0){
                listNew.add(item);
            }
        }
        return listNew;
    }
    public List minNumDouble(List<Double> list,List<Double> listNew)
    {
        for(int i = 0; i < list.size(); i++){
            double item = list.get(i);
            if(item>0.0){
                listNew.add(item);
            }
        }
        if (listNew.size()>0)
            return listNew;
        else
            return list;
    }
}
