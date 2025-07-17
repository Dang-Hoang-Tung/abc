public class PrimeLength {

    public static boolean prime_length(String str) {
        int length = str.length();
        if (length <= 1) {
            return false;
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return false;
            }
        }
        return true;
    }

} 


System.out.println(prime_length("Hello")); 
System.out.println(prime_length("abcdcba")); 
System.out.println(prime_length("kittens")); 
System.out.println(prime_length("orange"));