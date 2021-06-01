
/**Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

public class _283_MoveZeros {
    public static void moveZeroes(int[] nums) {
        int countNum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                if(i!=countNum){
                    nums[countNum] = nums[i];
                    nums[i]=0;
                }
                countNum++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
