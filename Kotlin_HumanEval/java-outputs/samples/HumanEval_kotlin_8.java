import java.util.List;
import java.util.Optional;

public class SumProductCalculator {

    public static Tuple<Integer, Integer> sum_product(List<Integer> numbers) {
        int sum = 0;
        int product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        return new Tuple<>(sum, product);
    }

    
    public static class Tuple<X, Y> {
        private final X x;
        private final Y y;

        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        public X getX() {
            return x;
        }

        public Y getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    
    public static void main(String[] args) {
        System.out.println(sum_product(new ArrayList<>()).equals(new Tuple<>(0, 1))); 
        System.out.println(sum_product(Arrays.asList(1, 2, 3, 4)).equals(new Tuple<>(10, 24))); 
    }