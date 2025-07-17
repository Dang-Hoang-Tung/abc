import java.util.Arrays;

public class Solution {
    public static String[] sortAndReverseDigits(int[] arr) {
        
        int[] filteredArray = Arrays.stream(arr)
                                     .filter(num -> num >= 1 && num <= 9)
                                     .toArray();

        
        Arrays.sort(filteredArray);

        
        for (int i = 0; i < filteredArray.length / 2; i++) {
            int temp = filteredArray[i];
            filteredArray[i] = filteredArray[filteredArray.length - 1 - i];
            filteredArray[filteredArray.length - 1 - i] = temp;
        }

        
        String[] result = new String[filteredArray.length];
        for (int i = 0; i < filteredArray.length; i++) {
            switch (filteredArray[i]) {
                case 1:
                    result[i] = "One";
                    break;
                case 2:
                    result[i] = "Two";
                    break;
                case 3:
                    result[i] = "Three";
                    break;
                case 4: