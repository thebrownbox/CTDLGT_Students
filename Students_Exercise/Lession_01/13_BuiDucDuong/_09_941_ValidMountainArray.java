public class _09_941_ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 2 };
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                if (arr[i] == arr[i - 1]) {
                    return false;
                }
                return isDecreasing(arr, i);
            }
        }
        return false;
    }

    private static boolean isDecreasing(int[] arr, int i) {
        for (i = i + 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
