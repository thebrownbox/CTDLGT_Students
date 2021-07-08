import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] aS = s.toCharArray();
        char[] aT = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(aS[i])){
                if(aT[i] != map.get(aS[i])){
                    return false;
                }
            }
            if(map.containsValue(aT[i])){
                if(!map.containsKey(aS[i])){
                    return false;
                }
            }
            map.put(aS[i], aT[i]);
        }
        return true;
    }
}