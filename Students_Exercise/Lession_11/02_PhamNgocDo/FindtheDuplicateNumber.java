class FindtheDuplicateNumber{
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)==false) set.add(i);
            else return i;
        }
        return 0;
    }
}