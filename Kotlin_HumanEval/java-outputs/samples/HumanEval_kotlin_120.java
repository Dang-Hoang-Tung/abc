import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> get_odd_collatz(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        while (n != 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        result.add(1); 
        Collections.sort(result); 
        return result;
    }
}