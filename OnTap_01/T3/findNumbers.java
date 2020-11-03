package OntapCTDLGT;

public class findNumbers {
    public static int findNumbers(int[] nums) {
        // 1. Cần thay đổi lại tên biến cho có ý nghĩa và đọc dễ hiển hơn
        int digits=0;
        int z=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            // Đoạn này có thể tối ưu hơn => tham khảo bài một số bạn khác
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
