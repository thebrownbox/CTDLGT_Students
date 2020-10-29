public class Ex02Sum {
    public static int Sum(int[] a, int minIndex) {
        int sum = 0;
        if (a.length == 0) {
            return -1;
        } else {
            if (minIndex >= 0 && minIndex < a.length) {
                sum = a[minIndex] + Sum(a, minIndex + 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = Sum(a,0);

        System.out.println(result);
    }
}
