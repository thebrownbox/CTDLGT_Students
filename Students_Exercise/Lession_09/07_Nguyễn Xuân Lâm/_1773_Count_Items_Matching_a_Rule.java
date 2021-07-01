import java.util.List;

public class _1773_Count_Items_Matching_a_Rule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int position = 0;
        if(ruleKey.equals("type")){
            position = 0;
        }else if(ruleKey.equals("color")){
            position = 1;
        }else{
            position = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if(item.get(position) == ruleValue){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
