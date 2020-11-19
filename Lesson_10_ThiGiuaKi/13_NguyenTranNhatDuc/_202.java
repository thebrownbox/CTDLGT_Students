package com.techmaster;

public class _202 {
    public static boolean isHappy(int n) {
        String str=String.valueOf(n);
        int num=0;
        int count=0;
        while (num!=1&&count<1000) {
            for (int i = 0; i < str.length(); i++) {
                num += Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), 2);
            }
            if (num == 1) {
                return true;
            }
            str=String.valueOf(num);
            num=0;
            count++;
        }
        return false;
    }
}
