package com.company;

public class SonBT_Leetcode_27 {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
	  int[] a = {0,1,2,2,3,0,4,2};
	  removeElement(a,2);
    }


}
