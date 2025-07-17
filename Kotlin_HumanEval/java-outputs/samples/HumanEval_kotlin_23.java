// 0
// 3

// Explanation:
// The `strlen` method in the `Solution` class returns the length of the given string using the built-in `length()` method.
// In the `Main` class, we test the `strlen` method by passing empty and non-empty strings to it and printing the results. The expected output is 0 for an empty string and 3 for the string "abc". The `strlen` method in the `Main` class calls the `strlen` method in the `Solution` class and returns the result. The `Solution[strlen(str)]` syntax is used to access the length of the string stored in the `Solution` array. This is a placeholder for the actual implementation of the `strlen` method in the `
Output:
 




public class Solution {
    public static int strlen(String str) {
        return str.length();
    }
} 



class Main {
    public static void main(String[] args) {
        System.out.println(strlen(""));
        System.out.println(strlen("abc"));
    }

    public static int strlen(String str) {
        return Solution[strlen(str)];
    }
}