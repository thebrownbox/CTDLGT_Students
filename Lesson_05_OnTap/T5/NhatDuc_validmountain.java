package OntapCTDLGT;

public class NhatDuc_validmountain {
    public static boolean validMountainArray(int[] A) {
        if (A.length <= 2) return false;

        int top = 0;
        for (int i = 1; i < A.length; ) {
            if (top == 0) {
                if (i == A.length - 1) {
                    return false;
                }
                if (A[1] > A[0]) {
                    if (A[i] > A[i - 1]) {
                        i++;
                    } else {
                        top++;
                    }
                } else {
                    return false;
                }
            }
            if (top != 0) {
                if (A[i] < A[i - 1]) {
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String agrs[]) {
        int[] arr = {2, 0, 2};
        System.out.println(validMountainArray(arr));
    }
}
