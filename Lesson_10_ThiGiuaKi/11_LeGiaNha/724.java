class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        
        int[] totalArr = new int[nums.length];
        
        totalArr[0] = nums[0];
        for (int i=1; i<nums.length; i++){
            totalArr[i] = totalArr[i-1] + nums[i];
        }
        int total = totalArr[nums.length-1];
        
        
        if (total - totalArr[0] == 0){
            return 0;
        }
        for (int i=1; i<nums.length; i++){
            if (totalArr[i-1]*2 == total - nums[i]){
                return i;
            }
        }
        return -1;
    }
}