// Jetpack Compose Complex UI Component

// Animated Expandable Card with State

@Composable
fun ExpandableCard(
    title: String,
    content: String
) {
    var expanded by remember { mutableStateOf(false) }
    val rotation by animateFloatAsState(if (expanded) 180f else 0f)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(title, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
                Icon(
                    Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.rotate(rotation)
                )
            }
            AnimatedVisibility(visible = expanded) {
                Text(content, modifier = Modifier.padding(top = 8.dp))
            }
        }
    }
}

// Usage in Compose

ExpandableCard("Details", "This is a Jetpack Compose expandable card.")


