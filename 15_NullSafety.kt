// Fungsi yang tidak menerima null
fun strLength(notNull: String): Int {
    return notNull.length
}

// Check for null values
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// Safe call: hasilnya null kalau string-nya null
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    // Nullable types
    var neverNull: String = "This can't be null"
    // neverNull = null          // error kompilasi, jadi dijadikan komentar

    var nullable: String? = "You can keep a null here"
    nullable = null              // boleh, karena tipenya String?

    println(strLength(neverNull))
    // println(strLength(nullable))   // error kompilasi, jadi dijadikan komentar

    // Check for null values
    var nullString: String? = null
    println(describeString(nullString))

    // Safe call
    println(lengthString(nullString))

    // Elvis operator: nilai default kalau null
    println(nullString?.length ?: 0)
}