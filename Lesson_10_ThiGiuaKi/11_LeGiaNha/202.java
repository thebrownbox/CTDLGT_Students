class Solution {
    public boolean checkHappy(int number, Set mySet){
        int total = 0;
        
        while(number != 0){
            int excess = number%10;
            total += excess*excess;
            number /= 10;
        }
        
        if (total == 1){
            return true;
        }
        
        if (mySet.contains(total)){
            return false;
        }
        
        mySet.add(total);
        return checkHappy(total, mySet);
    }
    
    public boolean isHappy(int n) {
        Set<Integer> mySet = new HashSet<>();
        
        return checkHappy(n, mySet);
    }
}