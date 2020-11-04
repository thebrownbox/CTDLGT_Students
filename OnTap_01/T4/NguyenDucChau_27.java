package com.company;

import java.io.OutputStream;

public class NguyenDucChau_27 {
    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }

    public static void main(String[] args) {
        int[] n = {0,1,2,2,3,0,4,2};
        int val = 3;
        System.out.println(removeElement(n,2));
    }
}

