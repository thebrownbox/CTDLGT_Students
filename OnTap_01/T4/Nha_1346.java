class Solution {
    public boolean checkIfExist(int[] arr) {
        // Rất tốt nhưng hình như lại ko format code.
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == 2*arr[j] || arr[j] == 2*arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}