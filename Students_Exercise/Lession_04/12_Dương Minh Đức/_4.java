public class _4 {
    public  static void travel(int[][] a  , int i , int j)
    {
        if(i > a.length )
        {
            return;
        }
        int count = 0;

        while (count<=j)
        {
            System.out.print(i + "," + count +"\t");
            count++;
        }
        System.out.println();
        travel(a,i+1,j);
    }



    public static void main(String[] args) {
        int[][] a = new int[3][3];
        travel(a,0,a[0].length);
    }
}
