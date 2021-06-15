class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for (int i=0; i<nums.length; i++){
            if (myMap.containsKey(nums[i])){
                myMap.put(nums[i], 2);
            }
            else{
                myMap.put(nums[i], 1);
            }
        }
        
        int result = 0;
        
        for (Map.Entry e : myMap.entrySet()){
            if(e.getValue() == Integer.valueOf(1)){
                result = (int) e.getKey();
                break;
            }
        }
        
        return result;
    }
}