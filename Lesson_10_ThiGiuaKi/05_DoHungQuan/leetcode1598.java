package BT.KT;

public class leetcode1598 {
    public static int minOperations(String[] logs) {
//The Leetcode file system keeps a log each time some user performs a change folder operation.
//
//The operations are described below:
//
//    "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
//    "./" : Remain in the same folder.
//    "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
        int count = 0;
        int n = logs.length;
        String one = "../";
        String two = "./";

        for (int i =0;i<n;i++) {
            if (logs[i].equals(one)){
                if (count > 0){
                    count--;
                }
            }else if (logs[i].equals(two)){
                continue;
            }else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        String[] log1 = {"d1/","d2/","./","d3/","../","d31/"};
        String[] log2 = {"./","ho3/","tl8/"};

        System.out.println(minOperations(logs));
        System.out.println(minOperations(log1));
        System.out.println(minOperations(log2));

    }
}
