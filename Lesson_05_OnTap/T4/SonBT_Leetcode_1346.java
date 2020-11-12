package com.company;

public class SonBT_Leetcode_1346 {
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 7, 11};
        checkIfExist(a);
    }
}
