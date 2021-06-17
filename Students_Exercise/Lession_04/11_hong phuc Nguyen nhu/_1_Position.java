public class _1_Position {
    public static int find(int x, int a[], int i) {
        if (i < 0 || i >= a.length) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        return find(x, a, i + 1);
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(find(5, a, 1));
    }
}
