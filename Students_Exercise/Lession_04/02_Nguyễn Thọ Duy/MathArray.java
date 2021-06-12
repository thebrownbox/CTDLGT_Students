
public class MathArray {
    //Implement hàm sum1 để tính tổng các phần tử có trong mảng a
    private static int sum1(int a[], int n) {
        if (n == a.length) {
            return 0;
        }
        return sum1(a, n + 1) + a[n];
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 7, 9, 10 };
        int sum = sum1(a, 0);
        //in kqua
        System.out.println(sum);
    }

}
