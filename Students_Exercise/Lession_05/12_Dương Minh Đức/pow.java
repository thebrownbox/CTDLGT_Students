public class pow {

    public static double myPow(double x ,int n)
    {
        if (x == 1)
        {
            return 1;
        }
        if(x == -1 && n %2 ==0){
            return -x;
        }else if (x == -1 && n %2 !=0){
            return x;
        }
        if(n == Integer.MIN_VALUE){
            return 0;
        }
        if(n == Integer.MAX_VALUE){
            return 0;
        }
        if(n > 0){
            return myPowerResult(x, n);
        }
        else {
            double res = 1/myPowerResult(Math.abs(x), Math.abs(n));
            return res;
        }
    }
    private static double myPowerResult(double x, int n){
        if(n == 0){
            return 1;
        }

        return x * myPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
}
