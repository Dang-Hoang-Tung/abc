public class Solution {
    public static String circularShift(int x, int shift) {
        
        String str = Integer.toString(x);
        int len = str.length();
        
        
        if (shift > len) {
            return new StringBuilder(str).reverse().toString();
        }
        
        
        
        int index = len - shift % len;
        String shifted = str.substring(index) + str.substring(0, index);
        
        return shifted;
    }
}