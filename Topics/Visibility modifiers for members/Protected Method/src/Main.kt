// AI instructions:
//    Inside the Friend class (it's open), declare a method
//    called greeting() that should be available only
//    in the Friend class and its subclasses. The function takes
//    a parameter name as a string and returns "Hello $name".

open class Friend {
    protected fun greeting(name: String): String {
        return "Hello $name"
    }
}