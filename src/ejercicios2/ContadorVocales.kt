package ejercicios2

import ejercicios.numero3

/*
Ejercicio 1 - Contador de vocales

Crea una función llamada contarVocales que reciba un String
y retorne cuántas vocales contiene (a, e, i, o, u).
La función debe contar tanto mayúsculas como minúsculas.

- Entrada: String
- Salida: Int (cantidad de vocales)
*/

fun contarVocales(texto: String) = texto.lowercase().count { it in "aeiou" }


fun main() {
    println(contarVocales("Hola Mundo"))       // 4
    println(contarVocales("KOTLIN"))           // 2
    println(contarVocales("xyz"))              // 0
    println(contarVocales("AeIoU"))            // 5
    println(contarVocales(""))                 // 0
}