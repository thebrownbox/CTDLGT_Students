import java.util.Arrays;

public class Solution1051 {
    public static void main(String[] args){
        int[] list = {1,1,4,2,1,3};
        System.out.println(heightChecker(list));
    }

    public static int heightChecker(int[] heights){
        int[] sortedHeight = Arrays.copyOf(heights, heights.length);

        Arrays.sort(sortedHeight);

        int ct = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sortedHeight[i])
                ct++;
        }

        return ct;
    }
}
