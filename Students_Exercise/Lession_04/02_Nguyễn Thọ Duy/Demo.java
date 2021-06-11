public class Demo {
    // Hàm find có chức năng tìm biến x trong mảng a và trả về index của x trong
    // mảng a.
    public static int find(int x, int[] a, int i) {
        if (x == a[i]) {
            return i;
        } else {
            find(x, a, i + 1);
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = 5;
        int result = find(x, a, 0);
        System.out.println(result);
    }
}
