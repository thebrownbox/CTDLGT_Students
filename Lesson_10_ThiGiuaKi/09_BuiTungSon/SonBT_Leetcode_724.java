package com.company;

public class SonBT_Leetcode_724 {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            total = total + nums[i];
        }

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            if (sum - nums[i] == total - sum) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        pivotIndex(nums);
    }
}
