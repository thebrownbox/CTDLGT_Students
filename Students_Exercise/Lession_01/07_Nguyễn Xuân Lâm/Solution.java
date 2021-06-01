public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current_max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] ==1){
                current_max +=1;
                max = Math.max(max, current_max);
            }
            else{
                current_max = 0;
            }
        }
        return max;
    }
    // public static void main(String[] args) {
    //     int nums[] = {1, 1, 0, 1, 1, 1};
    //     System.out.println(findMaxConsecutiveOnes(nums));
    // }
}
