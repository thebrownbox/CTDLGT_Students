package com.company;

public class SonBT_Leetcode_1598 {
    public static int minOperations(String[] logs) {
        int n = logs.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (logs[i].equals("../")) {
                if (count > 0) {
                    count--;
                } else {
                    continue;
                }
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {
        String[] logs = {"./", "../", "./"};
        minOperations(logs);
    }
}
