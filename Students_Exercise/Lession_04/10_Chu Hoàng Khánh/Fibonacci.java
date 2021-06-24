/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     System.out.print(fibonacci(i) + " ");
        // }
        // fibonacciwithloop(10);

        System.out.println(fibonacci2(5));
    }

    // private static int fibonacci(int n) {
    //     int[] kq = new int[n + 1];
    //     if (n <= 2) {
    //         return 1;
    //     }
    //     if (kq[n] == 0) {
    //         int t = fibonacci(n - 1) + fibonacci(n - 2);
    //         kq[n] = t;
    //     } else {
    //         return kq[n];
    //     }

    // }
    
    private static int fibonacci2(int n) {
        int[] kq = new int[n + 1];
    
        kq[0] = 0;
        kq[1] = 1;
        kq[2] = 1;

        if (n == 0 || n == 1) {
            return kq[n];
        }

        if (n <= 2) {
            return kq[n];
        }

        for (int i = 3; i < kq.length; i++) {
            kq[i] = kq[i - 1] + kq[i - 2];
        }

        return kq[n];
    }

    private static void fibonacciwithloop(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        for (int i = 2; i < n; i++) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;

            System.out.print(fn + " ");
        }

        

    }

}