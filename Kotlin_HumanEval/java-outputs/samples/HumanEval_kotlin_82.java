public class Solution {
    public static int add(int[] lst) {
        int sum = 0;
        for (int i = 1; i < lst.length; i += 2) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            }
        }
        return sum;
    }
} 


System.out.println(Solution.add(new int[]{4, 2, 6, 7})); 
System.out.println(Solution.add(new int[]{1, 3, 5, 7, 9})); 
System.out.println(Solution.add(new int[]{2, 4, 6, 8, 10})); 
System.out.println(Solution.add(new int[]{10, 20, 30, 40, 50})); 
System.out.println(Solution.add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); 
System.out.println(S