public class Sample2 {

    public static int fib(int n) {
        int[] F = new int[n+1];
        
        if(n == 0) return 0;
        if(n >= 1 && n <= 2) return 1;

        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= n; i++) {
            F[i] = F[i-1] + F[i-2];
        }

        return F[n];
    }

    public static void main(String[] args) {
        fib(0);
    }
}
