public class Main {
    public static boolean any_int(int a, int b, int c) {
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public static void main(String[] args) {
        System.out.println(any_int(5, 2, 7)); 
        System.out.println(any_int(3, 2, 2)); 
        System.out.println(any_int(3, -2, 1)); 
        System.out.println(any_int(3.6, -2.2, 2)); 
    }
}