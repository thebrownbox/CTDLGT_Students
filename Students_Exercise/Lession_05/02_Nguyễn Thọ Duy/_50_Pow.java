public class _50_Pow {
    public static  double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }else if(n == 1){
            return x;
        }else if(n < 0){
            return myPow(1/x, -n);
        }else{
            return  x * myPow(x, n-1);
        }
    }

    public static void main(String[] args) {
        double x =2.00000;
        int n = -3;
        System.out.println("ket qua cua " + x + " mu " + n + " la:");
        System.out.println(myPow(x, n));
    }
}
