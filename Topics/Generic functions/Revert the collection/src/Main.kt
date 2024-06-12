class SomeCollection<T>(val list: List<T>) {
    fun invert() = list.reversed().let(::println)
}
