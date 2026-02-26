package codigoDePruebas

fun main() {
    var nombre: String = "Ana"
    // nombre = null "puede dar error"
    println("Nombre: ${nombre}")

    var apellido: String? = null
    println("Apellido: ${apellido}")

    var longitud: Int? = apellido?.length ?: 0
    println("Longitud: ${longitud}")

}