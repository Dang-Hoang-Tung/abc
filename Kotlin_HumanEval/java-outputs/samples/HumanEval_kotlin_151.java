public boolean cycpattern_check(String str1, String str2) {
    
    for (int i = 0; i < str2.length(); i++) {
        String rotatedStr2 = rotateString(str2, i);
        if (str1.contains(rotatedStr2)) {
            return true;
        }
    }
    return false;
}