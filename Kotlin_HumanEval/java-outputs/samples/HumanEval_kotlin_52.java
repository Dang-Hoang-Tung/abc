// 55
// 1
// 21

// Explanation:
// The function `fib` calculates the n-th Fibonacci number using an iterative approach.
// It starts with the base cases: fib(0) = 0 and fib(1) = 1.
// For any other value of n, it iteratively computes the Fibonacci numbers up to n.
// The variables `a`, `b`, and
Output:
 




public class Solution {
    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
} 


public class Main {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(1));
        System.out.println(fib(8));
    }

    public static int fib(int n) {
        return Solution.fib(n);
    }
}