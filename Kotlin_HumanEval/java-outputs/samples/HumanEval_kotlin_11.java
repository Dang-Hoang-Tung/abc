public class Solution {
    public String string_xor(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        return sb.toString();
    }
}