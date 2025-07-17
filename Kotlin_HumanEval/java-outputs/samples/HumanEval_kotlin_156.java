class Solution {
    public int[] eat(int number, int need, int remaining) {
        
        int total = number + Math.min(need, remaining);
        int left = Math.max(0, remaining - need);
        return new int[]{total, left};
    }
} 


if (Solution.class.isAssignableFrom(this.getClass())) {
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.eat(5, 6, 10)));
    System.out.println(Arrays.toString(solution.eat(4, 8, 9)));
    System.out.println(Arrays.toString(solution.eat(1, 10, 10)));
    System.out.println(Arrays.toString(solution.eat(2, 11, 5)));
}