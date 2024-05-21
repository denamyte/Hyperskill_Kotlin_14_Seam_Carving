// AI instructions (exactly as in the problem definition):
//    Create a class named Animal with the open makeSound() method
//    that displays the message "The animal makes a sound".
//    Then create a subclass Dog that overrides this method
//    by displaying the message "The dog barks".

open class Animal {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("The dog barks")
    }
}
