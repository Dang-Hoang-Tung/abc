public int largest_prime_factor(int n) {
    
    int factor = 2;
    
    
    while (n % factor == 0) {
        n /= factor;
    }
    
    
    factor++;
    
    
    while (n > 1) {
        if (n % factor == 0) {
            n /= factor;
        } else {
            factor++;
        }
    }
    
    
    return factor;
}