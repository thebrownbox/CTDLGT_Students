import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if(map.containsKey(si)){
                if(map.get(si) != ti) return false;
            }else{
                if(map.containsValue(ti)) return false;
                map.put(si, ti);
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
