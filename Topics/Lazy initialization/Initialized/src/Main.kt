class B {
    lateinit var b: String

    fun checkB()  = ::b.isInitialized
}

//    fun main() {
//        val b = B()
//        println(b.checkB())
//        b.b = "asdf"
//        println(b.checkB())
//    }