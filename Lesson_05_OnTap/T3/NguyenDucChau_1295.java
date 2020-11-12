package com.company;

public class NguyenDucChau_1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        // Cũng là một cách tốt, nhưng code sẽ càng dài ra nếu như đề bài thay đổi thành kiểu số long.
        for (int i = 0; i < nums.length; i++) {
            if (0 <= nums[i] && nums[i] < 10) {

            } else if (10 <= nums[i] && nums[i] < 100) {
                count++;
            } else if (100 <= nums[i] && nums[i] < 1000) {

            } else if (1000 <= nums[i] && nums[i] < 10000) {

                count++;
            } else if (10000 <= nums[i] && nums[i] < 100000) {

            }else if(nums[i] == 100000){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] n = {555,901,482,1771};
        System.out.println(findNumbers(n));
    }
}
