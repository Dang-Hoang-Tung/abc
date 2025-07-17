public class UnitDigitProduct {

    public static int multiply(int a, int b) {
        
        int unitDigitA = Math.abs(a % 10);
        int unitDigitB = Math.abs(b % 10);

        
        return unitDigitA * unitDigitB;
    }
} 


System.out.println(UnitDigitProduct.multiply(148, 412)); 
System.out.println(UnitDigitProduct.multiply(19, 28));   
System.out.println(UnitDigitProduct.multiply(2020, 1851)); 
System.out.println(UnitDigitProduct.multiply(14, -15));