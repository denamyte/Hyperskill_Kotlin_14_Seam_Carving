//    Create data class Spell with params: 1) name: String, power: Int.
//    From std, read a string with consists of names separated with space.
//    Each name is in the format "string-integer".
//    Parse names to Spells.
//    Find a first spell with power greater than 50.
//    Print the spell if it is found, otherwise, print "No spell found".
data class Spell(val name: String, val power: Int)

fun main() {
    val input = readLine()
    val names = input?.split(" ") ?: emptyList()
    val spells = names.map { name ->
        val parts = name.split("-")
        Spell(parts[0], parts[1].toInt())
    }
    val spell = spells.find { it.power > 50 }
    if (spell != null) {
        println(spell)
    } else {
        println("No spell found")
    }
}