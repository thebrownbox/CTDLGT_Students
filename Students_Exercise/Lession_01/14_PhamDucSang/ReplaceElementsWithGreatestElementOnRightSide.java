public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
