public boolean iscube(int a) {
    
    return Math.cbrt(Math.abs(a)) % 1 == 0;
}