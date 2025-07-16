// Automatic Retry with Exponential Backoff

suspend fun <T> retryWithBackoff(
    maxAttempts: Int = 5,
    initialDelay: Long = 100,
    factor: Double = 2.0,
    block: suspend () -> T
): T {
    var attempt = 0
    var delay = initialDelay

    while (true) {
        try {
            return block()
        } catch (e: Exception) {
            if (++attempt >= maxAttempts) throw e
            delay(delay)
            delay = (delay * factor).toLong()
        }
    }
}
