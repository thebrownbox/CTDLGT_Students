public class Quang_27 {
    public static void main(String[] args) {
        //Initialize the array
        // A Quang chưa xem code review hqua nhé, chưa format code.
        int[] nums = {2,3,4,3,3,5,6};
        int len = removeElement(nums,3);
        for(int i=0;i<len;i++)
            System.out.print(nums[i] + " ");
    }
    public static int removeElement(int[] nums, int val){
        int len = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
