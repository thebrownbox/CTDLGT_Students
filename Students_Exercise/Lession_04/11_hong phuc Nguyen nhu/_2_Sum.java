public class _2_Sum {
    public static int sum1(int a[], int i) {
        if (i >= a.length) {
            return 0;
        }
        return a[i] + sum1(a, i + 1);
    }
public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(sum1(a, 2));
}
}
