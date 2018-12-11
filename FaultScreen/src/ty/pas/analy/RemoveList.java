package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {
    public RemoveList(){

    }
    /**
     * 获取两个List的不同元素
     * @param list1
     * @param list2
     * @return
     */
    public  List<Integer> getDiffrent(List<Integer> list1, List<Integer> list2) {
        long st = System.nanoTime();
        List<Integer> diff = new ArrayList<Integer>();
        for(Integer str:list2)
        {
            if(!list1.contains(str))
            {
                diff.add(str);
            }
        }
//        System.out.println("total times "+(System.nanoTime()-st));

        return diff;
    }
}
