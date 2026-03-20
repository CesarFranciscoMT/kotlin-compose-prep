package ejercicios3

/*
Ejercicio 4 - Analizar contraseña
Escribe una función que reciba un String y devuelva
cuántos dígitos y cuántas letras tiene.
- Recibe: String
- Devuelve: Pair<Int, Int> (letras, dígitos)
- Itera sobre cada Char del String
*/

fun analizarPassword(contrasenia: String): Pair<Int, Int> {
    var letras = 0
    var digitos = 0
    for (c in contrasenia) {
        if (c.isLetter()) letras += 1
        if (c.isDigit()) digitos += 1
    }
    return Pair(letras, digitos)
}

fun main() {
    val (letras, digitos) = analizarPassword("Kotlin123")
    println("Letras: $letras")   // Letras: 6
    println("Dígitos: $digitos") // Dígitos: 3
}