public class RoundAwayFromZero {
    public static int closestInteger(String num) {
        double n = Double.parseDouble(num);
        double floor = Math.floor(n);
        double ceil = Math.ceil(n);

        if (n - floor == 0.5 || ceil - n == 0.5) {
            return (int) (n > 0 ? ceil : floor);
        } else {
            return (int) Math.round(n);
        }
    }

    public static void main(String[] args) {
        System.out.println(closest_integer("10")); 
        System.out.println(closest_integer("15.3")); 
        System.out.println(closest_integer("14.5")); 
        System.out.println(closest_integer("-14.5")); 
    }
}