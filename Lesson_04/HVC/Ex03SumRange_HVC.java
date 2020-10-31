public class Ex03SumRange {
    public static int sumRange(int[] a, int startIndex, int stopIndex){
        int sum = 0;
        if (a.length == 0){
            return -1;
        }else {
            if (startIndex >= 0 && stopIndex < a.length && startIndex <= stopIndex){
                sum = a[startIndex] + sumRange(a, startIndex + 1, stopIndex);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = sumRange(a, 0, 3);

        System.out.println(result);
    }
}
