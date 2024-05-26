// You can experiment here, it won’t be checked

data class Person(val name: String, val age: Int)

fun main() {
    val ageComparator = Comparator<Person> { p1, p2 -> p1.age - p2.age }.reversed()

    val people = listOf(
        Person("Alice", 25), Person("Bob", 30), Person("Charlie", 20))
    val sortedPeople = people.sortedWith(ageComparator)
    println(sortedPeople)
}
