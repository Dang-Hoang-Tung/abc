Output:
 




import java.util.*;

public class Solution {
    public static boolean triples_sum_to_zero(List<Integer> arr) {
        
        int n = arr.size();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 0);
        System.out.println(triples_sum_to_zero(arr1)); 

        List<Integer> arr2 = Arrays.asList(1, 3, -2, 1);
        System.out.println(triples_sum_to_zero(arr2)); 

        List<Integer> arr3 = Arrays.asList(1, 2, 3, 7);
        System.out.println(triples_sum_to_zero(arr3));