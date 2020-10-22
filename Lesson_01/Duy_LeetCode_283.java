package day1;

import java.util.Arrays;

public class Duy_LeetCode_283 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;

        for(int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (; k < n; k++) {
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,3,5,7,0,0,0,12,14,0,0,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}