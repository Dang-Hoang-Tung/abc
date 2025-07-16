// Heterogeneous Function Dispatcher Using when + Lambdas

sealed class Command {
    data class Add(val a: Int, val b: Int) : Command()
    data class Multiply(val a: Int, val b: Int) : Command()
    object Reset : Command()
}

val dispatcher: (Command) -> Int = { command ->
    when (command) {
        is Command.Add -> command.a + command.b
        is Command.Multiply -> command.a * command.b
        is Command.Reset -> 0
    }
}
