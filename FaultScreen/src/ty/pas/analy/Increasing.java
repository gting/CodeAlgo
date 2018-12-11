package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Increasing {
    public Increasing() {

    }

    public int xiabiao(List<String> list) {
        Subscript subscript=new Subscript();
        List<List<Integer>> SubList=new ArrayList<>();
        SubList=subscript.Sub(list);
//        System.out.println(SubList);
        int n = 0;
        int z = 0;

        List<List<Integer>> newSubList=new ArrayList<>();
        for (int k=0;k<SubList.size();k++)
        {
            if (SubList.get(k).size()>0)
            {
                newSubList.add(SubList.get(k));
            }
        }
        if (newSubList.size()==SubList.size())
        {
            for (int i=1;i<=newSubList.size()-1;i++)
            {
                if (newSubList.get(i).size()>0)
                {
                    if (newSubList.get(i).get(0)-newSubList.get(i-1).get(newSubList.get(i-1).size()-1)==1)
                        n++;
                    else
                        z++;
                }

            }
        }
        else
            return 5;


      /*  System.out.println(n);
        System.out.println("z = " + z);*/
        //全部连续递增
        if (z == 0 && n > 0) {
            return 1;
        }
        //有间隔
        else if (z > 0&&n==0) {
            return 3;
        }
        //两种情况
        else if (n>0&&z>0)
        {
            return 4;
        }
        else
            return 5;
    }
}
