package lesson10;

import java.util.Stack;

public class Quang_1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs){
        Stack stk = new Stack<>();

        for(String log : logs)
        {
            if(log.equals("../")){
                if(!stk.isEmpty())
                    stk.pop();
            }

            else if(log.equals("./"))
                continue;
            else
                stk.push(log);
        }

        return stk.size();
    }
}
