import java.util.Arrays;

/**
 * Test
 */
public class Test {

    public static void reset_1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void reset_2(int[] arr){
        arr = new int[]{1,2,3};
    }

    public static void reset_3(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        arr = new int[]{1,2,3};
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9};

        // reset_1(arr);
        // System.out.println(Arrays.toString(arr));

        reset_2(arr);
        System.out.println(Arrays.toString(arr));

        reset_3(arr);
        System.out.println(Arrays.toString(arr));
    }
}