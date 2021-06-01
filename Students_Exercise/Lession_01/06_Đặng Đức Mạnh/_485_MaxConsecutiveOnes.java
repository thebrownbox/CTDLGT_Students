public class _485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxValue = 0;int count = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                if (maxValue < count) {
                    maxValue = count ;
                }
                count = 0;
            }
        }
        if (maxValue < count) {
            return count;
        }
        return maxValue;
    }
}
