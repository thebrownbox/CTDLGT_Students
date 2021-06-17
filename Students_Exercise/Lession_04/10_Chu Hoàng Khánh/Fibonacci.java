/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     System.out.print(fibonacci(i) + " ");
        // }
        // fibonacciwithloop(10);

        System.out.println(fibonacci(7));
    }

    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

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