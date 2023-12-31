package seamcarving

fun main(args: Array<String>) {
    Stage6(
        readParam(args, "-in"),
        readParam(args, "-out"),
        readParam(args, "-width").toInt(),
        readParam(args, "-height").toInt()
    ).run()
}

/**
 * Read a parameter with the given name.
 * @param args The array of parameters.
 * @param name The name of the parameter.
 * @return The value of the parameter.
 */
private fun readParam(args: Array<String>, name: String) =
    args.indexOf(name).run {
        if (this == -1 || args.size - this < 2) "" else args[this + 1]
    }