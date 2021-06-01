public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int lastNumber = 0;
        int count = 0;
        while (lastNumber < n) {
            if (arr[lastNumber] != 0) {
                count++;
            } else {
                count += 2;
            }
            if (count >= n)
                break;
            lastNumber++;
        }

        boolean specialCase = false;
        if (count > n) {
            specialCase = true;
        }

        while (lastNumber >= 0) {
            if (specialCase) {
                arr[n] = arr[lastNumber];
                n--;
                lastNumber--;
                specialCase = false;
            } else {
                if (arr[lastNumber] == 0) {
                    arr[n--] = 0;
                    arr[n--] = 0;
                    lastNumber--;
                } else {
                    arr[n--] = arr[lastNumber--];
                }
            }
        }
    }

    public static void main(String[] args) {
            int[] arr = {1,0,2,3,0,4,0};
             duplicateZeros(arr);
    }
}
