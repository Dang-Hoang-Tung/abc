// [1, 5
Output:
 




import java.util.*;

public class Solution {
    public static List<Integer> common(List<Integer> a, List<Integer> b) {
        
        Set<Integer> setA = new HashSet<>(a);
        Set<Integer> setB = new HashSet<>(b);

        setA.retainAll(setB);

        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);

        return result;
    }
} 



class Main {
    public static void main(String[] args) {
        System.out.println(common(Arrays.asList(1, 4, 3, 34, 653, 2, 5), Arrays.asList(5, 7, 1, 5, 9, 653, 121)));
        System.out.println(common(Arrays.asList(5, 3, 2, 8), Arrays.asList(3, 2)));
    }

    public static List<Integer> common(List<Integer> a, List<Integer> b) {
        return Solution.common(a, b);
    }
}