public class _50_Pow {
    public static double myPow(double x, int n) {
        if (n < 0)
            return 1 / pow(x, n);

        if (n == 0)
            return 1;

        else
            return pow(x, n);
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        double y = pow(x, n / 2);
        if (n % 2 == 0)
            return y * y;
        else
            return y * y * x;
    }

    public static void main(String[] args) {
        System.out.print("Gia tri can tim la: ");
        System.out.println(myPow(2, -3));
    }
}
