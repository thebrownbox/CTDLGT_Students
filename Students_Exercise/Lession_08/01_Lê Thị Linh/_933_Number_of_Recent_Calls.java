import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
    static Queue<Integer> queue = new LinkedList<>();

    public static int ping(int t) {

        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

}