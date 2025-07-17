public class SmallestChange {
    public static int smallest_change(int[] arr) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                count++;
            }
            left++;
            right--;
        }

        return count;
    }
} 


System.out.println(SmallestChange.smallest_change(new int[]{1, 2, 3, 5, 4, 7, 9, 6})); 
System.out.println(SmallestChange.smallest_change(new int[]{1, 2, 3, 4, 3, 2, 2})); 
System.out.println(SmallestChange.smallest_change(new int[]{1, 2, 3, 2, 1})); 
System.out.println(SmallestChange.smallest_change(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6