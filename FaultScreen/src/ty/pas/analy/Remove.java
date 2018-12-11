package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public Remove(){

    }

    public List<Integer> RemoveFirst(List<String> list1,List<String> list2)
    {
        List<Integer> listFirst = new ArrayList<>();
        for (int i=0;i<list1.size();i++)
        {
            String s="";
            for (int j=0;j<list2.size();j++)
            {
                s=list1.get(i).toString();

            }
            listFirst.add(list2.indexOf(s));
//            listNum.add(list2.lastIndexOf(s));
        }
//        System.out.println(listFirst);
        return listFirst;
    }
    public List<Integer> RemoveEnd(List<String> list1,List<String> list2)
    {
        List<Integer> listEnd = new ArrayList<>();
        for (int i=0;i<list1.size();i++)
        {
            String s="";
            for (int j=0;j<list2.size();j++)
            {
                s=list1.get(i).toString();

            }
//            listEnd.add(list2.indexOf(s));
            listEnd.add(list2.lastIndexOf(s));
        }
//        System.out.println(listEnd);
        return listEnd;
    }

}
