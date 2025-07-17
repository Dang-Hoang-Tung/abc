public boolean pairs_sum_to_zero(List<Integer> nums) {
    
    Set<Integer> seen = new HashSet<>();
    
    
    for (int num : nums) {
        
        if (seen.contains(-num)) {
            
            return true;
        }
        
        seen.add(num);
    }
    
    
    
    return false;
}