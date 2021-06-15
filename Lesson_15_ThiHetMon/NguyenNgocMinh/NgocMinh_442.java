class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> checkNums = new ArrayList<>();

        for(int i = 0; i < checkNums.length; i++){
          int index = Math.abs(nums[i] - 1);
          if(nums[index] < 0){
            checkNums.add(index+1);
          }
          else{
            nums[index] = -nums[index];
          }
        }
        return checkNums; 
    }
}