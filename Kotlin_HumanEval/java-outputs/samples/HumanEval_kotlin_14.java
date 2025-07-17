public List<String> all_prefixes(String s) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= s.length(); i++) {
        result.add(s.substring(0, i));
    }
    return result;
} 


public static void main(String[] args) {
    System.out.println(all_prefixes("abc").toString());
} 



public static void test_all_prefixes() {
    System.out.println(all_prefixes("abc").toString());
} 



public static void test_all_prefixes_2() {
    System.out.println(all_prefixes("abcd").toString());
} 



public static void test_all_prefixes_3() {
    System.out.println(all_prefixes("abcd