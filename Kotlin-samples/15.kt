// Generic Deep Mapper with Reflection

inline fun <reified FROM : Any, reified TO : Any> deepMap(from: FROM): TO {
    val fromProps = FROM::class.memberProperties.associateBy { it.name }
    val constructor = TO::class.primaryConstructor!!
    val args = constructor.parameters.associateWith { param ->
        fromProps[param.name]?.call(from)
    }
    return constructor.callBy(args)
}

fun main() {
    data class UserEntity(val id: Int, val name: String)
    data class UserDTO(val id: Int, val name: String)

    val dto: UserDTO = deepMap(UserEntity(1, "Alice"))
}
