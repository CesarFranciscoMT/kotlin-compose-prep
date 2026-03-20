package ejercicios3

/*
Ejercicio 4 - Procesar lista
Escribe una función que reciba una lista de números
e imprima cada uno con su índice.
- Recibe: List<Int>
- Debe retornar Unit (implícitamente)
- Usa forEachIndexed
*/

fun procesarLista(lista: List<Int>) = lista.forEachIndexed { index, num -> println("$index: $num") }

fun main() {
    procesarLista(listOf(10, 20, 30))
    // 0: 10
    // 1: 20
    // 2: 30
}