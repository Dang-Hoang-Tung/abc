// Reflection-Based Deep Clone Function (Reflection + Recursion)

inline fun <reified T : Any> deepClone(original: T): T {
    val constructor = T::class.constructors.first()
    val args = constructor.parameters.associateWith { param ->
        val value = T::class.members
            .firstOrNull { it.name == param.name }
            ?.call(original)

        if (value != null && value::class.isData) {
            deepClone(value)
        } else value
    }
    return constructor.callBy(args)
}

fun main() {
    data class Person(val name: String, val address: Address)
    data class Address(val city: String)

    val john = Person("John", Address("NY"))
    val copy = deepClone(john)
}
