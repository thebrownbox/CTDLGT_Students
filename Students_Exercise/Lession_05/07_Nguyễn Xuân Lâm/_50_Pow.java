public class _50_Pow {
    public static double myPow(double x, int n) {
        if(n<0) return 1.0/myPowTest(x, -n);
        return myPowTest(x, n);
    }

    public static double myPowTest(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n%2==0){
            return myPowTest(x*x,n/2);
        }
        return x*myPowTest(x*x, n/2);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x,n));
    }
}
