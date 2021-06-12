package Recursion;

public class _50_Pow {

    public static double myPow(double x, int n) {

        if (n == 0) {
            return (double)1;
        }

        if ( n==1 ) {
            return x;
        }

        double result = 1;

        if (n > 0) {
            result = getResult(x, n, result);
        } else {
            if (n == Integer.MIN_VALUE) {
                n = -(n+1);
                result = getResult(x, n, result);
                result = (1 / result) * (1/x);
            } else {
                n = -n;
                result = getResult(x, n, result);
                result = 1 / result;
            }
        }
        return result;
    }

    private static double getResult(double x, int n, double result) {
        if (n % 2 == 0) {
            double t = getT(x, n);
            result*=t;
        } else {
            double t = getT(x, n) * x;
            result*=t;
        }
        return result;
    }

    private static double getT(double x, int n) {
        double halfPow = myPow(x, n / 2);
        return halfPow * halfPow;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.0, Integer.MIN_VALUE));
//        System.out.println(Integer.MAX_VALUE);
//        int n = Integer.MIN_VALUE;
//        System.out.println(-(n+1)==Integer.MAX_VALUE);
    }
}
