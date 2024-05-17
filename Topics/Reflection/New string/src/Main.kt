import kotlin.reflect.full.createInstance

fun main() {
    val stringClass = String::class
    val instance = stringClass.createInstance()
    println(instance.javaClass)
}