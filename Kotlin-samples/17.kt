// Inline & Value Classes (Kotlin 1.5+)

// Balances performance, immutability, and domain modeling in a way that avoids primitive confusion (like String vs Email).

@JvmInline
value class Email private constructor(val value: String) {
    companion object {
        fun of(input: String): Email {
            require(Regex("^[^@]+@[^@]+\\.[^@]+\$").matches(input)) {
                "Invalid email format: $input"
            }
            return Email(input)
        }
    }

    override fun toString(): String = value
}

fun main() {
    val email = Email.of("user@example.com")  // Compile-time type safety
}
