// complete the definition
infix fun List<Double>.average(markLimit: Double): Double {
    return filter { it >= markLimit }.average()
}
