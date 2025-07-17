public class TriangleArea {
    public static double triangle_area(int base, int height) {
        return (base * height) / 2.0;
    }
} 


public class Main {
    public static void main(String[] args) {
        System.out.println(TriangleArea.triangle_area(5, 3)); 
    }
}