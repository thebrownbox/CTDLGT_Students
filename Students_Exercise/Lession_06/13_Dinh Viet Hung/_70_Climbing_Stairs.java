public class _70_Climbing_Stairs {
    public static int climbStairs(int n) {
        if (n==1 || n==2){
            return n;
        }

            int a = 1;
            int b = 2;
            
            for (int i = 3; i < n; i++) {
                int t = b;
                b = b + a;
                a = t;
            }

    return a + b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
