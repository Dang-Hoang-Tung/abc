public class Solution {
    public static int fruit_distribution(String s, int n) {
        
        String[] parts = s.split(" and ");
        
        
        int apples = Integer.parseInt(parts[0].split(" ")[0]);
        
        
        int oranges = Integer.parseInt(parts[1].split(" ")[0]);
        
        
        int mangoes = n - (apples + oranges);
        
        
        return mangoes;
    }
}