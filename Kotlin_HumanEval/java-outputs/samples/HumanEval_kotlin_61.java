public class Solution {
    public int vowels_count(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
            if (c == 'y' || c == 'Y') {
                if (i == word.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}