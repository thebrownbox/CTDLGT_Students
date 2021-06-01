public class _26_Remove_Duplicate_From_Sorted_Array {
    public static void main(String[] args) {
        int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] a1 = { 1, 1, 2 };
        System.out.println(removeDuplicates(a));
    }

    private static int removeDuplicates(int[] a) {
        int k = 0;
        for (int i = 0; i <= a.length - 2;) {
            a[k] = a[i];
            if (a[k] != a[i + 1]) {
                a[k + 1] = a[i + 1];
                i += 1;
                k++;
            }
            else if (a[k] == a[i + 1]) {
                i++;
            }
        }
        return k + 1;
    }

    

}
