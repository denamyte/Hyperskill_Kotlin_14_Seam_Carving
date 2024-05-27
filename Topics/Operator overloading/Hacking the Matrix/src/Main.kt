// define the function
operator fun List<Int>.invoke(code: Int) = filter { it % code == 0 }.sum()
