public boolean is_prime(int num) {
    
    if (num == 1) return false;

    
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            
            return false;
        }
    }

    
    return true;
} 


System.out.println(is_prime(6)); 
System.out.println(is_prime(101)); 
System.out.println(is_prime(11)); 
System.out.println(is_prime(13441)); 
System.out.println(is_prime(61)); 
System.out.println(is_prime(4)); 
System.out.println(is_prime(1));