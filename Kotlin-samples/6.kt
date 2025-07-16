// Kotlin Multiplatform Function

// Shared Common Code
expect fun getPlatformName(): String

fun greetUser(name: String): String {
    return "Hello, $name from ${getPlatformName()}!"
}

// Android Actual
actual fun getPlatformName(): String = "Android"

// iOS Actual
actual fun getPlatformName(): String = "iOS"
