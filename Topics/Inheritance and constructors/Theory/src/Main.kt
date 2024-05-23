// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
}

open class Base(val num: Int, var isZero: Int = 0, val str: String = "Europe") {
    constructor(num: Int, str: String) : this(num, 0, str)
}

// a)
//class Derived : Base {
//    constructor(num: Int, isZero: Int, str: String) : super(num, isZero, str)
//    constructor(num: Int, str: String) : super(num, str)
//}

// b)
//class Derived : Base() {
//    constructor(num: Int, isZero: Int, str: String) : super(num, isZero, str)
//    constructor(num: Int, str: String) : super(num, str)
//}

// c)
//class Derived : Base {
//    constructor(val num: Int, var isZero: Int, val str: String) : super(num, isZero, str)
//    constructor(num: Int, str: String) : super(num, str)
//}

// d)
//class Derived : Base {
//    constructor(num: Int) : super(num)
//    constructor(num: Int, str: String) : super(num, str)
//}