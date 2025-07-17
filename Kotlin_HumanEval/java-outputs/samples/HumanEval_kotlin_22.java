import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Integer> filter_integers(List<Object> input) {
        List<Integer> result = new ArrayList<>();
        for (Object item : input) {
            if (item instanceof Integer) {
                result.add((Integer) item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(filter_integers(new ArrayList<>(List.of('a', 3.14, 5)))); 
        System.out.println(filter_integers(new ArrayList<>(List.of(1, 2, 3, 'abc', new Object(), new ArrayList<>())))); 
    }
}