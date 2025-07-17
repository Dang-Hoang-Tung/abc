public class Concatenate {
    public static String concatenate(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate(new String[]{})); 
        System.out.println(concatenate(new String[]{"a", "b", "c"})); 
    }
}