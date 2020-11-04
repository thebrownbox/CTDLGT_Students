import java.util.Arrays;

public class Solution414 {
    public static void main(String[] args){
        int[] nums = {2,2,3,1,4,4,4,3};
        System.out.println("Third number is: " + thirdMax(nums));
    }
    public static int thirdMax(int[] nums){
        Arrays.sort(nums);
        int answer = 0;
        int ct = 1;
        for(int i = nums.length-1;i>=0;i--){
            if(i>0 && nums[i]!=nums[i-1])
                ct++;
            if(ct==3){
                answer = nums[i-1];
                break;
            }
        }
        if(ct!=3)
            answer = nums[nums.length-1];
        return answer;
    }
}
