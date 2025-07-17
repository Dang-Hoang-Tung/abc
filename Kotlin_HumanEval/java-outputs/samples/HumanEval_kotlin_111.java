public class MinSubArraySum {
    public static int minSubArraySum(int[] nums) {
        
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        
        for (int i = 0; i < nums.length; i++) {
            
            currentSum += nums[i];

            
            if (currentSum < minSum) {
                minSum = currentSum;
            }

            
            if (currentSum > 0) {
                currentSum = 0;
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 1, 2, 4};
        System.out.println(minSubArraySum(nums1)); 

        int[] nums2 = {-1, -2, -3};
        System.out.println(minSubArraySum(nums2));