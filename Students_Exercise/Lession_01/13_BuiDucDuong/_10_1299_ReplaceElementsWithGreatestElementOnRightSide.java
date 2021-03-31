public class _10_1299_ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        arr = replaceElements(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        int max = -1;
        for (int i = arr.length - 3; i >= 0; i--) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }
            res[i] = max;
        }
        return arr;
    }
}