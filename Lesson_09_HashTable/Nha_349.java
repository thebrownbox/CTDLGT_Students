class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        int[] arr;
        
        for (int i=0; i<nums1.length; i++){
            mySet.add(nums1[i]);
        }
        
        for (int i=0; i<nums2.length; i++){
            if (mySet.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        
        arr = new int[intersection.size()];
        int count = 0;
        for (Integer e : intersection){
            arr[count] = e;
            count++;
        }
        
        return arr;
    }
}