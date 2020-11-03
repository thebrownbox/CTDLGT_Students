class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        // Ngắn gọn tối ưu, tốt, nhưng cần chỉnh sửa lại format một chút cho chuẩn chỉ
        for (int i = 0; i < nums.length; i++){
            int number = nums[i];
            int letter = 0;
            while(number != 0){
                number = number/10;
                letter++;
            }
            if (letter % 2 == 0){
                count++;
            }
        }
        return count;
    }
}