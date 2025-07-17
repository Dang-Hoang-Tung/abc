import java.util.List;
import java.util.Arrays;

public class Solution {
    public static long getSumOfSquares(List<Double> lst) {
        
        List<Long> roundedList = lst.stream()
                                     .map(Math::ceil)
                                     .mapToLong(Double::longValue)
                                     .boxed()
                                     .collect(Collectors.toList());

        
        List<Long> squaredList = roundedList.stream()
                                             .map(num -> num * num)
                                             .collect(Collectors.toList());

        
        long sumOfSquares = squaredList.stream()
                                        .mapToLong(Long::longValue)
                                        .sum();

        return sumOfSquares;
    }

    public static void main(String[] args) {
        
        System.out.println(getSumOfSquares(Arrays.asList(1.0, 2.0, 3.0))); 
        System.out.println(getSumOfSquares(Arrays.asList(1.0, 4.0, 9.0))); 
        System.out.println(get