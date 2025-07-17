import java.util.*;

public class Solution {
    public static List<int[]> getRow(List<List<Integer>> lst, int x) {
        
        List<int[]> coordinates = new ArrayList<>();

        
        for (int i = 0; i < lst.size(); i++) {
            
            List<Integer> row = lst.get(i);

            
            for (int j = 0; j < row.size(); j++) {
                
                if (row.get(j).equals(x)) {
                    
                    coordinates.add(new int[]{i, j});
                }
            }
        }

        
        Collections.sort(coordinates, (a, b) -> a[0] - b[0]);

        
        for (int i = 0; i < coordinates.size(); i++) {
            int[] coord = coordinates.get(i);
            int row = coord[0];
            int col = coord[1];