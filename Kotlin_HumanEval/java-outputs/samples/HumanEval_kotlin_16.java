public int count_distinct_characters(String s) {
    
    String lowerCaseString = s.toLowerCase();

    
    HashSet<Character> uniqueCharacters = new HashSet<>();

    
    for (char c : lowerCaseString.toCharArray()) {
        
        uniqueCharacters.add(c);
    }

    
    return uniqueCharacters.size();
} 


public static void main(String[] args) {
    System.out.println(count_distinct_characters("xyzXYZ")); 
    System.out.println(count_distinct_characters("Jerry")); 
}