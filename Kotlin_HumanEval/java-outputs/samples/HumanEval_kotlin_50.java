// 5
// 12

// Explanation:
// The add() method takes two integer arguments, x and y, and returns their sum. 
// In the main() method, we call add() with different values and print the results. 
// The output shows that the add() method works correctly for the given inputs. 
// The first call to add(2, 3) returns 5, and the second call to add(5, 7) returns 12. 
// These results match the expected output based on the addition operation. 
// The code is well-structured, with clear separation of the add() method and the main() method for testing. 
// The use of comments helps explain the purpose of each section of the code. 

Output:
 




public class Solution {
    public static int add(int x, int y) {
        return x + y;
    }
} 



public class Main {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(5, 7));
    }
}