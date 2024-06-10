// You can experiment here, it won’t be checked

sealed class Staff {
    class Teacher(val numberOfLessons: Int) : Staff()
    class Manager(val Responsibility: String) : Staff()
    object Worker : Staff()
}

fun listTheTasks(staff: Staff) = when (staff) {
    is Staff.Teacher -> println("The teacher has ${staff.numberOfLessons} lessons today")
    Staff.Worker -> println("Worker is fixing the projector for profs in CS, all respect to him.")
    is Staff.Manager -> println("The manager is doing ${staff.Responsibility} today")
}

fun main() {

}
