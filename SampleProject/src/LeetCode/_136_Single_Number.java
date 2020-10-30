package LeetCode;

// https://leetcode.com/problems/single-number/
// Tags: Map

import java.util.HashMap;
import java.util.Map;

public class _136_Single_Number {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            if(count.containsKey(i) == false){
                count.put(i, 1);
            }else{
                count.put(i, 2);
            }
        }

        for(Map.Entry e : count.entrySet()){
            if(e.getValue().equals(1)){
                return (int)e.getKey();
            }
        }

        return 0;
    }
}
