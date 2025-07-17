import java.util.Arrays;
import java.util.Collections;

public class SortEven {
    public static void main(String[] args) {
        
        System.out.println(sortEven(new int[]{1, 2, 3}));
        System.out.println(sortEven(new int[]{5, 6, 3, 4}));
    }

    public static int[] sortEven(int[] l) {
        
        ArrayList<Integer> evenIndices = new ArrayList<>();
        for (int i = 0; i < l.length; i += 2) {
            evenIndices.add(l[i]);
        }
        
        Collections.sort(evenIndices);
        
        int[] result = new int[l.length];
        
        for (int i = 1; i < l.length; i += 2) {
            result[i] = l[i];
        }
        
        for (int i = 0; i < evenIndices.size(); i++) {
            result[i * 2] = evenIndices.get(i);
        }
        return result;