package FinalTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quang_609 {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        List<List<String>> res = findDuplicate(paths);

        for(var list:res){
            System.out.print("[");
            for(var item:list)
                System.out.print(item + ",");
            System.out.print("]");
        }
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] files = path.split(" ");
            String dir = files[0];
            for (int i = 1; i < files.length; i++) {
                StringBuilder filename = new StringBuilder();
                StringBuilder content = new StringBuilder();
                String s = files[i];
                int index = s.indexOf('(');
                for (int j = 0; j < index; j++) {
                    char c = s.charAt(j);
                    filename.append(c);
                }

                for (int j = index + 1; j < s.length() - 1; j++) {
                    char c = s.charAt(j);
                    content.append(c);
                }
                String name = dir + "/" + filename.toString();
                String contentString = content.toString();
                if (!map.containsKey(contentString)) {
                    map.put(contentString, new ArrayList<>());
                }

                map.get(contentString).add(name);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                result.add(list);
            }
        }
        return result;
    }
}



