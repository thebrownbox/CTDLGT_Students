public class App {

    public static boolean validMountainArray(int[] arr) {
        int max = arr[0];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                k = i;
            }
        }
         


        for(int i = 0 ;i < k ;i++)
        {
            if (arr[i] >= arr[i]) {
                return false;
            }
           
        }
        
        for (int i = k; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i+1]) {
                return false;
            }
            
        }
        








        return true;


    }
    public static void main(String[] args) throws Exception {
        int[] a = { 0,3,2,1 };
        System.out.println(validMountainArray(a));
    }
}
