// AI instructions:
//    Create a data class Employee (name, age, salary<int>).
//    Implement the Comparable interface on it by the salary.
//    Create a main method to test how the list of employees
//    is sorted: use Kotlin embedded assert method.

data class Employee(val name: String, val age: Int, val salary: Int) : Comparable<Employee> {
    override fun compareTo(other: Employee): Int {
        return this.salary.compareTo(other.salary)
    }
}

/*
fun main() {
    val employees = listOf(
        Employee("John", 30, 5000),
        Employee("Jane", 25, 6000),
        Employee("Mike", 35, 4000)
    )

    assert(employees.sorted() == listOf(
        Employee("Mike", 35, 4000),
        Employee("John", 30, 5000),
        Employee("Jane", 25, 6000)
    ))
}*/
