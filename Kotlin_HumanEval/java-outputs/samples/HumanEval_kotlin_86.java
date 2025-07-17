public class Main {
    public static void main(String[] args) {
        System.out.println(encrypt("hi"));
        System.out.println(encrypt("asdfghjkl"));
        System.out.println(encrypt("gf"));
        System.out.println(encrypt("et"));
    }

    
    public static String encrypt(String str) {
        
        StringBuilder encrypted = new StringBuilder();

        
        for (char c : str.toCharArray()) {
            
            if (c >= 'a' && c <= 'z') {
                
                char newChar = (char) ((c - 'a' + 4) % 26 + 'a');
                
                encrypted.append(newChar);
            } else {
                
                encrypted.append(c);
            }
        }

        
        return encrypted.toString();
    }
}