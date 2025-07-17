public class WordsString {

    public static String[] words_string(String str) {
        
        String[] words = str.split("[,\\s]+");
        return words;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(words_string("Hi, my name is John"))); 
        System.out.println(Arrays.toString(words_string("One, two, three, four, five, six"))); 
    }
}