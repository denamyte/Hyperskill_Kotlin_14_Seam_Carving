// AI instructions:
//    Create a data class Spell with name and power properties.
//    Read from std a list in the format: <spell-name>-<spell-power>.
//    The list is guaranteed.
//    Parse the list to a list of Spells.
//    Use fold/reduce methods to calculate the sum of spell powers that are gte 40.

data class Spell(val name: String, val power: Int)

fun main() {
    val input = readLine() ?: ""
    val spellList = input.split(" ").map {
        val (name, power) = it.split("-")
        Spell(name, power.toInt())
    }
    val sumOfPowers = spellList.fold(0) { acc, spell ->
        if (spell.power >= 40) acc + spell.power else acc
    }
    println(sumOfPowers)
}