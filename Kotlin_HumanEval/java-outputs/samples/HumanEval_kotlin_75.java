public class HexPrimes {
    public static int countHexPrimes(String num) {
        
        String primeHexDigits = "2357BD";
        int count = 0;

        
        for (int i = 0; i < num.length(); i++) {
            
            if (primeHexDigits.indexOf(num.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
} 


System.out.println(countHexPrimes("AB")); 
System.out.println(countHexPrimes("1077E")); 
System.out.println(countHexPrimes("ABED1A33")); 
System.out.println(countHexPrimes("123456789ABCDEF0")); 
System.out.println(countHexPrimes("2020"));