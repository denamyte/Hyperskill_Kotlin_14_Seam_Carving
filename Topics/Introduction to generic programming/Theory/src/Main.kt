// You can experiment here, it won’t be checked

fun main() {
    val f = Foo()
    val s: Nothing


}

class Foo {
    fun <T> T.foo(that: T): T = throw Exception()

    init {
        "str".foo(42)
    }
}