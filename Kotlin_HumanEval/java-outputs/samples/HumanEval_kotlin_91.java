import java.util.*;
import java.lang.*;

class Solution {
    public int solution(List<Integer> lst) {
        
        int largestPrime = lst.stream()
                .filter(this::isPrime)
                .max(Integer::compare)
                .orElse(0);

        
        if (largestPrime == 0) {
            return 0;
        }

        
        int sumOfDigits = String.valueOf(largestPrime)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        return sumOfDigits;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}