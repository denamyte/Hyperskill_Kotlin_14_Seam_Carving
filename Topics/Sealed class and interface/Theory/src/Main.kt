// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val impl = FinalImpl()
    println(impl.someField)
}

interface Something {
    val someField: Int

    fun someFun()
}

abstract class SomeImple: Something {

}

class FinalImpl : SomeImple() {
    override val someField: Int
        get() = 0

    override fun someFun() {
        TODO("Not yet implemented")
    }
}
