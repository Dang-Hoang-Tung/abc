public class Simplify {

    public static boolean simplify(String x, String n) {
        
        String[] xParts = x.split("/");
        String[] nParts = n.split("/");

        int xNumerator = Integer.parseInt(xParts[0]);
        int xDenominator = Integer.parseInt(xParts[1]);
        int nNumerator = Integer.parseInt(nParts[0]);
        int nDenominator = Integer.parseInt(nParts[1]);

        
        int productNumerator = xNumerator * nNumerator;
        int productDenominator = xDenominator * nDenominator;

        
        return productNumerator % productDenominator == 0;
    }

    public static void main(String[] args) {
        
        System.out.println(simplify("1/5", "5/1")); 
        System.out.println(simplify("1/6", "2/1")); 
        System.out.println(simplify("7/10", "10/2")); 
    }
}