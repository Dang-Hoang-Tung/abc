public class Solution {
    public int sumOfTwoDigits(int[] arr, int k) {
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] >= 10 && arr[i] <= 99) {
                sum += arr[i];
            }
        }
        return sum;
    }
} 


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {111, 21, 3, 4000, 5, 6, 7, 8, 9};
        int k = 4;
        System.out.println(solution.sumOfTwoDigits(arr, k)); 
    }
}