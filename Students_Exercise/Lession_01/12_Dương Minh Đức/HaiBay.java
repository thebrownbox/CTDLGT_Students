public class HaiBay {
    public static int removeElement(int[] nums, int val) {
        
        int dem = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[dem] = nums[i];
                dem++;
            }
            
        }
        return dem;
    }
    public static void main(String[] args) throws Exception {
        int[] a = { 3, 2, 2, 3 };
        int x = 3;

      

        
        System.out.println(removeElement(a,x));

        
    }
}
