fun main() {
    val secret = Secret()
    val methods = secret.javaClass.declaredMethods
    methods.forEach {
        it.isAccessible = true
        println(it.invoke(secret))
    }
}