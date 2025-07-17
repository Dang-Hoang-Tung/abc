import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> filter_by_substring(List<String> strings, String substring) {
        
        List<String> filteredStrings = new ArrayList<>();

        
        for (String str : strings) {
            
            if (str.contains(substring)) {
                
                filteredStrings.add(str);
            }
        }

        
        return filteredStrings;
    }
}