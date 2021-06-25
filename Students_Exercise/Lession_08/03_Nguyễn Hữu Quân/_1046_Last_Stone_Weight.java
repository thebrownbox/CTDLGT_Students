import java.util.Arrays;

public class _1046_Last_Stone_Weight {
    
    public static void main(String[] args) {
        int[] stones = {3,7,8};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        while(n > 1){
            if(stones[n-1] == stones[n-2]){
                n-=2;
            }else{
                stones[n-2] = stones[n-1] - stones[n-2];
                n--;
                Arrays.sort(stones);
            }
        }
        if(n == 0){
            return 0;
        }else{
            return stones[0];
        }
    }
}
