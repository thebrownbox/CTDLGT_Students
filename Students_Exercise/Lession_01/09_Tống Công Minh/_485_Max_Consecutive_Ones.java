public class _485_Max_Consecutive_Ones {

  public static int findMaxConsecutiveOnes(int[] nums) {

    int maxConsecutive = 0;
    int tempMaxConsecutive = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        tempMaxConsecutive++;
        if (i == nums.length - 1) {
          if (tempMaxConsecutive > maxConsecutive) {
            maxConsecutive = tempMaxConsecutive;
          }
          tempMaxConsecutive = 0;
        }
      } else {
        if (tempMaxConsecutive > maxConsecutive) {
          maxConsecutive = tempMaxConsecutive;
        }
        tempMaxConsecutive = 0;
      }
    }

    return maxConsecutive;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 1, 0, 1, 1, 1 };

    int n = findMaxConsecutiveOnes(nums);
    System.out.println(n);

  }
}
