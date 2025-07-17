import java.util.*;

public class Histogram {
    public static Map<String, Integer> histogram(String s) {
        
        if (s.isEmpty()) {
            return new HashMap<>();
        }

        String[] words = s.split(" ");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = Collections.max(frequencyMap.values());

        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}