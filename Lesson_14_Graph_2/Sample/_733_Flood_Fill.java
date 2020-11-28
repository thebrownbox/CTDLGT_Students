/**
 * _733_Flood_Fill
 */
public class _733_Flood_Fill {

    boolean[][] daDuyet;
    int nRow, nCol;

    public void DFS(int[][] a, int i, int j, int oldColor, int newColor)
    {
        // 1. Xet dieu kien hop le
        if(i < 0 || i >= nRow || j < 0 || j >= nCol) return;

        // 2. Chi xet cac diem chua duoc duyet && co cung mau voi oldColor
        if(daDuyet[i][j] == true || a[i][j] != oldColor) return;

        // 3. Doi mau - Xu ly
        a[i][j] = newColor;

        // 4. Danh dau diem i j da duoc duyet
        daDuyet[i][j] = true;

        // 5. De quy den cac dinh ke
        DFS(a, i+1, j, oldColor, newColor);
        DFS(a, i-1, j, oldColor, newColor);
        DFS(a, i, j+1, oldColor, newColor);
        DFS(a, i, j-1, oldColor, newColor);
        
    }

    public int[][] floodFill(int[][] a, int startI, int startJ, int newColor) 
    {
        nRow = a.length;
        nCol = a[0].length;

        daDuyet = new boolean[nRow][nCol];
        int oldColor = a[startI][startJ];

        DFS(a, startI, startJ, oldColor, newColor);

        return a;
    }

    public static void main(String[] args) {
        int[][] image = {   {1,1,1}, 
                            {1,1,0}, 
                            {1,0,1}};
        _733_Flood_Fill s = new _733_Flood_Fill();
        int[][] result = s.floodFill(image, 1, 1, 2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}