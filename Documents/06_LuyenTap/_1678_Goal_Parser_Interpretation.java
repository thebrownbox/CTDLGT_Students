/**
 * _1678_Goal_Parser_Interpretation
 */
public class _1678_Goal_Parser_Interpretation {
    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    public static void main(String[] args) {
        interpret("G()(al)");
    }
    
}