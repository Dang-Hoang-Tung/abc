public class AntiShuffle {

    public static String anti_shuffle(String str) {
        
        String[] words = str.split(" ");
        
        
        StringBuilder result = new StringBuilder();
        
        
        for (String word : words) {
            
            char[] chars = word.toCharArray();
            
            
            Arrays.sort(chars);
            
            
            result.append(new String(chars));
            
            
            result.append(" ");
        }
        
        
        return result.toString().trim();
    }

    public static void main(String[] args) {
        
        System.out.println(anti_shuffle("Hi")); 
        System.out.println(anti_shuffle("hello")); 
        System.out.println(anti_shuffle("Hello World!!!")); 
    }
}