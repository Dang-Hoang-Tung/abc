import java.util.List;
import java.util.ArrayList;

public class PositiveNumbers {
    public static List<Integer> get_positive(List<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num > 0) {
                result.add(num);
            }
        }
        return result;
    }

    
    public static void main(String[] args) {
        System.out.println(get_positive(new ArrayList<>(List.of(-1, 2, -4, 5, 6))).equals(new ArrayList<>(List.of(2, 5, 6))));
        System.out.println(get_positive(new ArrayList<>(List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))).equals(new ArrayList<>(List.of(5, 3, 2, 3, 9, 123, 1))));
    }
}