import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class DFSWithStack{
    public static void main(String[] args){
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
        Stack<Integer> stack = new Stack<>();

        stack.add(0);
        daDuyet.add(0);

        while(stack.isEmpty() == false)
        {
            int dinhDangXet = stack.pop();
            System.out.print(dinhDangXet + " ");

            // Tim cac dinh ke voi dinh dang xet
            // va chua duoc duyet => add no vao stack
            for (int i = 0; i < a.length; i++) {
                if(a[dinhDangXet][i] == 1 && daDuyet.contains(i) == false){
                    stack.add(i);
                    daDuyet.add(i);
                }
            }
        }

        System.out.println("Hello World!");
    }
}