public class Solution {
    public int countNumbersWith1AsDigit(int n) {
        
        if (n == 1) {
            return 1;
        }
        
        
        
        
        
        
        return 2 * (int)Math.pow(10, n - 1) - 10;
    }
}