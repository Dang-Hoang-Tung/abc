public class SortNumbers {
    public static String sort_numbers(String input) {
        
        String[] words = input.split(" ");
        
        
        int[] numbers = new int[words.length];
        
        
        for (int i = 0; i < words.length; i++) {
            switch (words[i]) {
                case "zero":
                    numbers[i] = 0;
                    break;
                case "one":
                    numbers[i] = 1;
                    break;
                case "two":
                    numbers[i] = 2;
                    break;
                case "three":
                    numbers[i] = 3;
                    break;
                case "four":
                    numbers[i] = 4;
                    break;
                case "five":
                    numbers[i] = 5;
                    break;
                case "six":
                    numbers[i] = 6;
                    break;
                case "seven":
                    numbers[i] = 7;
                    break;
                case "eight":
                    numbers[i] = 8;
                    break;
                case "nine":
                    numbers[i] = 9;
                    break;
            }