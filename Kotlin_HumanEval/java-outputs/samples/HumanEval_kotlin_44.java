public class Solution {
    public int fib4(int n) {
        
        if (n < 2) return 0;
        if (n == 2) return 2;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
        }

        return dp[n];
    }
}