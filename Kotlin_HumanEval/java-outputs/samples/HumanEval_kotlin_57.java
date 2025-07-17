public class SumToN {
    public static int sum_to_n(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum_to_n(30)); 
        System.out.println(sum_to_n(100)); 
        System.out.println(sum_to_n(5)); 
        System.out.println(sum_to_n(10)); 
        System.out.println(sum_to_n(1)); 
    }
}