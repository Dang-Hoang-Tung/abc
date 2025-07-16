// Dynamic Type-Safe Configuration Loader (Generics + Inline Reified)

inline fun <reified T : Any> loadConfig(map: Map<String, Any?>): T {
    val constructor = T::class.primaryConstructor!!
    val args = constructor.parameters.associateWith { param ->
        map[param.name]
    }
    return constructor.callBy(args)
}

fun main() {
    data class Config(val host: String, val port: Int)

    val configMap = mapOf("host" to "localhost", "port" to 8080)
    val config: Config = loadConfig(configMap)
} 
