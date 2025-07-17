public class Solution {
    public List<Integer> make_a_pile(int n) {
        
        List<Integer> result = new ArrayList<>();
        
        
        int currentStones = n;
        
        
        for (int i = 0; i < n; i++) {
            
            result.add(currentStones);
            
            
            
            currentStones += (currentStones % 2 == 0) ? 2 : 2;
        }
        
        return result;
    }
}