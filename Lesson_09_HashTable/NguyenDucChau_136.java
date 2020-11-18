package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NguyenDucChau_136 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i]) == false) {
                myMap.put(nums[i], 1);
            } else {
                int newValue = myMap.get(nums[i]) + 1;
                myMap.put(nums[i], newValue);
            }
        }
        for (Map.Entry e : myMap.entrySet()) {
            System.out.println("key : " + e.getKey() + " value : " + e.getValue());
            count = (int) e.getValue();
            if (count == 1) {
                return (int) e.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(singleNumber(a));
    }
}
