class Solution {
    public int removeElement(int[] nums, int val) {
        // Good!
        int index = 0, newLength = 0;
        while(index < nums.length){
            if (nums[index] != val){
                nums[newLength] = nums[index];
                newLength++;
            }
            index++;
        }
        return newLength;
    }
}