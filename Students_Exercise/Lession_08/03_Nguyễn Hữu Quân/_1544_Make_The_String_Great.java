import java.util.Arrays;
import java.util.Stack;

public class _1544_Make_The_String_Great {

    public static void main(String[] args) {
        System.out.println( makeGood("qFxXfQo"));
        
    }

    public static String makeGood(String s) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            s1.push(s.charAt(i));
        }
        move(s1, s2);
        move(s2, s1);
        move(s1, s2);
        StringBuilder str = new StringBuilder();
        while(!s2.isEmpty()){
            str.append(s2.pop());
        }
        return str.toString();
        
    }
    
    public static void move(Stack<Character> container, Stack<Character> empty){
        while(!container.isEmpty()){
            char c = container.pop();
            if(c >= 'a' && c <= 'z'){
                if(!empty.isEmpty() && c == empty.peek() + 32){
                    empty.pop();
                }else{
                    empty.push(c);
                }     
            }else{
                if(!empty.isEmpty() && c == empty.peek() - 32){
                    empty.pop();
                }else{
                    empty.push(c);
                }
            }
        }
    }
}
