import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> total_match(List<String> list1, List<String> list2) {
        int sum1 = 0;
        int sum2 = 0;

        for (String str : list1) {
            sum1 += str.length();
        }

        for (String str : list2) {
            sum2 += str.length();
        }

        if (sum1 < sum2) {
            return list1;
        } else if (sum2 < sum1) {
            return list2;
        } else {
            return list1;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(total_match(new ArrayList<>(), new ArrayList<>()).equals(new ArrayList<>()));
        System.out.println(total_match(new ArrayList<>(List.of("hi", "admin")), new ArrayList<>(List.of("hI", "Hi"))).equals(new ArrayList<>(List.of("hI", "Hi"))));
        System.out.println(total_match(new ArrayList<>(List.of("hi", "admin")), new ArrayList<>(List.of("hi", "hi", "admin", "project"))).equals(new ArrayList<>(List.of("hi",