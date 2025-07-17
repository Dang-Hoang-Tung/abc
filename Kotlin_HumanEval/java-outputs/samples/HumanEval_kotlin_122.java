import java.util.ArrayList;
import java.util.Arrays;

public class SplitWords {
    public static ArrayList<String> splitWords(String text) {
        
        String[] wordsWithWhitespace = text.split("\\s+");
        if (wordsWithWhitespace.length > 0) {
            return new ArrayList<>(Arrays.asList(wordsWithWhitespace));
        }

        
        String[] wordsWithCommas = text.split(",");
        if (wordsWithCommas.length > 0) {
            return new ArrayList<>(Arrays.asList(wordsWithCommas));
        }

        
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c) && ((c - 'a') % 2 != 0)) {
                count++;
            }
        }
        return new ArrayList<>(Arrays.asList(String.valueOf(count)));
    }

    public static void main(String[] args) {
        System.out.println(splitWords("Hello world!")); 
        System.out.println(splitWords("Hello,world!")); 
        System.out.println(splitWords("abcdef")); 
    }
}