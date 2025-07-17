public String filterWords(String sentence) {
    
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    
    for (String word : words) {
        if (isPrime(word.length())) {
            
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }
    }

    return result.toString();
}