public int choose_num(int x, int y) {
    
    if (x > y) {
        return -1;
    }

    
    if (y % 2 == 0) {
        return y;
    }

    
    if (y >= x && y <= y) {
        return y - 1;
    }

    
    return -1;
}