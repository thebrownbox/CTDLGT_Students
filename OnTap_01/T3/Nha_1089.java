class Solution {
    public void duplicateZeros(int[] arr) {
        int mark = -1;
        for (int i=0; i<arr.length; i++){
            if (i == mark){
                continue;
            }
            if (arr[i] == 0){
                mark = i+1;
                for (int j=arr.length-1; j>i; j--){
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}