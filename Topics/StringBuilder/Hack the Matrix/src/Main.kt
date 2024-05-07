fun decodeMessage(msg: String): String {
    return buildString {
        msg.forEach {
            when {
                it.lowercaseChar() in "aeiou" -> append(it)
                it != it.uppercaseChar() -> append(it.uppercaseChar())
            }
        }
    }
}
