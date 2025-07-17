public class Solution {
    public boolean checkIfLastCharIsALetter(String str) {
        
        if (str.isEmpty() || str.charAt(str.length() - 1) != ' ') {
            return false;
        }

        
        str = str.trim();

        
        char lastChar = str.charAt(str.length() - 1);

        
        return Character.isLetter(lastChar);
    }
} 


public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkIfLastCharIsALetter("apple pie")); 
        System.out.println(solution.checkIfLastCharIsALetter("apple pi e")); 
        System.out.println(solution.checkIfLastCharIsALetter("apple pi e ")); 
        System.out.println(solution.checkIfLastCharIsALetter("")); 
    }
}