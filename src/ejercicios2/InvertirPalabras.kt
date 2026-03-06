package ejercicios2

/*
Ejercicio 2 - Invertir palabras

Crea una función llamada invertirPalabras que reciba un String
con varias palabras separadas por espacios y retorne un nuevo String
con las palabras en orden inverso.

Nota: No se trata de invertir las letras de cada palabra,
sino de invertir el orden de las palabras.

- Entrada: String
- Salida: String
*/

fun invertirPalabras(texto: String) = texto.split(" ").reversed().joinToString(" ")


fun main() {
    println(invertirPalabras("Hola Mundo Kotlin"))  // Kotlin Mundo Hola
    println(invertirPalabras("uno dos tres"))        // tres dos uno
    println(invertirPalabras("solo"))                // solo
    println(invertirPalabras(""))                    //
}