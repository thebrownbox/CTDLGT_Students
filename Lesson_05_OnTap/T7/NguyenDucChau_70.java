package com.company;

public class NguyenDucChau_70 {
    public static int[] arr = new int[100];

    public static int climbStairs(int n) {
        //Dieu kien dung
        if (n <= 2) {
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
