import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {
    public static List<Integer> count_up_to(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n <= 2) return primes; 

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; 
        }
        return true;
    }
}