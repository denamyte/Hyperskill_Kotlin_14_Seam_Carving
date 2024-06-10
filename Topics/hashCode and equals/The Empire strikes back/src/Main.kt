class Ship(val name: String, val ammunition: Int) {
    override fun equals(other: Any?) =
        other is Ship &&
            ammunition == other.ammunition

    override fun hashCode() = ammunition
}