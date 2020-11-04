package com.company;

public class NguyenDucChau_1346 {
    public static boolean checkIfExist(int[] arr) {
        boolean isCheck = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    isCheck = true;
                }
            }
        }
        return isCheck;
//
    }

    public static void main(String[] args) {
//        int[] n = {10, 2, 5, 3};
//        int[] n = {7, 1, 14, 11};
//        int[] n = {3, 1, 7, 11};
        int[] n = {-20, 8, -6, -14, 0, -19, 14, 4};
        System.out.println(checkIfExist(n));
    }
}
