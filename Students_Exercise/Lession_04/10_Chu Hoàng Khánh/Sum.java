public class Sum {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int n = a.length;
        System.out.println(sum(a, n));
    }

    private static int sum(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        return sum(a, n - 1) + a[n - 1];
    }
}
