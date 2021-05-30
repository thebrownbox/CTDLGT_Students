/**
 * 283_Move Zeroes
 */
public class _283_MoveZeroes{

    public static void main(String[] args) {
        int[] a = { 0, 0, 1 };
        int[] a2 = {0,1,0,3,12};
        moveZeroes(a);
    }

    private static void moveZeroes(int[] a) {
        int n = a.length;
        for (int i = 0; i < n;) {
            if (a[i] == 0) {
                n--;
                removeElement(a, i);
            } else {
                i++;
            }
        }

        Print_Array.printArray(a);
    }

    private static void removeElement(int[] a, int i) {
        int x = a[i];
        for (int j = i + 1; j < a.length; j++) {
            a[i++] = a[j];
        }
        a[a.length - 1] = x;
    }
    

}