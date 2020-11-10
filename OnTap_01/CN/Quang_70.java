import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quang_70 {
    public static int climbStairs(int n){
        int[] memo = new int[n+1];
        return climbStairs(0,n,memo);
    }

    public static int climbStairs(int i, int n, int[] memo){
        if(i>n)
            return 0;
        if(i==n)
            return 1;
        if(memo[i]>0)
            return memo[i];
        memo[i] = climbStairs(i+1,n,memo) + climbStairs(i+2,n,memo);
        return memo[i];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the steps of the stair: ");
        int n = input.nextInt();
        System.out.println("There are " + climbStairs(n) + " ways to climb up");
        System.out.println("There are " + climbStairsMap(n) + " ways to climb up");

    }

    public static int climbStairsMap(int n){
        Map<Integer,Integer> map = new HashMap<>();
        return climbStairs(0,n,map);
    }
    public static int climbStairs(int i, int n, Map<Integer,Integer> memo){
        memo = new HashMap<>();
        for(int index=n;index>=0;index--)
            memo.put(index,0);
        if(i>n)
            return 0;
        if(i==n)
            memo.replace(i,1);
        if(memo.get(i)>0)
            return memo.get(i);
        memo.replace(i,climbStairs(i+1,n,memo) + climbStairs(i+2,n,memo));
        return memo.get(i);
    }
}
