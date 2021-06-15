package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class letcode202 {
    static public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1){
            int cur = n;
            int sum = 0;
            while (cur != 0){
                sum += (cur % 10) + (cur % 10);
                cur /=10;
            }
            if (set.contains(sum)){
                return false;
            }
            if (set.add(sum)){
                n = sum;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
