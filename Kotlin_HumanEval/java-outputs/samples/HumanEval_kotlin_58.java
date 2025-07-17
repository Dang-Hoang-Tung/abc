public boolean correct_bracketing(String brackets) {
    int count = 0;
    for (int i = 0; i < brackets.length(); i++) {
        if (brackets.charAt(i) == '(') {
            count++;
        } else if (brackets.charAt(i) == ')') {
            count--;
        }
        if (count < 0) {
            return false;
        }
    }
    return count == 0;
} 


public static void main(String[] args) {
    System.out.println(correct_bracketing("(")); 
    System.out.println(correct_bracketing("()")); 
    System.out.println(correct_bracketing("(()())")); 
    System.out.println(correct_bracketing(")(()")); 
}