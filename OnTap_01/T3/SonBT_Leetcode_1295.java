package com.company;

import java.util.Arrays;

public class SonBT_Leetcode_1295 {

    public static int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int a = nums.length;
        int j = 0;
        for(int i = 0; i < a; i++)
        {
            int count = 1;
            while(nums[i]>=10)
            {
                nums[i]/=10;
                count++;
            }
            if(count%2==0)
            {
                j++;
            }
        }
        System.out.println(j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);
    }
}
