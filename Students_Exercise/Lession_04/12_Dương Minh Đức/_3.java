public class _3 {

    public static  int sum2 (int[] a , int startIndext, int endIndext)
    {
        if (startIndext == endIndext)
        {
            return a[endIndext];
        }
        if (startIndext > endIndext)
        {
            return 0;
        }
        return a[startIndext] + sum2(a,startIndext+1,endIndext);
    }



    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum2(a,2,5));
    }
}
