public class WillItFly {
    public static boolean willItFly(List<Integer> q, int w) {
        
        if (q.isEmpty() || q.size() == 1) {
            return true;
        }

        
        int sum = 0;
        for (int num : q) {
            sum += num;
        }

        
        return sum <= w && isBalanced(q);
    }

    private static boolean isBalanced(List<Integer> q) {
        
        List<Integer> copy = new ArrayList<>(q);

        
        while (!copy.isEmpty()) {
            if (!copy.get(0).equals(copy.get(copy.size() - 1))) {
                return false;
            }
            copy.remove(0);
            copy.remove(copy.size() - 1);
        }

        return true;
    }
}