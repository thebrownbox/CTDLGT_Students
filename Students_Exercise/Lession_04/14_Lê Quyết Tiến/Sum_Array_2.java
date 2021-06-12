public class Sum_Array_2 {
    public static int sum2(int[] a, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        int sum = a[startIndex] + sum2(a, startIndex + 1, endIndex);
        return sum;
    }
    public static void main(String[] args) throws Exception {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum2(a, 1, 4));
    }
}
