// Kotlin DSL for HTML-Like Structure (DSL Construction)
kotlin
Copy
Edit


@DslMarker
annotation class HtmlDsl

@HtmlDsl
class Tag(val name: String) {
    private val children = mutableListOf<Tag>()
    private var text: String? = null

    fun text(value: String) {
        text = value
    }

    fun tag(name: String, block: Tag.() -> Unit) {
        val child = Tag(name)
        child.block()
        children += child
    }

    override fun toString(): String {
        val inner = (text?.let { it } ?: "") + children.joinToString("") { it.toString() }
        return "<$name>$inner</$name>"
    }
}

fun html(block: Tag.() -> Unit): Tag {
    val root = Tag("html")
    root.block()
    return root
}

fun main() {
    val doc = html {
        tag("body") {
            tag("h1") { text("Hello DSL!") }
            tag("p") { text("This is a Kotlin DSL example.") }
        }
    }
    println(doc)
}
