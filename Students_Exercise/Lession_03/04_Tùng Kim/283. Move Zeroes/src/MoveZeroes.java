public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroCount = 0 , length = nums.length;
        for (int i = 0; i < length ; i++) {
            if(nums[i] != 0)
                nums[nonZeroCount++] = nums[i];
        }
        while (nonZeroCount < length)
            nums[nonZeroCount++] = 0;
    }

    public static void printArr(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        System.out.println("Original array : ");
        printArr(nums);
        new MoveZeroes().moveZeroes(nums);
        System.out.println("Array after movezeros:");
        printArr(nums);
    }
}
