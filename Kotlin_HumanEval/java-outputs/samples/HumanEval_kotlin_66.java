import java.util.HashMap;
import java.util.Map;

public class FrequencyFinder {
    public static int search(int[] nums) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        
        int result = -1;
        
        
        for (int num = nums.length; num > 0; num--) {
            
            if (frequencyMap.getOrDefault(num, 0) >= num) {
                
                result = num;
                break; 
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(search(new int[]{4, 1, 2, 2, 3, 1}));