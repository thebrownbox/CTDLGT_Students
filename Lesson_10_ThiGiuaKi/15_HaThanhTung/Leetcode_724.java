package Leetcode_724;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6};
//        int[] nums = {1,2,3};
//        int[] nums = {-1,-1,0,0,-1,-1};
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            int sumL = 0;
            int sumR = 0;

            for (int j = 0; j < i; j++) {
                sumL += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                sumR += nums[j];
            }

            if (sumL == sumR && result == -1) {
                result = i;
            }
        }
        return result;
    }
}
