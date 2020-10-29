public class Ex01Find {
    public static int find(int x, int[] a, int i) {
        if (a.length == 0) {
            return -1;
        } else {
            if (i >= 0 && i < a.length) {
                return a[i] == x ? i : find(x, a, i + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = find(10, a, 0);

        System.out.println(result);
    }
}
