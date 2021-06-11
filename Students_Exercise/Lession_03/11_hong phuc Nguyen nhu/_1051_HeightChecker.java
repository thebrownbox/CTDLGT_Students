import java.util.Arrays;

public class _1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            newHeights[i] = heights[i];
        }

        Arrays.sort(heights);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (newHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int heights[] = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}
