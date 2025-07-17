public class IsSorted {
    public static boolean isSorted(int[] nums) {
        
        if (nums.length <= 1) {
            return true;
        }

        
        for (int i = 0; i < nums.length - 1; i++) {
            
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {5};
        System.out.println(isSorted(nums1)); 

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(nums2)); 

        int[] nums3 = {1, 3, 2, 4, 5};
        System.out.println(isSorted(nums3)); 

        int[] nums4 = {1, 2, 3, 4, 5, 6};
        System.out.println