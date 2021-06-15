package com.company;

import java.util.HashSet;
import java.util.Set;

public class SonBT_Leetcode_202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<Integer>();

        while (n > 0) {
            if (n == 1) {
                return true;
            }
            if (nums.contains(n)) {
                return false;
            }
            nums.add(n);
            n = square(n);
            System.out.println(n);
        }
        return false;
    }

    public static int square(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }
}
