package Recursion;
import java.util.*;
public class sum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the start and end index: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The total from " + a + " to " + b + " = " + sum(arr,a,b));
    }

    public static int sum(int[] a, int startIndex, int endIndex){
        if(startIndex==endIndex)
            return a[endIndex];
        return sum(a,startIndex+1,endIndex)+a[startIndex];
    }
}
