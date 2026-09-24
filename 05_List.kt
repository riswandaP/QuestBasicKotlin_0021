fun main() {
    // List read-only
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // List yang bisa diubah, dengan tipe eksplisit
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // View read-only dari mutable list
    val shapesLocked: List<String> = shapes

    // Akses item
    println("Indeks 0: ${readOnlyShapes[0]}")
    println("first(): ${readOnlyShapes.first()}")
    println("last(): ${readOnlyShapes.last()}")
    println("count(): ${readOnlyShapes.count()}")
    println("circle ada? ${"circle" in readOnlyShapes}")

    // Tambah dan hapus item
    shapes.add("pentagon")
    println(shapes)
    shapes.remove("pentagon")
    println(shapes)
    println(shapesLocked)
}