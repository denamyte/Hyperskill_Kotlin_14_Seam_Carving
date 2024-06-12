// You can experiment here, it won’t be checked

fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping by the first letter and eachCount
    val groupedNames3 = names.groupingBy { it.first() }.eachCount()
    println(groupedNames3) // {J=4, M=2, P=2}

    // Grouping by the first letter and folding (accumulates) the length of the names
    val groupedNames4 = names.groupingBy { it.first() }
        .fold(0) { acc, name -> acc + name.length }
    println(groupedNames4) // {J=16, M=8, P=10}

    // Grouping by length and reducing to the longest name
    // we use "_" because the first parameter is the key, but we don't use it
    val groupedNames5 = names.groupingBy { it.length }
        .reduce { _, acc, name -> if (name.length > acc.length) name else acc }
    println(groupedNames5) // {4=John, 5=Peter}

}
