import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int n = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(c1[i]) == false) {
                if (map.containsValue(c2[i])) {
                    return false;
                } else {
                    map.put(c1[i], c2[i]);
                }
            } else {
                if (map.get(c1[i]) != c2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        String s = "egg";
        String t = "zoo";
        System.out.println(isIsomorphic(s, t));
    }
}
