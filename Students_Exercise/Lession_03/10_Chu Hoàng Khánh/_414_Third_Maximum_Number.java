public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int[] a = { 2,2,3,1};
        System.out.println(thirdMax(a));
    }

    private static int thirdMax(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        }

        int count = 0;
        int max = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            if (count == 2)
                break;
            if (a[i] < max) {
                count++;
                max = a[i];
            }
        }
        if (count == 2)
            return max;
        return a[a.length - 1];
    }
}
