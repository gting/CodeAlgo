package ty.pas.analy;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s = "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100000000000000000000000000000000001000000000000000000000000000000000010000000000000000000000000000000001000000000000001111111111111111111111111100000011111111111111111111111111111111111111111111111111111111110000000000011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111000000000000000000000000000000000010000000000000000000000000000000000100000000000000000000000000000000010000000000000000000000000000000000100000000000000000000000000000000001000000000000000000000000000000000100000000000000000000000000000000001000000000000000000000000000000000010000000000000000000000000000000000100000000000000000000000000000000";
        Subscript subscript = new Subscript();
        List<List<Integer>> KeyOnTime = new ArrayList<>();
        List<Integer> KeyOnList = new ArrayList<>();
        KeyOn keyOn = new KeyOn();
        int[][] arrays = keyOn.KeyOn(subscript.Sub(s));

        for (int i = 0; i < arrays.length; i++) {
            KeyOnList = Ints.asList(arrays[i]);
            System.out.println(KeyOnList);
            List arrList = new ArrayList(KeyOnList);
            Remove remove = new Remove();
            remove.RemoveList(arrList);
            if (arrList.size() > 0)
                KeyOnTime.add(arrList);
        }


        for (int i=0;i<KeyOnTime.size();i++)
            System.out.println(KeyOnTime.get(i));
//        System.out.println(KeyOnTime.size());
    }
}