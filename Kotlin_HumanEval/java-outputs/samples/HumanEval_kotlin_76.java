public class Solution {
    public static String decimal_to_binary(int n) {
        
        String binary = Integer.toBinaryString(n);
        
        
        return "db" + binary + "db";
    }
} 


System.out.println(decimal_to_binary(15));  
System.out.println(decimal_to_binary(32));  
System.out.println(decimal_to_binary(47));  
System.out.println(decimal_to_binary(100)); 
System.out.println(decimal_to_binary(255)); 
System.out.println(decimal_to_binary(0));   
System.out.println(decimal_to_binary(1));   
System.out.println(decimal_to_binary(2));   
System.out.println(decimal_to_binary(3