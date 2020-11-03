package com.company;

import java.util.Arrays;

public class NguyenDucChau_1089 {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < arr.length) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] n = {1, 0, 2, 3, 0, 4, 5, 0};
//        int[] n = {1, 2, 3};
        int[] n = {0, 0, 0, 0, 0, 0, 0};
        duplicateZeros(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
