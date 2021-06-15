package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SonBT_Leetcode_1672 {
    public static int maximumWealth(int[][] accounts) {
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            arr.add(sum);
        }
        System.out.println(Collections.max(arr));
        return Collections.max(arr);
    }

    public static void main(String[] args) {
	int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
	maximumWealth(accounts);
    }
}
