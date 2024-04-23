class Employee(val id: Int, val name: String, val lastName: String, val telNum: String, val email: String) {

    fun printData() {
        println("Employee $id")
        println("full name: $name $lastName")
        println("tel. num: $telNum")
        println("email: $email")
    }
}

private val employees = mutableListOf<Employee>()

fun main() {
    val count = readln().toInt()
    createEmployees(::Employee, count)
    employees.forEach(Employee::printData)
}


fun createEmployees(employeeCreator: (Int, String, String, String, String) -> Employee, count: Int) {
    for (i in 1..count) {
        val (name, lastName, telNum, email) = readln().split(' ').toList()
        employees += employeeCreator(i, name, lastName, telNum, email)
    }
}