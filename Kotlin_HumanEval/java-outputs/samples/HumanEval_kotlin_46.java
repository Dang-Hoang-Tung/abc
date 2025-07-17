// true
// true
// true
// false

// Explanation:
// The function `is_palindrome` checks if the given string `s` is a palindrome.
// It uses two pointers, `left` and `right`, to compare characters from both ends of the string.
// If any pair of characters does not match, it returns `false`.
// If all pairs of characters match, it returns `true`.
Output:
 




public class Solution {
    public static boolean is_palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
} 



public class Main {
    public static void main(String[] args) {
        System.out.println(is_palindrome(""));
        System.out.println(is_palindrome("aba"));
        System.out.println(is_palindrome("aaaaa"));
        System.out.println(is_palindrome("zbcd"));
    }
}