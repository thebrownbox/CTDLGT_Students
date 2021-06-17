public class Sum1 {
    public static int sum1(int[] a, int i) {
        if (i == 1) {
            return a[0];
        } else {
            return sum1(a, i-1) + a[i - 1];
        }
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int i = a.length;
        System.out.println(sum1(a, i));
    }
}
