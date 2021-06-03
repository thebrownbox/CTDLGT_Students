class BonTamNam {
   
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int dem = 0;
        for(int i = 0 ;i < nums.length ;i++)
        {
           if(nums[i] == 0)
           {
               dem = 0;
           }
           else
           {
               dem++;
               max =  (dem > max) ? dem : max;
           }
            
        }
        return max;
    }
    
    public static void main(String[] args) {
         int[] a = {1,1,0,1,1,1};
         System.out.println(findMaxConsecutiveOnes(a));
        
    }
    
    
}