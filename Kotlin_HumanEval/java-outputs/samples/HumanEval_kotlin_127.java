import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> tribonacci(int n) {
        
        List<Integer> result = new ArrayList<>();
        
        
        if (n == 0) {
            result.add(1);
            return result;
        }
        if (n == 1) {
            result.add(1);
            result.add(3);
            return result;
        }
        
        
        result.add(1);
        result.add(3);
        result.add(2);
        
        
        for (int i = 3; i <= n; i++) {
            int nextElement = result.get(i - 1) + result.get(i - 2) + result.get(i - 3);
            result.add(nextElement);
        }
        
        return result;
    }
}