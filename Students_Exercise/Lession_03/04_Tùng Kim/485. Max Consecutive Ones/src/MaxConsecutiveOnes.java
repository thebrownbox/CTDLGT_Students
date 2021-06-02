public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,1,1,1,1,0,2,1,1};
        System.out.println("MaxConsecutiveOnes : " +new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
    }
}
