import java.util.HashMap;
import java.util.Map;

public class Quang_205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),t.charAt(i));

            }
            else{
                if(map1.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }

        }

        for(int j=0;j<t.length();j++){
            if(!map2.containsKey(t.charAt(j))){
                map2.put(t.charAt(j),s.charAt(j));

            }
            else{
                if(map2.get(t.charAt(j))!=s.charAt(j))
                    return false;
            }

        }
        return true;
    }
}
