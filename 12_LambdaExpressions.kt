// Versi fungsi biasa
fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    // Memanggil fungsi biasa
    println(uppercaseString("hello"))

    // Versi lambda: hasilnya sama, tulisannya lebih ringkas
    println({ string: String -> string.uppercase() }("hello"))
}