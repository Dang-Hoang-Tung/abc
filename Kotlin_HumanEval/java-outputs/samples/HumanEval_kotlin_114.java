import java.util.ArrayList;
import java.util.List;

public class ConsonantWords {

    public static List<String> select_words(String s, int n) {
        
        String[] words = s.split("\\s+");

        
        List<String> result = new ArrayList<>();

        
        for (String word : words) {
            
            int count = 0;
            for (char c : word.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') continue;
                count++;
            }

            
            if (count == n) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(select_words("Mary had a little lamb", 4)); 
        System.out.println(select_words("Mary had a little lamb", 3));