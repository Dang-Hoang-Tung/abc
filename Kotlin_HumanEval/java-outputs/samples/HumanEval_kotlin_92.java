import java.util.*;

public class Solution {
    public static boolean check_dict_case(Map<Object, Object> dict) {
        
        if (dict.isEmpty()) {
            return false;
        }

        
        Object firstKey = dict.keySet().iterator().next();
        boolean allLowerCase = firstKey instanceof String && ((String) firstKey).matches("[a-z]+");
        boolean allUpperCase = firstKey instanceof String && ((String) firstKey).matches("[A-Z]+");

        
        for (Object key : dict.keySet()) {
            if (!(key instanceof String)) {
                return false; 
            }
            if (allLowerCase && !((String) key).matches("[a-z]+")) {
                return false; 
            }
            if (allUpperCase && !((String) key).matches("[A-Z]+")) {
                return false; 
            }
        }

        
        return true;
    }

    public static void