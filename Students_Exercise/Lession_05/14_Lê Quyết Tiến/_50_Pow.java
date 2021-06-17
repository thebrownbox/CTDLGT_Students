public class _50_Pow {
    public static double myPow(double x, int n) {
        double result = 0;
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n == Integer.MIN_VALUE) {
            n = -(n + 1);
            result = x * pow(x, n);
        } else {
            result = pow(x, n);
        }
        return result;
    }

    public static double pow(double x, int n) {
        double result = 0;
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            result = myPow(x, n / 2);
            return result * result;
        } else {
            result = myPow(x, (n - 1) / 2);
            return result * result * x;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(myPow(2, 10));

    }
}
