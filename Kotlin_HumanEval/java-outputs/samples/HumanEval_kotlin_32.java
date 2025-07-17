import java.util.Arrays;
import java.util.List;

public class SortThird {
    public static List<Integer> sortThird(List<Integer> l) {
        
        List<Integer> sortedElements = new ArrayList<>();
        
        
        for (int i = 2; i < l.size(); i += 3) {
            sortedElements.add(l.get(i));
        }
        
        
        Collections.sort(sortedElements);
        
        
        List<Integer> result = new ArrayList<>(l);
        
        
        for (int i = 2, j = 0; i < l.size(); i += 3, j++) {
            result.set(i, sortedElements.get(j));
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(sortThird(Arrays.asList(1, 2, 3))); 
        System.out.println(sortThird(Arrays.asList(5, 6, 3