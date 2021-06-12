public class _1 {
    public static int find(int x , int[] a ,int indext)
    {
        if (indext<0  || indext >= a.length)
        {
            return -1;
        }

        if(a[indext] == x)
        {
            return indext;
        }

       return find(x,a,indext+1);


    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(find(5,a,0));
    }
}
