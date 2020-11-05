class Solution {
    public static int recursion(Map map, int n){
        if (map.containsKey(n)){
            return (int) map.get(n);
        }

        map.put(n, recursion(map, n-1) + recursion(map, n-2));
        return (int) map.get(n);
    }

    public static int climbStairs(int n){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 2);

        return recursion(map, n);
    }
}