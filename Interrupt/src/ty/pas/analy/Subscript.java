package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Subscript {

    public int[] Sub(String s){

        List<Integer> SubList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1')
            {
                SubList.add(i+1);

            }
        }
        int[] array = new int[SubList.size()];
        for(int i = 0;i<SubList.size();i++){
            array[i] = SubList.get(i);
        }
        return array;
    }
}
