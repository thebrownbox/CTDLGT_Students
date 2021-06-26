import java.util.*;

public class _1046_Stone {
    public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> myQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < stones.length; i++) {
                myQueue.add(stones[i]);
            }

            while (myQueue.size()>1)
            {
                int a = myQueue.remove();
                int b = myQueue.remove();
                if(a!=b)
                {
                    myQueue.add(a-b);
                }

            }

            if( myQueue.size() != 0) {
                return  myQueue.peek();
            }
            else {
                return 0;
            }
        }
}
