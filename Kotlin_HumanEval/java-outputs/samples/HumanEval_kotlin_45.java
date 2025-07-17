import java.util.Arrays;

public class Solution {
    public static double median(int[] l) {
        
        Arrays.sort(l);

        int n = l.length;
        if (n % 2 == 0) {
            
            return (l[n / 2 - 1] + l[n / 2]) / 2.0;
        } else {
            
            return l[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] testArray1 = {3, 1, 2, 4, 5};
        System.out.println(median(testArray1)); 

        int[] testArray2 = {-10, 4, 6, 1000, 10, 20};
        System.out.println(median(testArray2)); 
    }
}