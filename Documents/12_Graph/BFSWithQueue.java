import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSWithQueue {
    public static void main(String[] args) {
        int[][] a = {{0,1,0,0,0,0,0} ,
                    {1,0,1,1,1,0,0},
                    {0,1,0,0,0,1,0},
                    {0,1,0,0,0,1,1},
                    {0,1,0,0,0,0,1},
                    {0,0,1,1,0,0,0},
                    {0,0,0,1,1,0,0}};

        // khoi tao: 0,1,2,3,4,5,6,0
        // => 0
        Set<Integer> daDuyet = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        daDuyet.add(0);

        while(queue.isEmpty() == false)
        {
            int dinhDangXet = queue.poll();
            System.out.print(dinhDangXet + " ");

            // Tim cac dinh ke voi dinh dang xet
            // va chua duoc duyet => add no vao queue
            for (int i = 0; i < a.length; i++) {
                if(a[dinhDangXet][i] == 1 && daDuyet.contains(i) == false){
                    queue.add(i);
                    daDuyet.add(i);
                }
            }
        }

    }
}
