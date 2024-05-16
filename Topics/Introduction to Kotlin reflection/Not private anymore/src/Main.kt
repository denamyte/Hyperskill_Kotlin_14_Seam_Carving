fun main() {
    val cat = Cat()
    val fields = cat.javaClass.declaredFields
    fields.forEach {
        it.isAccessible = true
        println(it.get(cat))
    }
}