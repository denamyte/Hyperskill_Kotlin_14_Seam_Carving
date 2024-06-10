class UserInfo(val name: String, val age: Int, val userName: String, val email: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo) return false

        return userName == other.userName &&
            email == other.email
    }

    override fun hashCode() = userName.hashCode() * 31 + email.hashCode()
}