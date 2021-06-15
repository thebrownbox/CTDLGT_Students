class Solution {
    int nextNumber(int n){
        int sum = 0;
        while(n > 0){
            int k = n % 10;
            sum += (k*k);
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(set.contains(n) == false){
            set.add(n);
            n = nextNumber(n);
            if(n == 1){
                return true;
            }
        }
        return  false;
    }
}