package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        Bài 1
//        System.out.println(find(1, a, 0));

//        Bài 2
//        System.out.println(sum1(a, a.length-1));

//        Bài 3: Giả định rằng input của startIndex và endIndex luôn thỏa mãn
//        0 <= startIndex <= endIndex <= a.length-1
//        System.out.println(sum2(a, 1, 5));
    }


    public static int find(int x, int[] a, int i){
        if (i == a.length){
            return -1;
        }
        if (a[i] == x){
            return i;
        }
        return find(x, a, i+1);
    }

    public static int sum1(int[] a, int i){
        if (i == -1){
            return 0;
        }
        if (i == 0){
            return a[0];
        }
        return a[i] + sum1(a, i-1);
    }

    public static int sum2(int[] a, int startIndex, int endIndex){
        if (startIndex == endIndex){
            return a[endIndex];
        }
        return a[startIndex] + sum2(a, startIndex+1, endIndex);
    }
}
