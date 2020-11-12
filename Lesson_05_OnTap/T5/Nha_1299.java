class Solution {
    public int[] replaceElements(int[] arr) {
        int currentBiggest = arr[arr.length-1];
        int newBiggest = currentBiggest;
        arr[arr.length-1] = -1;
        
        for (int i=arr.length-2; i>=0; i--){
            if (arr[i] > currentBiggest){
                newBiggest = arr[i];
            }
            arr[i] = currentBiggest;
            if (currentBiggest != newBiggest){
                currentBiggest = newBiggest;
            }
        }
        return arr;
    }
}