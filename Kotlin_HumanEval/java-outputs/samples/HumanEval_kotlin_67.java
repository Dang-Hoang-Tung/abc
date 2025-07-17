import java.util.List;
import java.util.Collections;

public class StrangeSorter {
    public static List<Integer> strangeSortList(List<Integer> numbers) {
        
        List<Integer> sortedList = new ArrayList<>(numbers);

        
        Collections.sort(sortedList);

        
        int minIndex = 0;
        int maxIndex = sortedList.size() - 1;

        
        List<Integer> resultList = new ArrayList<>();

        
        while (minIndex <= maxIndex) {
            if (minIndex == maxIndex) {
                
                resultList.add(sortedList.get(minIndex));
                break;
            }

            
            resultList.add(sortedList.get(minIndex++));

            
            resultList.add(sortedList.get(maxIndex--));
        }

        return resultList;
    }
}