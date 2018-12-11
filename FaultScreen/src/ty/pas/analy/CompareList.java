package ty.pas.analy;

import java.util.List;

public class CompareList {
    public CompareList(){

    }

    public String compareList(String s1,String s2)
    {
        int n=0;
        for (int i=0;i<s1.length();i++)
        {
            char item1 =  s1.charAt(i);
            char item2 = s2.charAt(i);
            if (item1!=item2)
            {
                n=i;
                break;
            }
        }

        String s=s2.substring(n,s2.length());
//        System.out.println(s);
        return s;
    }

}
