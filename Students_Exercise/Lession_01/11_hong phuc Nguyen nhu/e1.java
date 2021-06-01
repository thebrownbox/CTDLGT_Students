public class e1 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int a = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=val){
               nums[a]=nums[i];
                a++;
            }
        }
    return a;
    }
}
