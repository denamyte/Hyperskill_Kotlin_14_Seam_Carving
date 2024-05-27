// define the function
operator fun List<Double>.invoke(markLimit: Double): Double {
    return filter { it > markLimit }.average()
}
