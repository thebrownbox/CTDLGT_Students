public class Recursion2DArray {
    static void travel(int[][] a, int i, int j){
        if(i==0)
            return;
        travel(a,i-1,j);
        print(a,i,j);
    }
    static void print(int[][]a, int i,int j){
        if(i<=0 || i>a.length || j<=0 || j>a[0].length)
            return;
        if(j==0)
            return;
        print(a,i,j-1);
        System.out.print("["+(i-1)+","+(j-1)+"]" +" ");
    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        travel(a,2,3);
    }
}
