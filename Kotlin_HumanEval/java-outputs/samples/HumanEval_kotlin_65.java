import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<Integer> pluck(List<Integer> nodes) {
        
        int smallestEvenValue = Integer.MAX_VALUE;
        int smallestIndex = -1;

        
        for (int i = 0; i < nodes.size(); i++) {
            int currentValue = nodes.get(i);
            if (currentValue % 2 == 0 && currentValue < smallestEvenValue) {
                smallestEvenValue = currentValue;
                smallestIndex = i;
            }
        }

        
        if (smallestIndex == -1) {
            return new ArrayList<>();
        }

        
        return new ArrayList<>(List.of(smallestEvenValue, smallestIndex));
    }
}