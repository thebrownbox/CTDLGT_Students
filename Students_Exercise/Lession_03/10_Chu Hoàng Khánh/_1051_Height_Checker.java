
public class _1051_Height_Checker {
    public static void main(String[] args) {
        int[] a = { 5, 1, 2, 3, 4 };
        System.out.println(heightChecker(a));
    }

    public static int heightChecker(int[] a) {
        int[] expected = new int[a.length];

        int count = 0;
        for (int i = 0; i < expected.length; i++) {
            expected[i] = a[i];
        }

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

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != a[i]) {
                count++;
            }
        }
        return count;
    }
}
