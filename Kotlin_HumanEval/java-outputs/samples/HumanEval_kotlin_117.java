import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[] maxKNumbers(int[] arr, int k) {
        
        Arrays.sort(arr);
        
        Collections.reverse(Arrays.asList(arr));
        
        int[] result = new int[k];
        
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        
        return result;
    }
}