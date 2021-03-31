public class _11_283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1 };
        moveZeroes(nums);
        for (int n : nums) {
            System.out.println(n + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
