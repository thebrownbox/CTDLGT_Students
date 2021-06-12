
public class _1051_Height_Checker {
    public static int heightChecker(int[] heights){
        int count = 0;
        int n = heights.length;
        int[]temp = new int[heights.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = heights[i];       
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (heights[j] > heights[j+1]) {
                    int t = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = t;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i]!= temp[i]) {
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.print("Output = ");
        System.out.println(heightChecker(heights));
    }
}
