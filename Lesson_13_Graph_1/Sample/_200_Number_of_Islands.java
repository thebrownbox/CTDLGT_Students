public class _200_Number_of_Islands {

    private static boolean daDuyet[][];

    public static void duyetDFS(int i, int j, char[][] a)
    {
        // 1. Xet hop le
        int nRow = a.length;
        int nCol = a[0].length;
        if(i < 0 || i >= nRow || j < 0 || j >= nCol)
        {
            return;
        } 

        if(daDuyet[i][j] == true || a[i][j] == '0')
        {
            return;
        }

        //2. Danh dau da duyet [i][j]
        System.out.println("Duyet & danh dau [" + i +" ,"+j+"]");
        daDuyet[i][j] = true;

        // 3. Duyet den cac dinh ke no
        duyetDFS(i+1, j, a);
        duyetDFS(i-1, j, a);
        duyetDFS(i, j+1, a);
        duyetDFS(i, j-1, a);   
    }

    public static int numIslands(char[][] a) {
        int nRow = a.length;
        int nCol = a[0].length;
        int count = 0;
        daDuyet = new boolean[nRow][nCol];

        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {

                if(a[i][j] == '1' && daDuyet[i][j] == false)
                {
                    count++;
                    System.out.println("Lan: " + count);
                   
                    duyetDFS(i, j, a);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
            };
        int k = numIslands(grid);
        System.out.println("k = " + k);
    }
}
