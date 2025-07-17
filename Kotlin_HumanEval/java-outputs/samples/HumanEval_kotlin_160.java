import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> generateIntegers(int a, int b) {
        
        List<Integer> evenNumbers = new ArrayList<>();

        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        
        for (int i = a; i <= b; i++) {
            
            String str = Integer.toString(i);

            
            boolean allDigitsEven = true;
            for (int j = 0; j < str.length(); j++) {
                int digit = Character.getNumericValue(str.charAt(j));
                if (digit % 2 != 0) {
                    allDigitsEven = false;
                    break;
                }
            }

            
            if (allDigitsEven) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers;
    }

    public static