package com.example.main;

public class SimpleRecursion {

    public static int find(int x, int[] a, int i)
    {
        // #1 your implementation
        if (i >= a.length - 1) return -1;
        if (x == a[i]) return i;
        int result = find(x, a, ++i);
        return result;
    }

    public static int sum1(int[] a, int i)
    {
        // #1 your implementation
        if (i == a.length - 1) {
            return a[a.length - 1];
        }
        return a[i] + sum1(a, ++i);
    }

    public static int sum2(int[] a, int startIndex, int endIndex)
    {
        // #1 Your implementation
        if (startIndex >= endIndex) return a[endIndex];
        return a[startIndex] + sum2(a, ++startIndex, endIndex);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // #2 Call function find
        System.out.println(find(3, a, 0));
        // #2 call function sum1
        System.out.println(sum1(a, 0));
        // #2 call sum2
        System.out.println(sum2(a, 4, 6));
    }
}
