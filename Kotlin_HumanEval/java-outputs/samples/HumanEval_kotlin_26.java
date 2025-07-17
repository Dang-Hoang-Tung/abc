import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (frequencyMap.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4);
        System.out.println(removeDuplicates(numbers));
    }
}