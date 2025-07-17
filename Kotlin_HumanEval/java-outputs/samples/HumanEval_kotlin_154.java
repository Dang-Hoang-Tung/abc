public boolean right_angle_triangle(int a, int b, int c) {
    
    int[] sides = {a, b, c};
    Arrays.sort(sides);

    
    return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
}