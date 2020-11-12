import java.util.Arrays;
import java.util.Scanner;

public class Quang_704 {
    public static int search(int[] nums,int target){
        return binarySearch(nums,0,nums.length-1,target);
    }
    static int binarySearch(int[] nums, int low, int high, int target){
        if(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                return binarySearch(nums,mid+1,high,target);
            else
                return binarySearch(nums,low,mid-1,target);
        }
        return -1;
    }
    public static void main(String[] args) {
            int[] numbers = {12,0,3,9,5,-1};
            Arrays.sort(numbers);
            for(int i:numbers)
                System.out.print(i + " ");
            System.out.print("Enter the number to find: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if(search(numbers,n)>0){
                System.out.println("Found " + n + " at the index: " + search(numbers,n));
            }else
                System.out.println("Not found " + n + " in the array");
    }
}
