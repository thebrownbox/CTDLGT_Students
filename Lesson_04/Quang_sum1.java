package Recursion;

public class sum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The total is " + sum(arr,arr.length-1));
    }

    public static int sum(int[] a, int size){
        if(size==0)
            return a[size];
        return a[size]+sum(a,size-1);
    }
}
