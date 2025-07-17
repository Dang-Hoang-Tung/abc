public class BoredomCounter {
    public static int is_bored(String s) {
        
        String[] sentences = s.split("[.?!]");
        
        int boredomCount = 0;
        
        for (String sentence : sentences) {
            
            sentence = sentence.trim();
            
            
            if (sentence.startsWith("I")) {
                boredomCount++;
            }
        }
        
        return boredomCount;
    }
} 


System.out.println(BoredomCounter.is_bored("Hello world")); 
System.out.println(BoredomCounter.is_bored("The sky is blue. The sun is shining. I love this weather")); 
System.out.println(BoredomCounter.is_bored("I am bored. Are you?")); 
System.out.println(BoredomCounter.is_bored("I am happy. I am not bored.")); 
System.out.println(BoredomCounter.is_bored("I am tired. I need a break!"));