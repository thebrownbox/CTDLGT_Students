package OntapCTDLGT;

public class dupilcateZeros {
    public static void duplicateZeros(int[] arr) {
        int j=0;
        int[] num;
        int z=0;
        // Vẫn cần đổi format code
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                // Và cách đặt tên biến, ko ai đặt tên mảng là num cả! :v

                // Vẫn còn cách tối ưu hơn ko cần tạo mảng mới => Tham khảo bài của các bạn khác
                num = new int[arr.length-1-i];
                z = i + 1;
                for (j = 0; j<num.length; j++){
                    num[j]=arr[z];
                    z++;
                }
                if(i<arr.length-1){
                    arr[i+1]=0;
                    i++;
                }
                z=0;
                for (j = i+1; j<arr.length; j++){
                    arr[j]=num[z];
                    z++;
                }
            }
        }
//        int countZero = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) countZero++;
//        }
//        int len = arr.length + countZero;
//        //We just need O(1) space if we scan from back
//        //i point to the original array, j point to the new location
//        for (int i = arr.length - 1, j = len - 1; i >= 0 && j >= 0; i--, j--) {
//            if (arr[i] != 0) {
//                if (j < arr.length) arr[j] = arr[i];
//            } else {
//                if (j < arr.length) arr[j] = arr[i];
//                j--;
//                if (j < arr.length) arr[j] = arr[i]; //copy twice when hit '0'
//            }
//        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
