return when {
        a is Int && b is Int -> if (a > b) a else if (b > a) b else null
        a is Float && b is Float -> if (a > b) a else if (b > a) b else null
        a is String && b is String -> if (a.toDouble() > b.toDouble()) a else if (b.toDouble() > a.toDouble()) b else null
        a is String && b is Int -> if (a.toDouble() > b) a else if (b > a.toDouble()) b else null
        a is Int && b is String -> if (a > b.toDouble()) a else if (b.toDouble() > a) b else null
        else -> null
    }
}