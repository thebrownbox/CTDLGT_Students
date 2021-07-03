import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    static class Solution {
        public static boolean isIsomorphic(String s, String t) {
            Map<Character, Character> myMap = new HashMap<>();
            int l = s.length();
            char[] ch1 = s.toCharArray();
            char[] ch2 = t.toCharArray();
            for (int i = 0; i < l; i++) {
                if (!myMap.containsKey(ch1[i])) {
                    if (myMap.containsValue(ch2[i]))
                        return false;
                    myMap.put(ch1[i], ch2[i]);
                } else if (myMap.get(ch1[i]) != ch2[i])
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        // System.out.println(isIsomorphic(s,t));
    }
}
