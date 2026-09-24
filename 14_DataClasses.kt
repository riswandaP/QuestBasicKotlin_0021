// Data class: otomatis punya toString(), equals(), copy(), dan lainnya
data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Print as string
    println(user)

    // Compare instances
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // Copy instance
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
}