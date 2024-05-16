fun main() {
    val secret = Secret()
    val fields = secret.javaClass.declaredFields
    fields.forEach(::println)
}