open class Tag(val name: String) {
    val children = mutableListOf<Tag>()
    fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
        "<$name>${children.joinToString("")}</$name>"
}

/* Do not change code below */
fun table(init: TABLE.() -> Unit): TABLE = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun main() {
    val myTable = table {
        tr {
            for (i in 1..2) {
                td {
                }
            }
        }
    }
    println(myTable)
}