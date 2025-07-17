import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static String[] removeCharsAndCheckPalindrome(String s, String c) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!c.contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }

        String resultString = result.toString();
        boolean isPalindromic = isPalindrome(resultString);

        return new String[]{resultString, String.valueOf(isPalindromic)};
    }
}