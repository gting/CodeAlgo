package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Subscript {
    public Subscript(){

    }

    public List<List<Integer>> Sub(List<String> list){
        String[] s = new String[list.size()];
        List<List<Integer>> SubList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> num = new ArrayList<>();
            for (int j = 0; j < list.get(i).toString().length(); j++) {
                char ch = list.get(i).toString().charAt(j);
                if (ch == '1')
                    num.add(j);

            }
            SubList.add(num);
        }
        List<List<Integer>> NewSubList = new ArrayList<>();

        NewSubList.add(SubList.get(0));
        for (int i=1;i<=SubList.size()-1;i++)
        {
            NewSubList.add(getDiffrent(SubList.get(i-1),SubList.get(i)));
        }

        return NewSubList;
    }
    /**
     * 获取两个List的不同元素
     * @param list1
     * @param list2
     * @return
     */
    private static List<Integer> getDiffrent(List<Integer> list1, List<Integer> list2) {
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
