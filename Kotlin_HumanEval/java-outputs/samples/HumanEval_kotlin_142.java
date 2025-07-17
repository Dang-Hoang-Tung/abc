import java.util.*;

public class Solution {
    public static List<Integer> order_by_points(List<Integer> nums) {
        
        Comparator<Integer> digitSumComparator = (num1, num2) -> {
            int sum1 = getDigitSum(num1);
            int sum2 = getDigitSum(num2);

            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            } else {
                return Integer.compare(nums.indexOf(num1), nums.indexOf(num2));
            }
        };

        
        Collections.sort(nums, digitSumComparator);

        return nums;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += Math.abs(num % 10);
            num /= 10;
        }
        return sum;
    }
}