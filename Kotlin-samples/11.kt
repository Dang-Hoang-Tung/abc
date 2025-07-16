// Recursive Coroutine Task Scheduler

suspend fun <T> scheduleTasks(
    tasks: Map<String, suspend () -> T>,
    dependencies: Map<String, List<String>> = emptyMap(),
    timeoutMillis: Long = 5000
): Map<String, Result<T>> = coroutineScope {
    val results = mutableMapOf<String, Deferred<Result<T>>>()

    fun launchTask(name: String): Deferred<Result<T>> {
        return async {
            val deps = dependencies[name].orEmpty()
            deps.forEach { results[it]?.await() }

            runCatching {
                withTimeout(timeoutMillis) {
                    tasks[name]?.invoke() ?: error("Task $name not found")
                }
            }
        }
    }

    tasks.keys.forEach { key ->
        if (results[key] == null) {
            results[key] = launchTask(key)
        }
    }

    results.mapValues { it.value.await() }
}
