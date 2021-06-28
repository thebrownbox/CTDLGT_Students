public class __1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> s: items){
            String type = s.get(0);
            String color = s.get(1);
            String name = s.get(2);
            if(type.equals(ruleKey)&&type.equals(ruleValue)){
                count++;
            }
            else if(color.equals(ruleKey)&&color.equals(ruleValue)){
                count++;
            }else if(name.equals(ruleKey)&&name.equals(ruleValue)){
                count++;
            }
        }
    return count;
    }
}
