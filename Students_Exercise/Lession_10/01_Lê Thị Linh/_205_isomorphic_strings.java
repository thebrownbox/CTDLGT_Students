import java.util.HashMap;

/**
 * _205_isomorphic_strings
 */
public class _205_isomorphic_strings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map1.containsKey(cs)) {
                if (ct != map1.get(cs)) {
                    return false;
                }
            } else {
                if (map2.containsKey(ct)) {
                    return false;
                }

                map1.put(cs, ct);
                map2.put(ct, cs);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1, t1));

        System.out.println("-------------");

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));
    }
}