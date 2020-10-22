package com.company;

import java.util.Arrays;

public class Son_LeetCode_283 {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {0,0,1,2,0,0,3,0,4};
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int k = j; k < n; k++){
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
