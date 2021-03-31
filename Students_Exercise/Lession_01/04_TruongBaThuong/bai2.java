
public class bai2 {
    public static void main(String[] args) {
        
    }
    public static int Numbers(int[] nums){
        int im = 0;
        int sc = 0;
        for(int i=0;i<nums.length;i++){
            int dem = 0;
            if(nums[im] / 10!=0){
                dem++;
                nums[im] = nums[im] /10;
            }
        if(dem % 2==0){
            sc++;
        }
        im++;
        }
        return sc;

    }
    
}
