// Compose Multiplatform Example

@Composable
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxSize().padding(16.dp)) {
            Text("Compose Multiplatform Example", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(16.dp))
            ExpandableCard("Info", "This runs on Desktop and Android!")
        }
    }
}


// Desktop entry point

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
