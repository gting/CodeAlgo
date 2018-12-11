package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    public Interval(){

    }

    public List<Integer> Interval(List list){
        ConInterval conInterval=new ConInterval();
        List<Integer> list1 = new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            list1.add(i);

        }
       /* for (int i=0;i<conInterval.ConInterval(list).size();i++)
        {
            for (int i1=0;i1<list1.size();i1++)
            {
                if (list1.get(i1)==conInterval.ConInterval(list).get(i))
                    list1.remove(i1);
                i1--;
            }
        }*/
       RemoveList removeList=new RemoveList();

       return removeList.getDiffrent(conInterval.Continue(list),list1);
    }
}
