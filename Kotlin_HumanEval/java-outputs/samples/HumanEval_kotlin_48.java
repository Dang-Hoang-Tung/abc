public class RemoveVowels {
    public static String remove_vowels(String s) {
        
        StringBuilder result = new StringBuilder();

        
        String vowels = "aeiouAEIOU";

        
        for (char c : s.toCharArray()) {
            
            if (!vowels.contains(String.valueOf(c))) {
                
                result.append(c);
            }
        }

        
        return result.toString();
    }

    public static void main(String[] args) {
        
        System.out.println(remove_vowels("")); 
        System.out.println(remove_vowels("abcdef\nghijklm")); 
        System.out.println(remove_vowels("abcdef")); 
        System.out.println(remove_vowels("aaaaa")); 
        System.out.println(remove_vowels("aaBAA")); 
        System.out.println(remove_vow