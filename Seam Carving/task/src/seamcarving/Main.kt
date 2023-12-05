package seamcarving

fun main(args: Array<String>) {
    val inName = readParam(args, "-in")
    val outName = readParam(args, "-out")
    Stage3(inName, outName).run()
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