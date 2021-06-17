public class Fibo{
    // F1 = 1
    // F2 = 1
    // F3 = 2
    // F4 = 3 
    // F5 = 5
    // F6 = 8
    // F7 = 13
    // Linh, Hung (*): 4,3,2,1,2
    // Tin, Duy, Quan, Lam, Khanh : 4,3,2,1,2,1
    // Minh: 4,3,2,1
    // 
    public static int Fibo(int n){
        System.out.println("n = " + n);
        if(n <= 2)
            return 1;
        int t = Fibo(n-1) + Fibo(n-2);
        return t;
    }





    static int[] kq = new int[31];

    public static  int fib(int n) {
        if(n <= 0) return 0;
        if(n <= 2) return 1;
        
        // Fn, kiem tra xem kq[n] ton tai hay chua ?
        // kq[n] = 0 => nghĩa là: Fn chưa được tính 
        // kq[n] != 0 => Fn đã được tính 
        int t = 0;
        if(kq[n] == 0){
            t = fib(n-1) + fib(n-2);
            kq[n] = t;
        }else{
            t = kq[n];
        }
        return t;
    }

    public static void main(String[] args) {
        // System.out.println(Fibo(1));
        // System.out.println(Fibo(2));
        // System.out.println(Fibo(3));
        // System.out.println(Fibo(4));
        // System.out.println(Fibo(5));
        // System.out.println(Fibo(6));
        System.out.println(fib(7));
        System.out.println("DONE");

        


    }
}