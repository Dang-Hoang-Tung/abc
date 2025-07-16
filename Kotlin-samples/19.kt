// Concurrency Primitives: Mutex with Shared State

// Avoids race conditions with fine-grained, coroutine-friendly locking.

class SafeCounter {
    private var count = 0
    private val mutex = Mutex()

    suspend fun increment() {
        mutex.withLock {
            count++
        }
    }

    suspend fun get(): Int = mutex.withLock { count }
}

fun main() {
    val counter = SafeCounter()
    coroutineScope {
        repeat(1_000) {
            launch { counter.increment() }
        }
    }
    println("Final count: ${counter.get()}")
}
