package Recursion;

import java.util.Scanner;

public class findRecursion {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number to find: ");
        int num = scanner.nextInt();
        System.out.println(find(num,arr,arr.length-1));
    }

    public static int find(int x, int[] a, int size){
        if(a[size] == x)
            return x;
        else if(size==-1)
            return -1;
        else
            return find(x,a,size-1);
    }
}
