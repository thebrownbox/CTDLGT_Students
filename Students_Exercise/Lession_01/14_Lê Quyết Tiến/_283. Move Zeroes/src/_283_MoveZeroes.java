import java.util.Arrays;

public class _283_MoveZeroes {
    public static void main(String[] args) throws Exception {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for ( ; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}
