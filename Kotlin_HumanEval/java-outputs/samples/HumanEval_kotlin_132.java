public class Solution {
    public static int canArrange(int[] arr) {
        
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                return i;
            }
        }
        return -1;
    }
} 


System.out.println(can_arrange(new int[]{1,2,4,3,5})); 
System.out.println(can_arrange(new int[]{1,2,3})); 
System.out.println(can_arrange(new int[]{5,4,3,2,1})); 
System.out.println(can_arrange(new int[]{1,3,2,4,5})); 
System.out.println(can_arrange(new int[]{1,2,3,4,5})); 
System.out.println(can_arrange(new int[]{1,2,3,4,5,6})); 
System.out.println(can_arrange(new int[]{1,2,3,4,