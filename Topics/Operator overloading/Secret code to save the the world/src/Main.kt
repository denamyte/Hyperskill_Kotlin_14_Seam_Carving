// define the function
operator fun List<String>.contains(limit: Int) = any { it.length >= limit }
