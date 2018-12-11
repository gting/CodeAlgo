package ty.pas.analy;

import java.util.List;

public class Remove {
    public List<Integer> RemoveList(List<Integer> list) {
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i) == 0) {

                list.remove(i);

                i--;

            }
        }

        return list;
    }
}
