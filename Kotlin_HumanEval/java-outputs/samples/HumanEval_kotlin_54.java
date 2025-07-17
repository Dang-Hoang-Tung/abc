public boolean monotonic(int[] nums) {
    if (nums == null || nums.length <= 1) return true;

    boolean increasing = false;
    boolean decreasing = false;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > nums[i - 1]) increasing = true;
        if (nums[i] < nums[i - 1]) decreasing = true;

        if (increasing && decreasing) return false;
    }

    return true;
} 


System.out.println(monotonic(new int[]{1, 2, 4, 20})); 
System.out.println(monotonic(new int[]{1, 20, 4, 10})); 
System.out.println(monotonic(new int[]{4, 1, 0, -10})); 
System.out.println(monotonic(new int[]{})); 
System.out.println(monotonic(new int[]{1})); 
System.out.println(monotonic(new int[]{1, 2, 3, 4, 5})); 
System.out.println(monotonic(new