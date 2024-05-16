// You can experiment here, it won’t be checked

fun main() {
    val friend = Friend() //just an object
    val methods = friend.javaClass.declaredMethods // array of methods
    methods.forEach {
        it.isAccessible = true // make the methods not private
        println(it.invoke(friend)) // invoking the methods
    }
}

class Friend {
    private val friendName = "Eyad"
    private var friendAge = 20

    private fun greeting(): String {
        return "Hello, $friendName"
    }
    private fun tellSecretMessage(): String{
        return "I am not in danger. I am the danger, $friendName"
    }
}