package com.company;

import java.util.Arrays;

public class SonBT_Leetcode_1089 {
    public static void duplicateZeros(int[] arr) {
        // Good!
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i]==0)
            {
                int j = arr.length - 1;
                while(j>i)
                {
                    arr[j] = arr[j-1];
                    j--;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
	int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));

    }
}
