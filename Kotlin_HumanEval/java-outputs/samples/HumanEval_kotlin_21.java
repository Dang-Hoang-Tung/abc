public class RescaleToUnit {

    public static double[] rescaleToUnit(double[] nums) {
        
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        
        double[] result = new double[nums.length];

        
        for (int i = 0; i < nums.length; i++) {
            result[i] = (nums[i] - min) / (max - min);
        }

        return result;
    }

    public static void main(String[] args) {
        double[] nums = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] rescaled = rescaleToUnit(nums);

        
        for (double num : rescaled) {
            System.out.print(num + " ");
        }
    }
}