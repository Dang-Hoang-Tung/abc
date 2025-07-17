public class Exchange {

    public static String exchange(int[] lst1, int[] lst2) {
        
        for (int num : lst1) {
            if (num % 2 != 0) {
                
                for (int num2 : lst2) {
                    if (num2 % 2 == 0) {
                        return "YES";
                    }
                }
                
                return "NO";
            }
        }
        
        return "YES";
    }

}