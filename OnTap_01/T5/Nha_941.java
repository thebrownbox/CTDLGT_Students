class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3){
            return false;
        }
        
        int maxUp = 0, maxDown = A.length-1;
        for (int i=1; i<A.length; i++){
            if (A[i] <= A[i-1]){
                maxUp = i-1;
                break;
            }
        }
        for (int i= A.length-2; i>=0; i--){
            if (A[i] <= A[i+1]){
                maxDown = i+1;
                break;
            }
        }
        if (maxUp > 0 && maxDown < A.length-1 && maxUp == maxDown){
            return true;
        }
        return false;
    }
}