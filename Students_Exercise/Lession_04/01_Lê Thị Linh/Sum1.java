public class Sum1 {
    public static int sum1(int[] a, int i) {
        if (i != 0)
            return i + sum1(a, i - 1);
        else
            return i;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Total =  ");
        System.out.println(sum1(a, 9));

    }

}
