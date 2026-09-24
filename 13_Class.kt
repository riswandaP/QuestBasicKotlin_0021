// Deklarasi kelas paling sederhana
class CustomerProperties

// Kelas dengan properti di dalam tanda kurung, dan fungsi anggota di badan kelas
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    // Membuat instance (objek) dari kelas
    val contact = Contact(1, "mary@gmail.com")

    // Mengakses properti
    println(contact.email)

    // Mengubah nilai properti
    contact.email = "jane@gmail.com"
    println(contact.email)

    // Memanggil member function
    contact.printId()
}