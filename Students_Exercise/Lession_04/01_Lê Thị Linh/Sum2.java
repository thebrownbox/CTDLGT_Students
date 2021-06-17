public class Sum2 {
    public static int sum2(int[] a, int startIndex, int endIndex) {
        int sum = 0;
        if (startIndex < endIndex)
            sum = a[startIndex] + a[endIndex] + sum2(a, startIndex + 1, endIndex - 1);

        return sum;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Total [startIndex, endIndex] =  ");
        System.out.println(sum2(a, 0, 3));
    }
}