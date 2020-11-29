import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;

        Map<Character, Character> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

            if(myMap.containsKey(c1) == true){
                Character expectedChar = myMap.get(c1);
                if(expectedChar == c2){
                    //ok => normal
                }else{
                    return false;
                }
            }else{

                if(myMap.containsValue(c2) == true){
                    return false;
                }else{
                    myMap.put(c1, c2);
                }
                
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        
    }
}
