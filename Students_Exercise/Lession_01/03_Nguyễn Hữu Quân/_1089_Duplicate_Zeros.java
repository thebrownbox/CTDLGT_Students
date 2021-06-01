
/**Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function. */

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int len = arr.length;
        boolean lastEqualZero = false;
        for(int i=0; i<len-1; i++){
            if(arr[i]==0){
                len--;
                if(i==len-1){
                    lastEqualZero = true;
                }
            }
        }
        int indexMinus = 1;
        arr[arr.length - indexMinus] = arr[len-1];
        indexMinus++;
        if(lastEqualZero){
            arr[arr.length - indexMinus] = 0;
            indexMinus++;
        }
        for(int i =len-2; i>=0; i--){            
            if(arr[i]==0){
                arr[arr.length - indexMinus] = 0;
                arr[arr.length - indexMinus - 1] = 0;
                indexMinus+=2;
            }else{
                arr[arr.length - indexMinus] = arr[i];
                indexMinus++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,5,2,0,6,8,0,6,0};
        duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
