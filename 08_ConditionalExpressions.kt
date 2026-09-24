fun main() {
    // If
    val d: Int
    val check = true
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    // When sebagai pernyataan
    val obj = "Hello"
    when (obj) {
        // Cek apakah obj sama dengan "1"
        "1" -> println("One")
        // Cek apakah obj sama dengan "Hello"
        "Hello" -> println("Greeting")
        // Cabang default
        else -> println("Unknown")
    }

    // When sebagai ekspresi
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result)
}