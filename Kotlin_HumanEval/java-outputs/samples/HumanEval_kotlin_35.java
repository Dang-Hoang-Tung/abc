public int fizz_buzz(int n) {
    int count = 0;
    for (int i = 1; i < n; i++) {
        if (i % 11 == 0 || i % 13 == 0) {
            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '7') {
                    count++;
                }
            }
        }
    }
    return count;
} 


public static void main(String[] args) {
    System.out.println(fizz_buzz(50)); 
    System.out.println(fizz_buzz(78)); 
    System.out.println(fizz_buzz(79)); 
} 


}