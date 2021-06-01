/**
 * _1295_Find Numbers with Even Number of Digits
 */
/**
 * _1295_Find Numbers
 */
public class _1295_Find_Number {
    public static int findNumbers(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (countNumOfDigit(a[i]) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int countNumOfDigit(int a) {
        int count = 0;
        int temp = a;
        while (temp != 0) {
            temp = a / 10;
            a = temp;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = {12, 345, 2234, 6, 7896};
     System.out.print("số phần tử có số lượng các chữ số chẵn là: ");
    System.out.println(findNumbers(arr));


        
        
    }
}