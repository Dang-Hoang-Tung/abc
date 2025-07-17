import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<String> separate_paren_groups(String s) {
        
        s = s.replaceAll("\\s", "");

        ArrayList<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();

                if (stack.isEmpty()) {
                    
                    result.add(s.substring(start, i + 1));
                    start = i + 1;
                }
            }
        }

        return result;
    }
}