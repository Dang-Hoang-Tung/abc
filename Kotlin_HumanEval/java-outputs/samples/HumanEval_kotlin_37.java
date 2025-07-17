import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime_fib(n));
    }

    public static BigInteger prime_fib(int n) {
        
        if (n == 1) return new BigInteger("2");
        if (n == 2) return new BigInteger("3");

        BigInteger prev = new BigInteger("2");
        BigInteger current = new BigInteger("3");
        int count = 2;

        while (count < n) {
            BigInteger next = current.add(prev);
            prev = current;
            current = next;

            if (isPrime(next)) {
                count++;
            }
        }

        return current;
    }

    private static boolean isPrime(BigInteger num) {
        if (num.compareTo(new BigInteger("2")) < 0) return false;
        if (num.mod(new BigInteger("2")).equals(BigInteger.ZERO)) return num.equals(new BigInteger("2"));

        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(num) <= 0; i = i.add(new BigInteger("2"))) {
            if (num.mod(i).