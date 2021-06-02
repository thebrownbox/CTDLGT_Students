public class Duplicate {
    public static  void duplicateZeros(int[] arr) {

        for(int i = 0 ;i < arr.length ;i++)
        {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j >= i + 1; j--) {
                    arr[j + 1] = arr[j];
                }
                if (i + 1 < arr.length) {
                arr[i+1] = 0;
                i++;
            }
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t",arr[i]);
        }
        
    }
    public static void main(String[] args) throws Exception {
        int[] a = { 1, 0, 2, 3, 0, 4, 5, 2 };
        duplicateZeros(a);
    }
}
