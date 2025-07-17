public class Solution {
    public String get_closest_vowel(String str) {
        
        int len = str.length();
        for(int i = len - 1; i > 0; i--) {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                int j = i - 1;
                while(j >= 0 && !isVowel(str.charAt(j))) {
                    j--;
                }
                if(j >= 0 && isVowel(str.charAt(j))) {
                    return String.valueOf(c);
                }
            }
        }
        return "";
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}