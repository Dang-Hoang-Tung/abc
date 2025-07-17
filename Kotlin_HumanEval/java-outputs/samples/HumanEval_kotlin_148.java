import java.util.List;

public class DoubleTheDifference {
    public static int double_the_difference(List<Integer> nums) {
        
        int sum = 0;
        
        
        for (int num : nums) {
            
            if (num > 0 && num % 1 == 0) {
                
                if (num % 2 != 0) {
                    
                    sum += num * num;
                }
            }
        }
        
        
        return sum;
    }
}