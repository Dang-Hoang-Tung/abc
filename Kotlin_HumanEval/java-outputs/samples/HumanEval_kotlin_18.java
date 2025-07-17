public class HowManyTimes {
    public static int how_many_times(String s, String sub) {
        if (s == null || sub == null || s.isEmpty() || sub.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }
}