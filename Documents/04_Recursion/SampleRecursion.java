public class SampleRecursion {
    public static void printF()
    {
        System.out.println("F");
        printF();
    }

    public static int GT(int n)
    {
        if(n == 0)
            return 1;
        int t = n * GT(n-1);
        return t;
    }

    public static int TinhMu(int a, int n)
    {
        //B1. Bai taon co so | Dieu kien dung
        if(n == 0)
            return 1;
        int t = a * TinhMu(a, n-1);
        return t;
    }

    public static void main(String[] args) {
        int k = TinhMu(2, 3);
        System.out.println(k);
    }

    // A^n = 
}
