public class FileChecker {
    public String file_name_check(String fileName) {
        
        int digitCount = 0;
        for (char c : fileName.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
                if (digitCount > 3) {
                    return "No";
                }
            }
        }

        
        int dotCount = 0;
        for (char c : fileName.toCharArray()) {
            if (c == '.') {
                dotCount++;
            }
        }
        if (dotCount != 1) {
            return "No";
        }

        
        int dotIndex = fileName.indexOf('.');
        String extension = fileName.substring(dotIndex + 1);
        if (!extension.equals("txt") && !extension.equals("exe") && !extension.equals("dll")) {
            return "No";
        }

        
        char firstChar = fileName.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return "No";
        }

        
        return "Yes";
    }
}