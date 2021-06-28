import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight{
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        for(int i : stones){
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(y!=x){
                maxHeap.add(y-x);
            }
        }
        if(maxHeap.size()==1){
            return maxHeap.peek();
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}