// You can experiment here, it won’t be checked

operator fun String.unaryMinus() = this.reversed()

fun main() {
    val name = "Kotlin"
    println(-name) // niltoK

    println((-Test()).result)

    println((Test() * 5).result)
    println((Test() * "five").result)

    println(
        (Test("5") + Test("7")).result
    )

    val incTest = Test("3")
    println(incTest.inc().result)
    println(incTest.result)

    println("========================================= Custom List")
    val cList = CustomList(listOf(1, 2, 3, 4))
    println(cList[2])
    println(cList.toString())
    cList[3] = 50
    println(cList.toString())

}

class Test(val result: String = "not") {

    operator fun unaryMinus() = Test("minus used")

    infix operator fun times(n: Int) = Test("multiplied: $n times")

    infix operator fun times(s: String) = Test("multiplied by a string: $s")

    infix operator fun plus(t: Test) = Test((this.result.toInt() + t.result.toInt()).toString())

    operator fun inc() = Test(result.toInt().inc().toString())

}

class CustomList<T>(list: List<T> = listOf()) {
    private val list = list.toMutableList()

    operator fun get(i: Int) = list[i]

    operator fun set(i: Int, el: T) = run { list[i] = el }

    override fun toString() = list.toString()
}
