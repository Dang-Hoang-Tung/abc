import java.util.Stack;

public class Solution {
    public static int[] parse_nested_parens(String input) {
        
        String[] groups = input.split(" ");
        int[] depths = new int[groups.length];

        for (int i = 0; i < groups.length; i++) {
            Stack<Character> stack = new Stack<>();
            int maxDepth = 0;
            for (char c : groups[i].toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                    maxDepth = Math.max(maxDepth, stack.size());
                } else if (c == ')') {
                    stack.pop();
                }
            }
            depths[i] = maxDepth;
        }

        return depths;
    }

    public static void main(String[] args) {
        String input = "(()()) ((())) () ((())()())";
        int[] result = parse_nested_parens(input);
        for (int depth : result) {
            System.out.println(depth);
        }
    }
}