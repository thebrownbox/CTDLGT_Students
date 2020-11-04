class Solution {
    public boolean validMountainArray(int[] A)  {
        boolean result = true;
        int max = 0;
        int indexMax = 0;
        int leftIndex = 0;
        int rightIndex = A.length - 1;
        if (A.length < 3) {
            result = false;
        } else {
            for (int i = 0; i < A.length; i++) {
                if (i == A.length - 1) {
                    break;
                }
                if (A[i] > A[i + 1] && A[i] > max) {
                    max = A[i];
                    indexMax = i;
                } else if (A[i] < A[i + 1] && A[i + 1] > max) {
                    max = A[i + 1];
                    indexMax = i + 1;
                }
            }
        }
        if (A.length == 3) {
            if (indexMax != 1 || A[indexMax] == A[indexMax + 1] || A[indexMax] == A[indexMax - 1]) {
                result = false;
            }
        }
        if ((A.length > 3 && indexMax == A.length - 1) || (A.length > 3 && indexMax == 0)) {
            result = false;
        } else if (A.length > 3 && indexMax != A.length - 1) {
            while (true) {
                if (A[leftIndex] >= A[leftIndex + 1] && leftIndex + 1 < indexMax) {
                    result = false;
                    break;
                } else if (leftIndex == indexMax) {
                    break;
                } else {
                    leftIndex++;
                }
            }
            while (true) {
                if (A[rightIndex] >= A[rightIndex - 1] && rightIndex - 1 > indexMax) {
                    result = false;
                    break;
                } else if (rightIndex == indexMax) {
                    break;
                } else {
                    rightIndex--;
                }
            }
        }


        return result;
    }
}