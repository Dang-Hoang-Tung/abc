import java.util.*;

public class Solution {
    public static List<String> list_sort(List<String> list) {
        
        list.removeIf(s -> s.length() % 2 != 0);

        
        Collections.sort(list, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return Integer.compare(s1.length(), s2.length());
        });

        return list;
    }

    public static void main(String[] args) {
        
        System.out.println(list_sort(Arrays.asList("aa", "a", "aaa"))); 
        System.out.println(list_sort(Arrays.asList("ab", "a", "aaa", "cd"))); 
    }
}