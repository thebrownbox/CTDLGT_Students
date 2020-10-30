package LeetCode;

//https://leetcode.com/problems/two-sum/
// Tags: Map

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum_UsingMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>(); // value , index
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++){
            int expectedValue = target - nums[i];
            if(myMap.containsKey(expectedValue)){
                result[0] = (int) myMap.get(expectedValue);
                result[1] = i;
                break;
            }else{
                myMap.put(nums[i], i);
            }
        }

        return result;
    }

}
