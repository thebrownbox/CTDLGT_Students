class Solution {

  public int removeElement(int[] nums, int val) {
    // Very Good
    int curIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[curIndex] = nums[i];
        curIndex++;
      }
    }
    return curIndex;
  }
}
