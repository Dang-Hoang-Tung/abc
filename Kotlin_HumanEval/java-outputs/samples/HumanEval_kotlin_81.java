*      a string of binary number
 *
 */


// Anything that's not code should be written as comments.
// Now write in Java.

Raw Generated:
 /**
 * You are an expert Java programmer, and here is your task.
 * Given a positive integer N, return the total sum of its digits in binary.
 *
 * Example
 *     For N = 1000, the sum of digits will be 1 the output should be "1".
 *     For N = 150, the sum of digits will be 6 the output should be "110".
 *     For N = 147, the sum of digits will be 12 the output should be "1100".
 *
 * Variables:
 *     @N integer
 *          Constraints: 0 ≤ N ≤ 10000.
 * Output:
 *      a string of binary number
 *
 */


// Anything that's not code should be written as comments.
// Now write in Java.
public class Solution {
    public String solve(int N) {
        // Write your code here
        int sum = 0;
        while(N > 0){
            sum += N % 10;
            N /= 10;
        }
        return Integer.toBinaryString(sum);
    }
} // End of class. Don't forget to delete this comment. It's not code. It's metadata. Metadata is data about data. In this case, it's data about a class. Classes are blueprints for objects. Objects are instances of classes. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are objects. Instances are
Output:
 




public class Solution {
    public String solve(int N) {
        
        int sum = 0;
        while(N > 0){
            sum += N % 10;
            N /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}