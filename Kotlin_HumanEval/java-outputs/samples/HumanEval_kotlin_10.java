public class Solution {
    public String makePalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j) return s;
        return s + new StringBuilder(s.substring(0, i)).reverse().toString();
    }
} 


System.out.println(make_palindrome("")); 
System.out.println(make_palindrome("cat")); 
System.out.println(make_palindrome("cata"));