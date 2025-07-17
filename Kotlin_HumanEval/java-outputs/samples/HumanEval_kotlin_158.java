public class Solution {
    public String solve(String s) {
        
        boolean hasLetter = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }

        if (!hasLetter) {
            return new StringBuilder(s).reverse().toString();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}