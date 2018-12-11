package com.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public int[] Sub(List<Integer> SubList ){

        int[] array = new int[SubList.size()];
        for(int i = 0;i<SubList.size();i++){
            array[i] = SubList.get(i);
        }
        return array;
    }
}
