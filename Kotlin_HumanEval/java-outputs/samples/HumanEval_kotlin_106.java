public boolean moveOneBall(int[] arr) {
    
    if (arr.length <= 1) {
        return true;
    }

    int count = 0;

    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
            count++;
        }
    }

    
    if (count > 1) {
        return false;
    }

    
    if (arr[arr.length - 1] > arr[0]) {
        return false;
    }

    return true;
}