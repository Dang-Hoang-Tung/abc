import java.util.List;
import java.util.ArrayList;

public class IncrementList {

    public static List<Integer> incr_list(List<Integer> numbers) {
        
        List<Integer> incrementedNumbers = new ArrayList<>();

        
        for (Integer number : numbers) {
            
            incrementedNumbers.add(number + 1);
        }

        
        return incrementedNumbers;
    }

    public static void main(String[] args) {
        
        System.out.println(incr_list(new ArrayList<>(List.of(1, 2, 3)))); 
        System.out.println(incr_list(new ArrayList<>(List.of(5, 3, 5, 2, 3, 3, 9, 0, 123)))); 
    }
}