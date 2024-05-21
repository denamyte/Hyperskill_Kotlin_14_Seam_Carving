// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  alwaysFails()
}

fun alwaysFails(): Nothing {
    throw UnsupportedOperationException("This operation is not supported")
}