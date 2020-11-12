package vn.techmaster;

public class duplicateZeros {
    public void duplicateZ(int[] arr) {
        // Ngắn gọn dễ hiểu => RẤT TỐT, nhưng vẫn cần format lại code
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                for (int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}
