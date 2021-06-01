public class _283_Move_Zeroes {

  public static void moveZeroes(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1;) {
      if (nums[i] == 0) {
        for (int j = i + 1; j < nums.length; j++) {
          nums[j - 1] = nums[j];
        }
        nums[nums.length - 1] = 0;
      } else {
        i++;
      }
      count++;
      if (count == nums.length - 1)
        break;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1 };

    moveZeroes(nums);
    
    System.out.println("DONE");
  }
}
