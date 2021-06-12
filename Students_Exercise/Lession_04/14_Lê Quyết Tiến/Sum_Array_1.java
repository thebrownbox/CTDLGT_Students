public class Sum_Array_1 {
    public static int sum1(int[] a, int i) {
        if (i < 0 || i >= a.length) {
            return 0;
        }
        int sum = a[i] + sum1(a, i + 1);
        return sum;
    }
    public static void main(String[] args) throws Exception {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum1(a, 0));
    }
}
