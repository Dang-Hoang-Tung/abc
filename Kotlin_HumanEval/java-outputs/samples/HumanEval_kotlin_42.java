public class Solution {
    public String change_base(int x, int base) {
        
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(x % base);
            x /= base;
        }
        return sb.reverse().toString();
    }
}