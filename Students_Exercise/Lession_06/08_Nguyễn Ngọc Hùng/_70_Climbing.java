
public class _70_Climbing {
    public static int climbStairs(int n) { 
        
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);

    }
    
    public static int clim(int n) {
        int f1 = 1;
        int f2 = 2;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int f3 = 0;
        for(int i=3;i<=n;i++){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(clim(45));
    }
}
