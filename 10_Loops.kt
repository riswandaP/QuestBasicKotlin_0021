fun main() {
    // For: mengulang angka 1 sampai 5
    for (number in 1..5) {
        print(number)
    }
    println()

    // While: jalan selama kondisi benar
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // Do-while: jalankan dulu, baru cek kondisi
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < 3)
}