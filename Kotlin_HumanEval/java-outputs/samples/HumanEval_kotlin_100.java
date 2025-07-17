public class Solution {
    public static String rounded_avg(int n, int m) {
        if(n > m){
            return "-1";
        }
        int sum = 0;
        for(int i = n; i <= m; i++){
            sum += i;
        }
        double avg = Math.round((double)sum / (m - n + 1));
        return "0b" + Integer.toBinaryString((int)avg);
    }
} 


public class Main {
    public static void main(String[] args) {
        System.out.println(rounded_avg(1, 5)); 
        System.out.println(rounded_avg(7, 5)); 
        System.out.println(rounded_avg(10, 20)); 
        System.out.println(rounded_avg(20, 33)); 
    }
} 


if (typeof exports === 'object') {
    module.exports = rounded_avg;
}