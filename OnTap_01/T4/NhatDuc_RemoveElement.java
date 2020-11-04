package OntapCTDLGT;

import java.util.Arrays;

public class NhatDuc_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        count--;
                        break;
                    }
                }
            }
        }
        nums = Arrays.copyOf(nums, nums.length - count);

        return nums.length;
    }

    public static void main(String agrs[]) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
    }
}
