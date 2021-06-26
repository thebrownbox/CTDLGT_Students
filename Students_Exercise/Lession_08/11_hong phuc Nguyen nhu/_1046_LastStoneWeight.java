import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1046_LastStoneWeight {
    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };
    Queue<Integer> integerQueue = new PriorityQueue<Integer>(comparator);

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0)
            return 0;
        if (stones.length == 1)
            return stones[0];

        for (int stone : stones) {
            integerQueue.add(stone);
        }
        while (integerQueue.size() > 1) {
            int temp1 = integerQueue.poll();
            int temp2 = integerQueue.poll();
            int diff = Math.abs(temp1 - temp2);
            if (diff > 0)
                integerQueue.add(diff);
        }

        if (integerQueue.isEmpty())
            return 0;
        else return integerQueue.peek();
    }





    public static void main(String[] args) {
        int []stones = {2,7,4,1,8,1};

    }
}