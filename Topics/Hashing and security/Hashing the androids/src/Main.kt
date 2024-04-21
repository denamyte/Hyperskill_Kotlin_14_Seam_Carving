import java.security.MessageDigest

//data class Android(val name: String, val energy: Int)

fun calculateAndroidsHash(androids: List<Android>): String {
    val s = androids.map { "${it.name}${it.energy}" }
        .joinToString("")
    val digest = MessageDigest.getInstance("SHA-512")
    val res = digest.digest(s.toByteArray())
    return res.fold("") { str, it -> str + "%02x".format(it) }
}

//R2D2:100|C3PO:200
//private val androids = listOf(
//    Android("R2D2", 100),
//    Android("C3PO", 200),
//)
//
//fun main() {
//    println(calculateAndroidsHash(androids))
//}