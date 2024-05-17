import kotlin.reflect.KClass
//  import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties

data class User(val name: String, val age: Int, private val password: String)

fun getProperties(kClass: KClass<*>): Collection<String> {
    return kClass.memberProperties
        // This commented string should be included in the code
        // but, for some reason the correct answer is ALL properties
//        .filter { it.visibility == KVisibility.PUBLIC }
        .map { it.name }
}
