
/**
 * Find
 */
public class Find {

    public static int find(int x, int[] a, int i) {
        if (i >= a.length || i < 0) {
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            return find(x, a, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("index: ");
        System.out.println(find(5, a, 0));
    }
}