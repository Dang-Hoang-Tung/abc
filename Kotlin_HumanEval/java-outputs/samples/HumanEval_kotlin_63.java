public class UpperCaseSum {

    public static int digitSum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += c;
            }
        }
        return sum;
    }

}