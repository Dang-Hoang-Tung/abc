public class Solution {
    public String string_sequence(int n) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(i);
        }
        return sb.toString();
    }
}