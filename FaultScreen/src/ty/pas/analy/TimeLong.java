package ty.pas.analy;

import java.util.HashMap;
import java.util.Map;

public class TimeLong {
    public TimeLong() {

    }

    public int TimeLong(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int j = i + 1;
            while (j < s.length()) {
                char b = s.charAt(j);
                if (a != b) {
                    break;
                }
                j++;
            }
            Integer n = map.get(String.valueOf(a));
            if (n != null) {
                if (n < j - i) {
                    map.put(String.valueOf(a), j - i);
                }
            } else {
                map.put(String.valueOf(a), j - i);
            }
            i = j - 1;
        }
        String s1 = "";
        int n1 = 0;
        for (Object o : map.keySet()) {
            if (map.get(o) > n1 && o.equals("1")) {
                n1 = map.get(o);
                s1 = (String) o;
            }
        }
        return n1;
    }
}
