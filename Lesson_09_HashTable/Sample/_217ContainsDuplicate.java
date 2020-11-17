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


    static public int[] twoSum(int[] a, int target) {
        int[] result = new int[2];
        // B1 xay dung map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);    
        }

        // B2: Xac dinh k = target - a[i] trong map
        for (int i = 0; i < a.length; i++) {
            int k = target - a[i];
            if(map.containsKey(k) == true){
                int kIndex = map.get(k);
                if(kIndex != i)
                {
                    result[0] = i;
                    result[1] = kIndex;
                    break;   
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {3, 2, 4};
        twoSum(a, 6);
    }
}