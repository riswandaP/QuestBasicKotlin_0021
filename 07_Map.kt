fun main() {
    // Map read-only
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Map yang bisa diubah, dengan tipe eksplisit
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    // View read-only dari mutable map
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // Akses nilai lewat key
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    // Jumlah item
    println("count(): ${readOnlyJuiceMenu.count()}")

    // Tambah dan hapus item
    juiceMenu.put("coconut", 150)
    println(juiceMenu)
    juiceMenu.remove("coconut")
    println(juiceMenu)
    println(juiceMenuLocked)

    // Cek key, lalu ambil kumpulan key dan value
    println("containsKey(kiwi): ${readOnlyJuiceMenu.containsKey("kiwi")}")
    println("keys: ${readOnlyJuiceMenu.keys}")
    println("values: ${readOnlyJuiceMenu.values}")

    // Cek dengan operator in
    println("orange ada di keys? ${"orange" in readOnlyJuiceMenu.keys}")
    println("200 ada di values? ${200 in readOnlyJuiceMenu.values}")
}