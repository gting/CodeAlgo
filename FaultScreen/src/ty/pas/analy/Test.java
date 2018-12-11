package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("000000011000000000000000");
        list.add("000000011100000000000000");
        list.add("000000011110000000000000");
        list.add("000000011110100000000000");
        list.add("000000011110110000000000");
        list.add("000000011110110111000000");
        list.add("000000011110110111100000");
        /*list.add("000000000010000000000000");
        list.add("000000000010000100000000");*/
        /*list.add("000000000001100000000000");
        list.add("000000000001100000000000");
        list.add("000000000001100100000000");
        list.add("000000000001100111000000");
        list.add("000000000001100111100000");
        list.add("000000000001100111100000");
        list.add("000000000001100111100000");*/

        /*List list2 = new ArrayList();
        list2.add("000000000001100000000000");
        list2.add("000000000001100100000000");
        list2.add("000000000001100111000000");
        list2.add("000000000001100111100000");*/

       /* list.add("000100000110000000000000");
        list.add("000100000110000000100000");*/

        /*Increasing increasing=new Increasing();
        increasing.xiabiao(list);*/
        /*TimeLong timeLong=new TimeLong();
        for (int i=0;i<list.size();i++)
        {
            System.out.println(timeLong.TimeLong(list.get(i)));
        }
        System.out.println(timeLong.TimeLong(list.get(list.size()-1).toString()));*/

     /*   ConInterval conInterval = new ConInterval();
        conInterval.Continue(list);*/
        InterTimeLong interTimeLong = new InterTimeLong();
        interTimeLong.InterTimeLong(list.get(1));

        CompareList compareList = new CompareList();
        System.out.println(compareList.compareList(list.get(4).toString(),list.get(5).toString()));

    }


}
