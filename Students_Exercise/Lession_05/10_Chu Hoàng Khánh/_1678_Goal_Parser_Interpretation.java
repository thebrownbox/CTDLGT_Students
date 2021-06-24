public class _1678_Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
    
    public static String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length();) {
            if (command.charAt(i) == 'G') { 
                result += "G";
                i++;
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result += "o";  
                i += 2;
            }
            else {
                result += "al";
                i += 4;
            }
        }
        return result;
    }
}
