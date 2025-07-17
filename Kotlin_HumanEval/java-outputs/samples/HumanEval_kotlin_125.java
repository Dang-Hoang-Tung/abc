if (arr.isEmpty()) {
        return null;
    }

    var magnitudeSum = 0;
    var signProduct = 1;

    for (num in arr) {
        if (num != 0) {
            magnitudeSum += Math.abs(num);
            signProduct *= if (num > 0) 1 else -1;
        }
    }

    return magnitudeSum * signProduct;
}