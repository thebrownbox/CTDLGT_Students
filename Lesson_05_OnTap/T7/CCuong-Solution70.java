package com.company;

import java.util.Scanner;

public class Solution70 {
    static public int climbStairs(int n) {
        if (n <= 2)
            return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(climbStairs(x));
    }
}
