// AI instructions:
//    Create a Friend class.
//    Define its primary constructor empty and private.
//    Create a private var field "name", initialize it to "Alex".
//    Add a secondary constructor to assign that field.

class Friend private constructor() {
    private var name: String = "Alex"

    constructor(name: String) : this() {
        this.name = name
    }
}