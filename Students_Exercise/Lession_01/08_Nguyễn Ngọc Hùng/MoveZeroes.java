import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
    }

    public static void main(String[] args) {
        int[] nums = {0};
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[temp++] = nums[i];
            }
        }
        for (int j = temp++; j < nums.length; j++) {
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
