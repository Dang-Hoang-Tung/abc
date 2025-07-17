public class EvenOddCount {

    public static int[] evenOddCount(int num) {
        
        String strNum = Integer.toString(Math.abs(num)); 

        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 0; i < strNum.length(); i++) {
            int digit = Character.getNumericValue(strNum.charAt(i));

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(evenOddCount(-12))); 
        System.out.println(Arrays.toString(evenOddCount(123))); 
        System.out.println(Arrays.toString(evenOddCount(0)));   
    }
}