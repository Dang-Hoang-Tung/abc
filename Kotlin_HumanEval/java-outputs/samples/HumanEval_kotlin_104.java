public class Solution {
    public int[] countPalindrome(int n) {
        
        int[] result = new int[2];
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 0) {
                    result[0]++;
                } else {
                    result[1]++;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}