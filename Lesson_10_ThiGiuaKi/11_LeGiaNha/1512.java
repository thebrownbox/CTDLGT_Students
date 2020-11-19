class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i=nums.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}