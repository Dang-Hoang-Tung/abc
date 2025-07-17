public class MeanAbsoluteDeviation {
    public static double mean_absolute_deviation(double[] data) {
        
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        double mean = sum / data.length;

        
        double madSum = 0;
        for (double num : data) {
            madSum += Math.abs(num - mean);
        }

        
        return madSum / data.length;
    }

    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0, 4.0};
        System.out.println("Mean Absolute Deviation: " + mean_absolute_deviation(data));
    }
}