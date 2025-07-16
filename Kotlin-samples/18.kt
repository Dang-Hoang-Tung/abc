// Compose Animation Graph with Dynamic Interpolations

// Combines infinite transitions, multiple interpolators, and animated scaling in a single Compose element.

@Composable
fun AnimatedLoginCard() {
    val transition = rememberInfiniteTransition()

    val backgroundColor by transition.animateColor(
        initialValue = Color.Gray,
        targetValue = Color.Blue,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        )
    )

    val scale by transition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 1200
                1.1f at 600
            },
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale)
            .background(backgroundColor)
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Text("Logging In...", style = MaterialTheme.typography.headlineSmall)
    }
}
