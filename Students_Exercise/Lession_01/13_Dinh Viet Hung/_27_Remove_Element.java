public class _27_Remove_Element {
    public static int removeElement(int[] arr, int val) {
        int n = arr.length;

        for (int i = 0; i < n;) {
            if (arr[i] == val){
                for (int j = i; j <= (n-2); j++) {
                    arr[j] = arr[j+1];
                }
                n--;
            }else{
                i++;
            }
        }

        return n;
    }
    
    
    public static void main(String[] args) {
        int [] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
        System.out.println("End");
    }
}
