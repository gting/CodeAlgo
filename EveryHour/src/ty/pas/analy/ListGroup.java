package ty.pas.analy;

import java.util.ArrayList;
import java.util.List;

public class ListGroup {
    /*第一种方法 思路比较简单,遍历list,将元素添加到subList,
     *每当i到pageSize的时候,将subList添加到listArray并新建,subList
     */
    public static <T> List<List<T>> splitList1(List<T> list, int pageSize) {

        List<List<T>> listArray = new ArrayList<List<T>>();

        List<T> subList = null;

        for (int i = 0; i < list.size(); i++) {

            if (i % pageSize == 0) {

                subList = new ArrayList<T>();

                listArray.add(subList);

            }

            subList.add(list.get(i));

        }

        return listArray;

    }
}
