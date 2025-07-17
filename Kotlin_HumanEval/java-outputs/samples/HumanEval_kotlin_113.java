import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort_array(new int[]{1, 5, 2, 3, 4})));
        System.out.println(Arrays.toString(sort_array(new int[]{-2, -3, -4, -5, -6})));
        System.out.println(Arrays.toString(sort_array(new int[]{1, 0, 2, 3, 4})));
    }

    public static int[] sort_array(int[] arr) {
        
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                
                int count1 = Integer.bitCount(o1);
                int count2 = Integer.bitCount(o2);

                
                if (count1 == count2) {
                    return o1 - o2;
                }

                
                return count1 - count2;
            }
        });

        return arr;
    }
}