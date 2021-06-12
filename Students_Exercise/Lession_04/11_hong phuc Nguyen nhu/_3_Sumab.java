/**
 * _3_Sumab
 */
public class _3_Sumab {

    public static int sum2(int a[], int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return a[startIndex];
        } else if (startIndex > endIndex) {
            return 0;
        }
        return a[startIndex] + sum2(a, startIndex + 1, endIndex);
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum2(a,1,5));
    }
}