package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class InterTimeLong {
    public InterTimeLong(){

    }

    public void InterTimeLong(String s)
    {
        List list = new ArrayList();
        for (int i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
            if (a=='1')
            {
                list.add(i);
            }
        }
//        System.out.println(list);
    }

}
