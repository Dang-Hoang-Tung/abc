public class Solution {
    public String match_parens(String[] parens) {
        
        int open = 0;
        for (String paren : parens) {
            for (char c : paren.toCharArray()) {
                if (c == '(') {
                    open++;
                } else {
                    open--;
                }
                if (open < 0) {
                    return "No";
                }
            }
        }
        return open == 0 ? "Yes" : "No";
    }
}