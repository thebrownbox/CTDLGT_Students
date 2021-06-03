/**
 * _1089_duplicate_zero
 */
public class _1089_duplicate_zero {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j >= i + 2; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < arr.length)
                    arr[i + 1] = 0;
                i++;
            }
        }
        System.out.println("Mang moi la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}