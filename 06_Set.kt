fun main() {
    // Set read-only (item duplikat otomatis dibuang)
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    // Set yang bisa diubah, dengan tipe eksplisit
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)

    // View read-only dari mutable set
    val fruitLocked: Set<String> = fruit

    // Jumlah item dan cek keberadaan item
    println("count(): ${readOnlyFruit.count()}")
    println("banana ada? ${"banana" in readOnlyFruit}")

    // Tambah dan hapus item
    fruit.add("dragonfruit")
    println(fruit)
    fruit.remove("dragonfruit")
    println(fruit)
    println(fruitLocked)
}