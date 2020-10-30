package LeetCode;

// https://leetcode.com/problems/isomorphic-strings/
// Tags: Map

import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings_NOK {
    static public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Integer> myMap1 = new HashMap<>(); // Char, index of previous char
        Map<Character, Integer> myMap2 = new HashMap<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(myMap1.containsKey(s.charAt(i)) != myMap2.containsKey(t.charAt(i)))
                return false;

            if(myMap1.get(s.charAt(i)) != myMap2.get(t.charAt(i)))
                return false;

            myMap1.put(s.charAt(i), i);
            myMap2.put(t.charAt(i), i);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("1133", "2233"));
    }
}
