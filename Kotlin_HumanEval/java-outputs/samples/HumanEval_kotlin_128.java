public class Solution {
    public int digits(int n) {
        
        String numStr = Integer.toString(n);
        
        
        int product = 1;
        
        
        boolean hasOddDigit = false;
        
        
        for (char c : numStr.toCharArray()) {
            
            int digit = Character.getNumericValue(c);
            
            
            if (digit % 2 != 0) {
                
                product *= digit;
                
                
                hasOddDigit = true;
            }
        }
        
        
        return hasOddDigit ? product : 0;
    }
}