package binary_search;

import java.util.Arrays;

public class _1480_Running_Sum_of_1d_Array {

    public static int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = nums[0];

        int i = 1;

        while (i < nums.length) {
            result[i] = result[i - 1] + nums[i];
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 10, 1 };
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
