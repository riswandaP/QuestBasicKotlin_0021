fun main() {
    // 1..4 termasuk nilai akhir
    println((1..4).toList())

    // 1..<4 tidak termasuk nilai akhir
    println((1..<4).toList())

    // Urutan terbalik
    println((4 downTo 1).toList())

    // Langkah bukan 1
    println((1..5 step 2).toList())

    // Range Char
    println(('a'..'d').toList())
    println(('z' downTo 's' step 2).toList())
}