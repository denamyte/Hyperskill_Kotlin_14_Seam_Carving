// AI instructions:
//    A class named Employee is defined as follows:

open class Employee(val name: String, val age: Int, var yearsOfWork: Int = 0)

//    Then, a new class is defined, named Programmer, which inherits from Employee and has the same parameters. Write the constructors of this class. It should be possible to instantiate Programmer as follows:
//    Programmer("My Name", 30, 5)  // name, age, yearsOfWork
//    Programmer("My Name", 30)     // name, age

open class Programmer(name: String, age: Int, yearsOfWork: Int = 0) :
    Employee(name, age, yearsOfWork)