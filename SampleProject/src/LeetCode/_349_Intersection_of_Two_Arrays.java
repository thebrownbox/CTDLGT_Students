package LeetCode;

// https://leetcode.com/problems/intersection-of-two-arrays/
// Tags: Set

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> mySet1 = new HashSet<>();
        Set<Integer> mySet2 = new HashSet<>();
        for (int i : nums1) {
            mySet1.add(i);
        }
        for (int i : nums2) {
            if(mySet1.contains(i) && !mySet2.contains(i)){
                list.add(i);
                mySet2.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
