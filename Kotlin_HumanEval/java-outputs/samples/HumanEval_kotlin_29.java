import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> filter_by_prefix(List<String> strings, String prefix) {
        
        List<String> filteredStrings = new ArrayList<>();

        
        for (String str : strings) {
            
            if (str.startsWith(prefix)) {
                
                filteredStrings.add(str);
            }
        }

        
        return filteredStrings;
    }

    public static void main(String[] args) {
        
        System.out.println(filter_by_prefix(new ArrayList<>(), "a")); 
        System.out.println(filter_by_prefix(new ArrayList<>(List.of("abc", "bcd", "cde", "array")), "a")); 
    }
}