import java.util.Arrays;

public class FindClosestElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find_closest_elements(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 2.2})));
        System.out.println(Arrays.toString(find_closest_elements(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 2.0})));
    }

    public static double[] find_closest_elements(double[] nums) {
        
        Arrays.sort(nums);

        
        double minDiff = Double.MAX_VALUE;
        double[] closestPair = new double[2];

        
        for (int i = 0; i < nums.length - 1; i++) {
            double diff = nums[i + 1] - nums[i];
            if (diff < minDiff) {
                minDiff = diff;
                closestPair[0] = nums[i];
                closestPair[1] = nums[i + 1];
            }
        }