import java.util.*;

class Solution {
    public int[] minPath(int[][] grid, int k) {
        
    }
} 


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        Solution sol = new Solution();
        int[] result = sol.minPath(grid, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}