package OntapCTDLGT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NhatDuc_checkifexist {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // i là chỉ dành cho biến index thôi nha Đức!
        for (int i : arr) {
            map.put(i, i * 2);
        }

        // Nhưng format code tốt hơn rồi đó!
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue(arr[i])) {
                if (!map.containsValue(0)) {
                    return true;
                } else {
                    count++;
                    if (count == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
        /**
         * Nên sử dụng Set
         * For(a : arr){
         *      1. Kiểm tra xem 2*a và a/2 có tồn tại trong Set không?
         *      2. Thêm a vào set.
         * }
         */
    }

    public static void main(String agrs[]) {
        int[] arr = {2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }
}
