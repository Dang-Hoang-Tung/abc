import java.util.*;

public class UniqueDigits {
    public static List<Integer> unique_digits(List<Integer> x) {
        
        List<Integer> result = new ArrayList<>();
        for (int num : x) {
            if (hasNoEvenDigits(num)) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }

    private static boolean hasNoEvenDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> test1 = Arrays.asList(15, 33, 1422, 1);
        System.out.println(unique_digits(test1)); 

        List<Integer> test2 = Arrays.asList(152, 323, 1422, 10);
        System.out.println(unique_digits(test2)); 
    }
}