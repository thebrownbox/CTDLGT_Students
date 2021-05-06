import java.util.HashMap;
import java.util.Map;

class _287FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int valueCount = 0;
        for (int i : nums) {
            if (myMap.containsKey(i) == false) {
                myMap.put(i, 1);
            } else {
                valueCount = myMap.get(i) + 1;
                myMap.put(i, valueCount);
            }
        }
        
        for (int i : nums) {
            if (myMap.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = { 3,1,3,4,2 };
        System.out.println(findDuplicate(nums));

    }
}