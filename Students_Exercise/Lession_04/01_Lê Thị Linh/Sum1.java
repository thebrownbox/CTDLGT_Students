public class Sum1 {
    //sum1(a, -1)
    public static int sum1(int[] a, int i) {
        // Nên để điều kiện chặt chẽ hơn 
        if (i != 0)
            return a[i] + sum1(a, i - 1);
        else
            return i;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Total =  ");
        System.out.println(sum1(a, 9));
        Math.min(-1, -1);
    }

}
