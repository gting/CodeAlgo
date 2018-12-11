package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class ConInterval {
    public ConInterval(){

    }

    public List<Integer> Continue(List<String> list){
        Subscript subscript = new Subscript();
        List<List<Integer>> SubList=new ArrayList<>();
        SubList=subscript.Sub(list);
        List<Integer> integerList = new ArrayList<>();
        for (int i=1;i<=subscript.Sub(list).size()-1;i++)
        {
            if (SubList.get(i ).get(0) - SubList.get(i-1).get(SubList.get(i-1).size() - 1) > 1)
            {
                integerList.add(i);
            }
        }
//        System.out.println(integerList);
        return integerList;
    }

}
