public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] a2 = { 3, 2, 2, 3 };

        removeElement(a, 2);
    }
    
    public static int removeElement(int[] a, int val) {
        int length = a.length;

        for (int i = 0; i < length;) {
            if (a[i] == val) {
                length--;
                for (int j = i + 1; j <= length; j++) {
                    a[j - 1] = a[j];
                }
                a[length] = val;
            } else {
                i++;
            }
        }
        return length;
    }

   
}
