
public class _04_1089_DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            result[j] = arr[i];
            if (arr[i] == 0) {
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}