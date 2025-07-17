// 12
// 9
// 0

// Explanation:
// In the first example, the odd numbers at even indices are 5 and 1. The sum is 5 + 1 = 6.
// In the second example, the odd number at an even index is 3. The sum is 3.
//
Output:
 




public class Solution {
    public static int solution(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
} 



class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 8, 7, 1}));
        System.out.println(solution(new int[]{3, 3, 3, 3, 3}));
        System.out.println(solution(new int[]{30, 13, 24, 321}));
    }
}