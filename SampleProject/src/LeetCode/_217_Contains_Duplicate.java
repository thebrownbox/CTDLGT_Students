package LeetCode;

// https://leetcode.com/problems/contains-duplicate/
// Tags: Set

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int i: nums) {
            mySet.add(i);
        }
        if(nums.length == mySet.size())
            return false;
        return true;
    }
}
