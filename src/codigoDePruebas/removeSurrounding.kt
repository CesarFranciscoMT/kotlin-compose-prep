package codigoDePruebas

fun main() {
    val texto = "\"Hola Mundo\""
    println(texto)
    // Remover comillas dobles
    val sinComillas = texto.removeSurrounding("\"")
    println(sinComillas)  // Hola Mundo

    // Si no están ambos delimitadores, no hace nada
    val parcial = "\"Solo inicio"
    println(parcial)
    println(parcial.removeSurrounding("\""))  // "Solo inicio
}