public class IsNested {
    public static boolean is_nested(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                count++;
            } else if (s.charAt(i) == ']') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count > 0;
    }

    public static void main(String[] args) {
        System.out.println(is_nested("[[]]")); 
        System.out.println(is_nested("[]]]]]]][[[[[]")); 
        System.out.println(is_nested("[][]")); 
        System.out.println(is_nested("[]")); 
        System.out.println(is_nested("[[][]]")); 
        System.out.println(is_nested("[[]][[")); 
    }
}