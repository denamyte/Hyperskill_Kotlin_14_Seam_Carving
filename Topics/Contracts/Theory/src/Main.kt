// You can experiment here, it won’t be checked

val a: String by lazy {
    print("a")
    "c"
}
val b: String by lazy {
    print("b")
    a
}

fun main() {
    print(b)
}
