// AI instructions:
//    Implement the function getEvenNumbers(mutableIterator: MutableIterator<Int>),
//    which returns a list of even numbers.

fun getEvenNumbers(mutableIterator: MutableIterator<Int>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    while (mutableIterator.hasNext()) {
        val number = mutableIterator.next()
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    return evenNumbers
}
