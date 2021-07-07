package lab9_hash;

import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<Character, Character>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue().equals(cT)) {
                    if (!entry.getKey().equals(cS)) {
                        return false;
                    }
                }
            }
            if (!map.containsKey(cS)) {
                map.put(cS, cT);
            } else {
                if (map.get(cS) != cT) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
