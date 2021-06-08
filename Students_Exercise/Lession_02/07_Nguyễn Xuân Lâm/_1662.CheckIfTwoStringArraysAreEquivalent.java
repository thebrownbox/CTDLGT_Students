class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int index1=0,index2=0;
        int id1=0,id2=0;
        
        while(index1<word1.length && index2<word2.length){
            if(word1[index1].charAt(id1) != word2[index2].charAt(id2)){
                return false;
            }
            id1++;
            id2++;
            
            if(id1==word1[index1].length()){
                id1=0;
                index1++;
            }
            
            if(id2==word2[index2].length()){
                id2=0;
                index2++;
            }
        }
        
        return index1==word1.length && index2==word2.length;
    }
}