package com.company;

import java.util.*;

public class SonBT_Leetcode_442 {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            if (!map.containsKey(val)) {
                map.put(val, 1);
            } else {
                map.put(val, 2);
                arr.add(val);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
	    int[] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
