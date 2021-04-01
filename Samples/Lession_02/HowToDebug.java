import java.util.Arrays;

public class HowToDebug {

    // private static void thisIsAFunction(int k) {
    //     System.out.println("K la so " + (k%2 == 0 ? "Chan" : "Le"));
    // }

    // public static void main(String[] args) {
    //     int n = 10;
    //     int k = 0;
    //     int[] a = {1,2,3};
    //     for (int i = 0; i < n; i++) {
    //         k++;
    //         if(k == 5){
    //             System.out.println("k = 5");
    //         }
    //         a[i%3]++;
    //         thisIsAFunction(k);
    //     }
    // }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int i = -1;
        while ((i + 1) < n && nums[i + 1] < 0) {
            i++;
        }

        int j = n;
        while ((j - 1) >= 0 && nums[j - 1] >= 0) {
            j--;
        }
        
        int[] A = new int[n];
        int index = 0;
        while (i >= 0 || j < n) {
            if (i >= 0 && j < n) {
                if (A[i] * A[i] > A[j] * A[j]) {
                    A[index] = A[j] * A[j];
                    j++;
                    index++;
                } else {
                    A[index] = A[i] * A[i];
                    i--;
                    index++;
                }
            }

            else if (i >= 0) {
                A[index] = A[i] * A[i];
                i--;
                index++;

            } else {
                A[index] = A[j] * A[j];
                j++;
                index++;
            }
        }
        
        return A;
    }

    public static void main(String[] args) {
        int[] a = { -4, -1, 0, 3, 10 };

        System.out.print("Array: ");

        System.out.println(Arrays.toString(sortedSquares(a)));
        // 0 1 9 16 100
    }
}
