sealed class Result(val message: String) {
    class Success(msg: String) : Result(msg)
    class Error(msg: String) : Result(msg)
}