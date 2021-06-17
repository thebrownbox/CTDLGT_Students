public class _50_Pow {
    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        if (n == -1){
            return 1/x;
        }
        double pow = myPow(x,n/2);
        double z = myPow(x,n%2);
        return pow * pow * z;
    }

    public static void main(String[] args) {
        double x = 2;
        System.out.println(myPow(x, -13));
    }
}
