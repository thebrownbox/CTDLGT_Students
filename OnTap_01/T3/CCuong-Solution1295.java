package com.company;

public class Solution1295 {

    // CongHV: Đổi tên hàm cho phù hợp
    static public int logarit(int n){
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    // CongHV: Biết cách tổ chức chương trình mạch lạc => RẤT TỐT!
    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (logarit(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int kq = findNumbers(nums);
        System.out.println(kq);
    }
}
