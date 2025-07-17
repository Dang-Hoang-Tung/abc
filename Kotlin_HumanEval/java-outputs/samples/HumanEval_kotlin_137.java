public class Solution {
    public String fixSpaces(String text) {
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                count++;
                continue;
            }
            if (count > 2) {
                sb.append('-');
                count = 0;
            } else if (count > 0) {
                sb.append('_');
            }
            sb.append(c);
        }
        if (count > 0) {
            sb.append('_');
        }
        return sb.toString();
    }
}