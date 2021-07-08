import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {     
        Map<Character, Character> map = new HashMap<>();
        char[] arr = s.toCharArray();
        char[] temp = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(arr[i]) == false) {
                if (map.containsKey(temp[i])) {
                    return false;
                } else {
                    map.put(arr[i], temp[i]);
                }
            } else {
                if (map.get(arr[i]) != temp[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
