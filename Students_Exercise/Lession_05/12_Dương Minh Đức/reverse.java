public class reverse {
    public static void trade(int[] a , int i , int j)
    {
        if(i < j){
            int  t = a[i];
            a[i] = a[j];
            a[j] = t;
            trade(a, i+1, j-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,3};
        trade(a,0 , a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
