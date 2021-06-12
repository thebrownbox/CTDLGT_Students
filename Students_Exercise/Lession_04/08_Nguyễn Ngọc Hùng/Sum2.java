public class Sum2 {
    public static int sum2(int[] a, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return a[startIndex-1];
        } else {
            return sum2(a, startIndex, endIndex - 1) + a[endIndex - 1];
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum2(a, 4, 7));
    }
}
