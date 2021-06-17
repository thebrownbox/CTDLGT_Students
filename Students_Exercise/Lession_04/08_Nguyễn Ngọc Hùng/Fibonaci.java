public class Fibonaci {
    public static int tinhFibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f = tinhFibo(n - 1) + tinhFibo(n - 2);
        return f;
    }
    public static void main(String[] args) {
        System.out.println(tinhFibo(14));
        for (int i = 0; i < 40; i++) {
            int n = tinhFibo(i);
            System.out.print(n+"  ");
        }
    }
}
