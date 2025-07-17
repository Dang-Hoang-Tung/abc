public class Solution {
    public boolean is_equal_to_sum_even(int n) {
        
        if (n < 8) {
            return false;
        }
        
        if (n % 2 != 0) {
            return false;
        }
        
        return true;
    }
}