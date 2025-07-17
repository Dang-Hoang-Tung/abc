public class CountNums {
    public static int count_nums(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (sum_of_digits(num) > 0) {
                count++;
            }
        }
        return count;
    }

    private static int sum_of_digits(int num) {
        int sum = 0;
        boolean isNegative = num < 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * (isNegative ? -1 : 1);
            num /= 10;
        }
        return sum;
    }
}