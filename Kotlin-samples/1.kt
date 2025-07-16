// Generic Memoization Function (Functional Programming)

fun <P, R> memoize(function: (P) -> R): (P) -> R {
    val cache = mutableMapOf<P, R>()
    return { param: P ->
        cache.getOrPut(param) { function(param) }
    }
}

fun main() {
    val factorial: (Int) -> Long = memoize { n ->
        if (n <= 1) 1 else n * factorial(n - 1)
    }
}

