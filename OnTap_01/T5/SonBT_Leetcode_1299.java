package com.company;

import java.util.Arrays;

public class SonBT_Leetcode_1299 {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[n - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
