fun upperEvenLetters(message: String): String {
    return buildString(message.length) {
        message.forEachIndexed { index, c -> append(
            if (index % 2 == 1) c else c.uppercaseChar()
        ) }
    }
}
