import java.util.HashMap;
import java.util.Map;

public class _205 {
    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
           if(myMap.containsKey(s.charAt(i)))
           {
                if (myMap.get(s.charAt(i)) != t.charAt(i) )
                {
                         return false;
                }
           }
           else
           {
               if(myMap.containsValue(t.charAt(i)))
               {
                   return false;
               }
               myMap.put(s.charAt(i),t.charAt(i));
           }
        }
        return  true;
    }
}
