public String intersection(int[] interval1, int[] interval2) {
    
    int start = Math.max(interval1[0], interval2[0]);
    int end = Math.min(interval1[1], interval2[1]);

    
    if (start > end) {
        return "NO";
    }

    
    int length = end - start + 1;

    
    for (int i = 2; i <= Math.sqrt(length); i++) {
        if (length % i == 0) {
            return "NO";
        }
    }

    return "YES";
}