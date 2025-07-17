public class Solution {
    public static int fibfib(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
} 


System.out.println(fibfib(1)); 
System.out.println(fibfib(5)); 
System.out.println(fibfib(8));