public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) throws Exception {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
