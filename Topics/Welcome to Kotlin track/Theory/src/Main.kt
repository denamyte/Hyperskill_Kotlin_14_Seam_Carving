// You can experiment here, it won’t be checked

fun main() {
    val input = "1 2 3 4 5 6 7 8 9 10"
    demoList(input)
}

fun demoList(input: String) {
    val inputList = input.split(" ")
    println(inputList[-1])
}
