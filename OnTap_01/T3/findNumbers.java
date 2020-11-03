package OntapCTDLGT;

public class findNumbers {
    public static int findNumbers(int[] nums) {
        int digits=0;
        int z=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            for (j=0;;j++){
                digits= (int) (nums[i]/Math.pow(10,j));
                if(digits<1){
                break;}
            }
            if((j-1)%2!=0){
                z++;
            }
        }
        return z;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
