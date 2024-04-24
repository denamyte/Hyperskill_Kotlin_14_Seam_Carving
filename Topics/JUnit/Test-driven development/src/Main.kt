class Person(personName: String?, personAge: Int) {
    // Do not change this part
    companion object {
        const val DEFAULT_NAME = "Unknown"
        const val MAX_AGE = 130
        const val MIN_AGE = 0
    }

    // Fix this to make its code pass the unit tests
    val name = if (personName.isNullOrBlank()) DEFAULT_NAME else personName
    val age = personAge.coerceIn(MIN_AGE, MAX_AGE)
}