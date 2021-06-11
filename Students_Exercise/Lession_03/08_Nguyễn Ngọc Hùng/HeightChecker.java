public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int temp;
        int[] a = new int[heights.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = heights[i];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (heights[j + 1] < heights[j]) {
                    temp = heights[j + 1];
                    heights[j + 1] = heights[j];
                    heights[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != heights[i]) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(a));

    }
}
