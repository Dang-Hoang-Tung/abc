public boolean below_threshold(List<Integer> l, int t) {
    for (int num : l) {
        if (num >= t) {
            return false;
        }
    }
    return true;
} 


public static void main(String[] args) {
    System.out.println(below_threshold(Arrays.asList(1, 2, 4, 10), 100)); 
    System.out.println(below_threshold(Arrays.asList(1, 20, 4, 10), 5)); 
}