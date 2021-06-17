public class _50_Pow {
    
    public static double myPow (double x, int n){
        if(n < 0){
           return myPow2(1/x, -n);
        }else{
           return myPow2(x, n);
        }
    }

    public static double myPow2 (double x, int n){
        if(n == 0){
            return 1;
        }else{
            double temp = myPow2(x, n/2);
            if(n % 2 == 0){
                return temp*temp;
            }else{
                return temp*temp*x;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
