import kotlin.reflect.KProperty

class TextFormatter {
    var text: String by
}

fun textDelegate() = object : ReadWriteProperty {}