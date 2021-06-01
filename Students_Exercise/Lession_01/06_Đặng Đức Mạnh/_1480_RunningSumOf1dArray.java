public class _1480_RunningSumOf1dArray {
    // Given an array nums. We define a running sum of an array as runningSum[i] =
    // sum(nums[0]…nums[i]).
    // Input: nums = [1,2,3,4]
    // Output: [1,3,6,10]
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        _1480_RunningSumOf1dArray r =  new _1480_RunningSumOf1dArray();
        int [] nums = {1,2,3,4};
        r.runningSum(nums);
        for (int i : nums) {
            System.out.print(i +" ");
        }
    }
}
