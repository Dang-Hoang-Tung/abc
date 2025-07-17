import java.util.List;
import java.util.ArrayList;

public class RollingMax {
    public static List<Integer> rolling_max(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.isEmpty()) {
            return result;
        }
        int max = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 2, 3, 4, 2));
        List<Integer> output = rolling_max(input);
        System.out.println(output); 
    }
}