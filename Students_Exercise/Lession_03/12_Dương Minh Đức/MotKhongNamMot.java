class Solution {
    public static int heightChecker(int[] heights) {
        int result =0 ;
        int n = heights.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = heights[i];
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {

                if (heights[j] < heights[i])
                {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }

            }

        }

        for (int i = 0; i < heights.length; i++) {

            if(heights[i] != b[i])
            {
                result++;
            }

        }



        return result;





    }

    static void show(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }




    public static void main(String[] args) {
        int[] a ={1,1,4,2,1,3};
        System.out.println( heightChecker(a));



    }
}