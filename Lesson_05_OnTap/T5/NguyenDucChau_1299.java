package com.company;

public class NguyenDucChau_1299 {
    public static int[] replaceElements(int[] arr) {
        int max = -1;
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] n = {17, 18, 5, 4, 6, 1};
        replaceElements(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
