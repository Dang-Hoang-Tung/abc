import java.util.*;

public class MaxUniqueChars {
    public static String findMax(String[] arr) {
        
        Map<String, Set<Character>> uniqueCharCount = new HashMap<>();

        
        for (String str : arr) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }
            uniqueCharCount.put(str, uniqueChars);
        }

        
        
        Arrays.sort(arr, (a, b) -> {
            int sizeA = uniqueCharCount.get(a).size();
            int sizeB = uniqueCharCount.get(b).size();

            if (sizeA == sizeB) {
                return a.compareTo(b);
            } else {
                return sizeB - sizeA;
            }
        });

        
        return arr[0];
    }

    public static void main(String[] args) {
        String[] arr1 = {"name", "of