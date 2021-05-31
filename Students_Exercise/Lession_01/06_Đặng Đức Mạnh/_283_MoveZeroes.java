//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class _283_MoveZeroes {
    public void moveZero(int[] nums) {
        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        _283_MoveZeroes a = new _283_MoveZeroes();
        int [] nums = {0,1,0,3,12};
        a.moveZero(nums);
        for (int i : nums) {
            System.out.print(i+",");
        }
    }

}