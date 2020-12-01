package com.company;

import java.util.Stack;

public class SonBT_Leetcode_844 {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == '#') {
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(sArr[i]);
            }
        }
        String s = String.valueOf(stack);

        stack.clear();


        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == '#') {
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(tArr[i]);
            }
        }
        String t = String.valueOf(stack);

        return s.equals(t);
    }

    public static void main(String[] args) {
        String S = "ab##", T = "c#d#";
        backspaceCompare(S, T);

    }
}
