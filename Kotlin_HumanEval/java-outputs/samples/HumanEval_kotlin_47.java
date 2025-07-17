// 3
// 2
// 1
// 8
// 1
// Expected output:
// 3
// 2
// 1
// 8
Output:
 




public class ModP {
    public static int modp(int n, int p) {
        if(n == 0){
            return 1;
        }
        int result = 1;
        for(int i = 0; i < n; i++){
            result = (result * 2) % p;
        }
        return result;
    }
} 


public class Main {
    public static void main(String[] args) {
        System.out.println(ModP.modp(3, 5)); 
        System.out.println(ModP.modp(1101, 101)); 
        System.out.println(ModP.modp(0, 101)); 
        System.out.println(ModP.modp(3, 11)); 
        System.out.println(ModP.modp(100, 101)); 
    }
}