class Solution {
    public int minimumWaterExtraction(int[][] wells, int bucketCapacity) {
        
        int rows = wells.length;
        int cols = wells[0].length;
        int maxWater = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (wells[i][j] > maxWater) {
                    maxWater = wells[i][j];
                }
            }
        }

        int totalExtractions = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                totalExtractions += wells[i][j];
            }
        }

        return totalExtractions / bucketCapacity;
    }
}