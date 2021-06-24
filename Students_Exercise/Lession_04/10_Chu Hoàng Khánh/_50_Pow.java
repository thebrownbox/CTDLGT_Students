/**
 * _50_Pow
 */
public class _50_Pow {

    public static void main(String[] args) {

        System.out.println(pow(0.00001, 2147483647));
    }

    private static double pow(Double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n > 0) {
            return x * pow(x, n - 1);
        }
        if (n < 0) {
            return 1 / x * pow(1 / x, -n - 1);
        }
        return -1;
    }
}