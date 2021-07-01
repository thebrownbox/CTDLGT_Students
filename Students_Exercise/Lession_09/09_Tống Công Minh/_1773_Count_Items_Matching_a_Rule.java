
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1773_Count_Items_Matching_a_Rule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = -1;
        String[] ruleK = {"type", "color", "name"};
        for (int i = 0; i < 3; i++) {
            if (ruleK[i].equals(ruleKey)) {
                index = i;
                break;
            }
        }

        int count = 0;
        for (List listItem : items) {
            if (listItem.get(index).equals(ruleValue)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        [["ii","iiiiiii","ii"],["iiiiiii","iiiiiii","ii"],["ii","iiiiiii","iiiiiii"]]
//"color"
//"ii"
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = Arrays.asList("ii","iiiiiii","ii");
        List<String> item2 = Arrays.asList("iiiiiii","iiiiiii","ii");
        List<String> item3 = Arrays.asList("ii","iiiiiii","iiiiiii");
        items.add(item1);
        items.add(item2);
        items.add(item3);
//        countMatches(items, "color", "ii");
    }

}
