import java.util.List;
import java.util.ArrayList;

public class OddCount {
    public static List<String> odd_count(List<String> nums) {
        
        List<String> result = new ArrayList<>();

        
        for (String num : nums) {
            int count = 0;

            
            for (char c : num.toCharArray()) {
                if ((c - '0') % 2 != 0) {
                    count++;
                }
            }

            
            String formattedResult = "the number of odd elements " + count + "n the str" + count + "ng " + count + " of the " + count + "nput.";
            result.add(formattedResult);
        }

        return result;
    }
}