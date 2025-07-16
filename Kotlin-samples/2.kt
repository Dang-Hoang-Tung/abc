// Coroutine-Based Parallel Map (Concurrency & Asynchrony)

suspend fun <T, R> Iterable<T>.parallelMap(
    concurrency: Int = 4,
    transform: suspend (T) -> R
): List<R> = coroutineScope {
    val semaphore = Semaphore(concurrency)
    map { item ->
        async {
            semaphore.withPermit {
                transform(item)
            }
        }
    }.awaitAll()
}

fun main() {
    val results = listOf(1, 2, 3, 4).parallelMap { delay(100); it * 2 }
}
