
public class _08_1346_CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = { -2, -2, 1, 10, -19, 4, 6, -8 };
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int half = arr[i] / 2;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == half && j != i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
