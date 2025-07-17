public boolean has_close_elements(List<Double> nums, double threshold) {
    
    Collections.sort(nums);

    
    for (int i = 0; i < nums.size() - 1; i++) {
        
        if (nums.get(i + 1) - nums.get(i) < threshold) {
            return true;
        }
    }

    
    return false;
} 


public static void main(String[] args) {
    List<Double> nums = Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0);
    double threshold = 0.3;
    System.out.println(has_close_elements(nums, threshold)); 
}