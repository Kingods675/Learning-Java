import java.util.Stack;

public class code {
    public static void main(String[] args) {
        System.out.println(isValidParentheses("([{}]  {)}"));
    }

    public static boolean isValidParentheses(String code) {
        Stack<String> parentheses = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            String s = String.valueOf(code.charAt(i));
            if (s.equals("(") || s.equals("[") || s.equals("{")) {
                parentheses.push(s);
                System.out.println("Added: " + parentheses);
            } else if (s.equals(")") || s.equals("]") || s.equals("}")) {
                String removedString = parentheses.pop();
                System.out.println("Removed" + parentheses);

                if (s.equals(")") && !removedString.equals("(")) return false;
                else if (s.equals("]") && !removedString.equals("[")) return false;
                else if (s.equals("}") && !removedString.equals("{")) return false;
                }
            }
        return true;
        }
    }

