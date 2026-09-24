// Fungsi dengan parameter dan nilai return
fun sum(x: Int, y: Int): Int {
    return x + y
}

// Fungsi dengan nilai default untuk parameter prefix
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// Fungsi tanpa return (tipe return-nya Unit)
fun printMessage(message: String) {
    println(message)
}

fun main() {
    // Functions
    println(sum(1, 2))

    // Named arguments: urutan parameter boleh ditukar
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    // Default parameter values
    printMessageWithPrefix("Hello", "Log")   // kedua parameter diisi
    printMessageWithPrefix("Hello")          // prefix pakai default "Info"

    // Functions without return
    printMessage("Hello")
}