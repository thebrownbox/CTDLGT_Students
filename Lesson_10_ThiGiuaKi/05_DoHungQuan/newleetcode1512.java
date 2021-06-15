package BT.KT;

public class newleetcode1512 {
    public static int numIdenticalPairs(int[] nums) {
        //Given an array of integers nums.
        //
        //A pair (i,j) is called good if nums[i] == nums[j] and i < j.
        //
        //Return the number of good pairs.

        int n = nums.length;
        int i = 0;
        int j ;
        int count  = 0;
        if (n < 2) return 0;
        else {
            for (i = 0;i<n-1;i++){
                for (j = i+1;j<n;j++){
                    if (nums[i] == nums[j] && i < j){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
}
