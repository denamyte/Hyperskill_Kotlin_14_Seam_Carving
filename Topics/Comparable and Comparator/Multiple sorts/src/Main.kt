data class User(val name: String, val age: Int, val email: String)

class UserComparator : Comparator<User> by compareBy(User::age).then(compareBy(User::name))

// class UserComparator : Comparator<User> {
//     override fun compare(u1: User, u2: User) =
//         when {
//             u1.age == u2.age -> u1.name.compareTo(u2.name)
//             else -> u1.age - u2.age
//         }
// }