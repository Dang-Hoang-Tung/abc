public boolean validDate(String date) {
    
    String[] parts = date.split("-");
    
    
    if (parts.length != 3) {
        return false;
    }
    
    
    int month = Integer.parseInt(parts[0]);
    int day = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);
    
    
    if (month < 1 || month > 12) {
        return false;
    }
    
    
    if (day < 1 || day > 31) {
        return false;
    }
    
    
    if (month == 2) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            
            if (day > 29) {