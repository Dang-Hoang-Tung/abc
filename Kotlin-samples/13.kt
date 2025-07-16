// Polymorphic JSON Deserialization (Sealed Class + Reflection)

@Serializable
sealed class Message {
    @Serializable data class Text(val content: String) : Message()
    @Serializable data class Image(val url: String) : Message()
}

inline fun <reified T : Message> decodeMessage(json: String): T {
    val module = SerializersModule {
        polymorphic(Message::class) {
            subclass(Message.Text::class, Message.Text.serializer())
            subclass(Message.Image::class, Message.Image.serializer())
        }
    }

    val format = Json { serializersModule = module; classDiscriminator = "type" }
    return format.decodeFromString(json)
}
