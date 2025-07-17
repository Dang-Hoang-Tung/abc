// 1 
Output:
 




public class Solution {
    public static int[] derivative(int[] xs) {
        
        int[] result = new int[xs.length - 1];
        for (int i = 1; i < xs.length; i++) {
            result[i-1] = xs[i] * i;
        }
        return result;
    }
} 




public class Main {
    public static void main(String[] args) {
        int[] xs = {3, 1, 2, 4, 5};
        int[] result = Solution.derivative(xs);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}