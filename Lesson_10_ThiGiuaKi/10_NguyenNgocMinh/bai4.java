public class bai4 {
    public static int checkPivot(int[] nums, int pivot){
        int sumLeft = 0, sumRight = 0;
        if (nums.length < 1){
            return -1;
        }
        for (int i = 0; i < nums.length; i++){
            if( i < pivot){
                sumLeft += nums[i];
            }
            else if (i > pivot){
                sumRight += nums[i];
            }
        }
        if(sumLeft == sumRight){
            return pivot;
        }
        return -1;
    }
    public static int pivotIndex(int[] nums) {
        if(nums.length < 1){
            return -1;
        }
        int pivot = nums.length/2 -1;
        if (checkPivot(nums, pivot) != -1){
            return pivot;
        }
        else if (checkPivot(nums, (pivot+1)) != -1){
            return pivot +1;
        }
        else if(checkPivot(nums, (pivot-1)) != 1){
            return pivot -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(nums));
    }
}
