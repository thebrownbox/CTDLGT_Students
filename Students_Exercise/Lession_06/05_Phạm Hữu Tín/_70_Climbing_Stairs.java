import java.util.HashMap;

public class _70_Climbing_Stairs {
    HashMap<Integer,Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0) return 1;
        if(n < 0) return -1;

        if (memo.containsKey(n)) 
            return memo.get(n);

        int withOne = climbStairs(n-1);
        int withTwo = climbStairs(n-2);
		
        memo.put(n, Math.max(0, withOne) + Math.max(0, withTwo) );
        return memo.get(n);
    }
    public static void main(String[] args) {
        
    }
}
