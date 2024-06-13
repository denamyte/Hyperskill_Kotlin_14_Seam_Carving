import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty

class Student {
    var name: String = ""
    var grade: Int by GradeProperty()
}

class GradeProperty : ReadWriteProperty<Any?, Int> {
    private var grade: Int = 0

    override operator fun getValue(thisRef: Any?, property: KProperty<*>) = grade

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        grade = value.coerceIn(0..100)
        println("The new grade is $grade")
    }
}

//    fun main() {
//        val s = Student()
//
//        s.grade = 10
//        s.grade = -10
//        s.grade = 110
//    }