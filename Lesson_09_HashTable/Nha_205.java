class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> myMap = new HashMap<>();
        
        for (int i=0; i<s.length(); i++){
            if (myMap.containsKey(s.charAt(i))){
                if (myMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if (myMap.containsValue(t.charAt(i))){
                    return false;
                }
                myMap.put(s.charAt(i), t.charAt(i));
            }
        }
        
        return true;
    }
}