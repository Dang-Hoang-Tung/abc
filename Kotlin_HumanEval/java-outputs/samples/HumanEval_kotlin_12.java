if (strings.isEmpty()) {
        return null;
    }

    var longestString = strings[0];

    for (string in strings) {
        if (string.length > longestString.length) {
            longestString = string;
        }
    }

    return longestString;
}