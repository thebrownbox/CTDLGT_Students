public class _70_Climbing_Stair {
    public static int climbStairs(int n) {
        
        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        
        if (n > 0 && n <=2) {
            return n;
        }
        
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 2] + ways[i - 1];
        }

        return ways[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}