public class Main {
    //Tính tổng từ a đến b bằng đệ quy với 3 tham số truyền vào
    private static int sum2(int arr[], int startIndex, int endIndex	) {
 
        if (startIndex <= endIndex) {
           return 0;
         }
         return sum2(arr, startIndex-1 , endIndex) + arr[startIndex-1];
      }

     public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = sum2(arr, arr.length, 0);
        //in ket qua
         System.out.println(sum);
     }
}
