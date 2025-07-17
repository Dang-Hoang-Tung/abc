import java.util.*;

public class UniqueElements {

    public static List<Integer> unique(List<Integer> list) {
        
        Set<Integer> uniqueSet = new HashSet<>(list);

        
        List<Integer> sortedList = new ArrayList<>(uniqueSet);
        Collections.sort(sortedList);

        return sortedList;
    }

    public static void main(String[] args) {
        
        List<Integer> testList = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        System.out.println(unique(testList)); 
    }
}