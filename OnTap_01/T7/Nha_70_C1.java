//Cách này đúng về giải thuật nhưng chạy trên leetcode sẽ bị time limited exceeded.
//Ưu điểm: có thể xuất ra cách đi nếu cần

class Solution {
    int count = 0;
    
    public void recursion(int[] arr, int index, int currentStep, int totalStep){
        if (currentStep >= totalStep){
            if (currentStep == totalStep){
                count++;
            }
            return;
        }
        
        for (int i=1; i<=2; i++){
            arr[index] = i;
            recursion(arr, index+1, currentStep+i, totalStep);
        }
    }
    
    public int climbStairs(int n) {
        int[] stepArr = new int[n];
        recursion(stepArr, 0, 0, n);
        return count;
    }
}