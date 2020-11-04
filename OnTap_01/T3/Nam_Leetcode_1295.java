class Solution {
    public int findNumbers(int[] nums) {
        int countDigit = 0;
        int count = 0;
        // Tốt: Cách làm cổ điển
        for (int i = 0; i < nums.length; i++) {
            while (true) {
                if (nums[i]  < 1) {
                    break;
                } else {
                    countDigit++;
                    nums[i] = nums[i] / 10;
                }
            }
            if(countDigit%2 == 0){
                count++;
            }
            countDigit = 0;
        }
        return count;
    }
}