package ejercicios3

import ejercicios2.parentesisBalanceados

/*
Ejercicio 4 - Contador de palabras largas
Escribe una función que reciba una lista de palabras y devuelva
cuántas tienen más de 5 caracteres.
- Recibe: List<String>
- Devuelve: Int
- El apunte muestra una alternativa más idiomática a usar var con for,
  ¿puedes evitar usar var?
*/

fun contarPalabrasLargas(palabras: List<String>) = palabras.count { it.length > 5 }


fun main() {
    val palabras = listOf("hola", "kotlin", "programación", "ok", "lenguaje")
    // Resultado esperado: 3
    println(contarPalabrasLargas(palabras))
}