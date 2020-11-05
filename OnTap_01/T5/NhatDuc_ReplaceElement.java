package OntapCTDLGT;

public class NhatDuc_ReplaceElement {
    public static int[] replaceElements(int[] arr) {
        int maxRight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                return arr;
            }
            maxRight = arr[arr.length - 1];
            for (int j = arr.length - 2; j > i; j--) {
                if (arr[j] > maxRight) {
                    maxRight = arr[j];
                }
            }
            arr[i] = maxRight;
        }
        return arr;
    }

    public static void main(String agrs[]) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr2 = replaceElements(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
