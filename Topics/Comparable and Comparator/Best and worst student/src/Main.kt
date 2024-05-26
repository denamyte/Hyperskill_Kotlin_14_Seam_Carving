// AI instructions:
//    Write a simple test, without using test libraries,
//    to confirm the list of Students is sorted correctly.
data class Student(val name: String, val grade: Int) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return other.grade - grade
    }
}

// fun main() {
//    val students = listOf(
//        Student("John", 90),
//        Student("Alice", 85),
//        Student("Bob", 95)
//    )
//
//    val sortedStudents = students.sorted()
//
//    val isSorted = students == sortedStudents
//
//    println(isSorted)
// }