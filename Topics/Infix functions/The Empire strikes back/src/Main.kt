infix fun List<Ship>.battle(ammunitionLimit: Int) =
    filter { it.ammunition > ammunitionLimit }.map { it.name }

data class Ship(val name: String, val ammunition: Int)

//    fun main() {
//        val ships = "Ford-11 Bismarck-200 Titanic-340 HMS-44".split(" ")
//            .map { it.split("-").let { Ship(it[0], it[1].toInt()) } }
//        println(ships battle 50)
//    }