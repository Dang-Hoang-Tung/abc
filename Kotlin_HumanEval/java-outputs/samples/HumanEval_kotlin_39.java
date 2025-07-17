public int numberOfCollisions(int[] cars) {
    
    int collisionCount = 0;

    
    for (int i = 0; i < cars.length; i++) {
        
        if (cars[i] > 0) {
            collisionCount++;
        }
    }

    
    return collisionCount;
}