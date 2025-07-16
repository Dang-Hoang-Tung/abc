// Flow Buffer with Backpressure Control

fun <T> Flow<T>.bufferedBackpressure(
    maxInFlight: Int,
    onDrop: suspend (T) -> Unit
): Flow<T> = channelFlow {
    val semaphore = Semaphore(maxInFlight)

    collect { value ->
        if (semaphore.tryAcquire()) {
            launch {
                trySend(value)
            }.invokeOnCompletion {
                semaphore.release()
            }
        } else {
            onDrop(value) // Backpressure hook
        }
    }
}
