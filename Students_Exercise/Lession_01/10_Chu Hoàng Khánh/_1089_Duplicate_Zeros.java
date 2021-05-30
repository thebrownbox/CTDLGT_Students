public class _1089_Duplicate_Zeros {
    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 3, 0, 4, 5, 0};
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 0, 0, 0, 0, 0, 0, 0 };

        duplicateZeros(a2);

    }

    private static void duplicateZeros(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                removeElement(i, a);
                if (i + 1 < a.length) {
                    a[i + 1] = 0;
                    i++;
                }
            }
        }

        printArray(a);
    }

    private static void removeElement(int i, int[] a) {
        for (int j = a.length - 1; j > i; j--) {
            a[j] = a[j - 1];
        }
    }

    private static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
