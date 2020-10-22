package com.company;

import java.util.Arrays;

public class Son_LeetCode_26 {

    public static void main(String[] args) {
	// write your code here
        int[] b ={0,0,1,1,1,2,2,3,3,4};
        int arr = removeDuplicates(b);

    }

    static int removeDuplicates(int[] nums) {
        int a = nums.length-1;
        int i = 0;
        for(int j = 0; j<=a;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            };
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i+1);
        return i+1;

    }

}
