class Strongest_Extension {
    public String findStrongestExtension(String className, String[] extensions) {
        int maxStrength = Integer.MIN_VALUE;
        String strongestExtension = "";
        
        for (String extension : extensions) {
            int capCount = 0;
            int smCount = 0;
            
            for (char c : extension.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    capCount++;
                } else if (Character.isLowerCase(c)) {
                    smCount++;
                }
            }
            
            int strength = capCount - smCount;
            if (strength > maxStrength) {
                maxStrength = strength;
                strongestExtension = extension;
            }
        }
        
        return className + "." + strongestExtension;
    }
}