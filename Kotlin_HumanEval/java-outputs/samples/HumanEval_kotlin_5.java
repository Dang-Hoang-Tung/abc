import java.util.ArrayList;
import java.util.List;

public class Intersperse {
    public static List<Integer> intersperse(List<Integer> numbers, int delimiter) {
        
        List<Integer> result = new ArrayList<>();

        
        for (int i = 0; i < numbers.size(); i++) {
            
            result.add(numbers.get(i));

            
            if (i < numbers.size() - 1) {
                result.add(delimiter);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(intersperse(new ArrayList<>(), 4)); 
        System.out.println(intersperse(new ArrayList<>(List.of(1, 2, 3)), 4)); 
    }
}