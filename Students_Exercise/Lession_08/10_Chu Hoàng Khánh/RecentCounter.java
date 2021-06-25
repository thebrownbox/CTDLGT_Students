import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    static Queue<Integer> queue = new LinkedList<>();
    public RecentCounter() {
        
    }

    public static int ping(int t) {
        queue.add(t);
        int startTime = t - 3000;

        while (queue.peek() < startTime) {
            queue.remove();
        }
        return queue.size();
    }
}
