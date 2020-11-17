import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * _217ContainsDuplicate
 */
public class _217ContainsDuplicate {
    public static boolean containsDuplicate(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i]) == false){
                map.put(a[i], 1);
            }else{
                int newValue = map.get(a[i]) + 1;
                map.put(a[i], newValue);
            }
        }

        for (Map.Entry e : map.entrySet()) {
            System.out.println("key = " + e.getKey() + " value " + e.getValue());
        }



        return false;
    }

    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(1);
        for(Integer s : mySet){
            System.out.println(s);
        }
    }
}