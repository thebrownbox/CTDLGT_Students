package OntapCTDLGT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NhatDuc_checkifexist {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            map.put(i, i * 2);
        }

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
    }

    public static void main(String agrs[]) {
        int[] arr = {2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }
}
