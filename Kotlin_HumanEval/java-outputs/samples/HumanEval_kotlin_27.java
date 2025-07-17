public class FlipCase {

    public static String flip_case(String str) {
        
        StringBuilder result = new StringBuilder();

        
        for (char c : str.toCharArray()) {
            
            if (Character.isUpperCase(c)) {
                
                result.append(Character.toLowerCase(c));
            } else {
                
                result.append(Character.toUpperCase(c));
            }
        }

        
        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(flip_case("Hello"));  
        System.out.println(flip_case("WORLD"));  
        System.out.println(flip_case("Java"));   
        System.out.println(flip_case("123abcXYZ"));  
    }
}