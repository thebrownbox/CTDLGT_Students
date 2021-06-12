public class fibonaci {
    public static int fibo( int n){
        if( n <= 2 )
        return 1;
        int Fn = fibo (n - 1) + fibo(n - 2);
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(fibo(5));
        System.out.println(fibo(8));
    }
}
