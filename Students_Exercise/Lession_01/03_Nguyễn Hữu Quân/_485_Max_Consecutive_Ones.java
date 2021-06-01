
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                if(count>max){
                    max = count;
                }
                count=0;
            }
            if(i==nums.length-1 && count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
