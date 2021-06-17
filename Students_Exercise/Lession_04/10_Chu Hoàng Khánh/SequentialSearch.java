public class SequentialSearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        
        int index = find(a, 0, a.length - 1, 7);
        System.out.println(index);
        
    }

    private static int find(int[] a, int l, int r, int x) {
        if (r < l) {
            return -1;
        }
        if (a[l] == x) {
            return l;
        }
        if (a[r] == x) {
            return r;
        }
        return find(a, l + 1, r - 1, x);
    }
}
