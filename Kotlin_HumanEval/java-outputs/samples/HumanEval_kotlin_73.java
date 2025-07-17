public class SimplePower {
    public static boolean isSimplePower(int x, int n) {
        
        return Math.pow(n, (int) Math.round(Math.log(x) / Math.log(n))) == x;
    }
}