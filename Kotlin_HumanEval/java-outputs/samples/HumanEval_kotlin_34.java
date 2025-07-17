public int max_element(List<Integer> list) {
    
    int max = list.get(0);

    
    for (int i = 1; i < list.size(); i++) {
        
        if (list.get(i) > max) {
            max = list.get(i);
        }
    }

    
    return max;
} 


public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3);
    System.out.println(max_element(list1)); 

    List<Integer> list2 = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
    System.out.println(max_element(list2)); 
}