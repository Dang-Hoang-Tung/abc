import java.util.Arrays;

public class Solution {
    public static int[] sortArray(int[] arr) {
        
        if (arr.length == 0) {
            return new int[0];
        }

        
        int sum = arr[0] + arr[arr.length - 1];

        
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        
        if (sum % 2 == 0) {
            
            Arrays.sort(sortedArr);
            for (int i = 0; i < sortedArr.length / 2; i++) {
                int temp = sortedArr[i];
                sortedArr[i] = sortedArr[sortedArr.length - 1 - i];
                sortedArr[sortedArr.length - 1 - i] = temp;
            }
        } else {
            
            Arrays.sort(sortedArr);
        }

        return sortedArr;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString