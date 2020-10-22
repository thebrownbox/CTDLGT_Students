package day1;

import java.util.Arrays;

public class Duy_LeetCode_26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int curIndex = 0;

        if (n == 0) {
            return 0;
        }

        for(int i = 0; i < n; i++) {
            if (nums[i] != nums[curIndex]) {
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }
        return curIndex + 1;
    }
}

