package com.techmaster;

public class SimpleRecursion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i=0;
        System.out.println(find(1,a,i));
        System.out.println(sum1(a,i));
        System.out.println(sum2(a,2,4));
    }

    public static int find(int x, int[] a, int i)
    {
        if(i<a.length&&i>=0) {
            if (a[i] == x) {
                return i;
            } else {
                return find(x, a, i + 1);
            }
        }
        return -1;
    }

    public static int sum1(int[] a, int i)
    {
        int sum=0;
        if(i<a.length&&i>=0) {
            sum = a[i] + sum1(a, i + 1);
        }
        return sum;
    }

    public static int sum2(int[] a, int startIndex, int endIndex)
    {
        int sum=0;
        if(startIndex<=endIndex&&startIndex>=0&&endIndex<a.length) {
            sum = a[startIndex] + sum2(a, startIndex+1,endIndex);
        }
        return sum;
    }
}
