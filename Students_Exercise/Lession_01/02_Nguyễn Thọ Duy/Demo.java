import java.util.Stack;

public class Demo {
    public int removeElement(int[] nums, int val) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                stack.push(nums[i]);
            }
            }
            return stack.size();
        }
        
     
}
