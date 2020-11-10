class Solution {
    public int search(int[] nums, int target) {
        int first = 0, last = nums.length-1;
        while(true){
            if (first == last){
                if (nums[first] == target){
                    return first;
                }
                else{
                    return -1;
                }
            }
            else{
                int middle = (first + last)/2;
                if (nums[middle] == target){
                    return middle;
                }
                else if (nums[middle] > target){
                    last = middle;
                }
                else{
                    first = middle + 1;
                }
            }
        }
    }
}