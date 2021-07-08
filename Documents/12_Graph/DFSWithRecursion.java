import java.util.HashSet;
import java.util.Set;

public class DFSWithRecursion {

    public static void DFS(int dinhDangXet, int[][] a, Set<Integer> daDuyet)
    {
        System.out.print(dinhDangXet + " ");
        // Tim cac dinh ke voi dinh dang xet
        // va chua duoc duyet
        //  => Danh dau da duyet truoc , De quy den dinh tiep theo
        for (int i = a.length-1; i >= 0; i--) {
            if(a[dinhDangXet][i] == 1 && daDuyet.contains(i) == false){
                daDuyet.add(i);
                DFS(i, a, daDuyet);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0,1,0,0,0,0,0} ,
        {1,0,1,1,1,0,0},
        {0,1,0,0,0,1,0},
        {0,1,0,0,0,1,1},
        {0,1,0,0,0,0,1},
        {0,0,1,1,0,0,0},
        {0,0,0,1,1,0,0}};

        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0);

        DFS(0, a, daDuyet);
    }
}
