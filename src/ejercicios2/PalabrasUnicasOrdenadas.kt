package ejercicios2

/*
Ejercicio 6 - Palabras únicas ordenadas

Crea una función llamada palabrasUnicas que reciba un String
con varias palabras separadas por espacios y retorne una lista
de las palabras únicas (sin repetir), ordenadas alfabéticamente
y en minúsculas.

- Entrada: String
- Salida: List<String>
*/

fun palabrasUnicas(texto: String) = texto
    .lowercase()
    .split(" ")
    .toSet()
    .sorted()


fun main() {
    println(palabrasUnicas("Hola mundo hola Kotlin mundo"))  // [hola, kotlin, mundo]
    println(palabrasUnicas("uno dos tres uno dos"))           // [dos, tres, uno]
    println(palabrasUnicas("Java"))                           // [java]
    println(palabrasUnicas("a b c a b c"))                    // [a, b, c]
}