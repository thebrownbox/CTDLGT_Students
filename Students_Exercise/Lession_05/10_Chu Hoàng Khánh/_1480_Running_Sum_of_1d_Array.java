
public class _1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] a = { 3,1,2,10,1 };

        runningSum(a);
    }
    
    public static int[] runningSum(int[] a) {
        
        int k = 1;
        int sum = a[0];
        a[0] = sum;
        for (int i = 1; i < a.length; i++) {
            sum += a[i];
            a[k++] = sum;
        }
        return a;
    }
}
