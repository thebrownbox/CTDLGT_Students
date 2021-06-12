public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] old = new int[heights.length];
        int count = 0;
        for (int i = 0; i < tem.length; i++) {
            old[i] = heights[i];
        }
        for (int i = 0; i < heights.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] < heights[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = heights[i];
                heights[i] = heights[minIndex];
                heights[minIndex] = temp;
                
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (old[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        int[] heights = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}
