// Dear AI,
// Create an infix function called div that returns true
// if an integer is divisible by another x integer.

infix fun Int.div(x: Int): Boolean {
    return this % x == 0
}