public class PrintArray {
    public static void main(String[] args) {
        int[] a = { 1,2,3,4,5,6};

        printArray(a, 0);
    }

    private static void printArray(int[] a, int i) {
        if (i >= a.length || i < 0) {
            return;
        }
        printArray(a, i + 1);
        System.out.print(a[i] + " ");
    }
    
    
    

}
