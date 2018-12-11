package com.pas.analy;

public class AlarmNum {
    public static int[][] AlarmNum(int[] array)
    {
        int[][]arrays=new int[array.length][array.length];
        //二维数组的i和j
        int i=0;
        int j=0;
        //记录当前最大值为数组的第一个，减一是为了保证后面数组的第一个大于最大值，添加进入二维数组
        int max=array[0]-1;
        for(int k=0;k<array.length;k++)
        {
            //当不是连续数字的时候，放到下一个数组里面，并且把j设置为0，最大值为当前值-1
            if(array[k]!=max+1)
            {
                i++;
                j=0;
                max=array[k]-1;
            }
            arrays[i][j]=array[k];
            max=array[k];
            j++;
        }
        return arrays;
    }
}
