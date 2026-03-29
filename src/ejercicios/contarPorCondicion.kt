package ejercicios

/*
Crea una función llamada contarPorCondicion que reciba dos parámetros:
1. Una lista de números enteros llamada numeros
2. Una lambda llamada cumpleCondicion que reciba un Int y devuelva un Boolean

La función debe contar cuántos elementos de la lista cumplen con la condición y devolver ese número.

Después, en la función main, debes:
1. Contar cuántos números son mayores a 10
2. Contar cuántos números son pares
3. Contar cuántos números están entre 5 y 15 (inclusive)
4. Contar cuántos números son negativos
5. Imprimir cada resultado con un mensaje descriptivo
*/

// Datos para usar:

val numeros2 = listOf(3, 12, -5, 8, 15, 22, 7, -2, 11, 6, 18, 4, -8, 13)

fun contarPorCondicion(numeros: List<Int>, cumpleCondicion: (Int) -> Boolean): Int =
    numeros.filter { cumpleCondicion(it) }.count()

fun main() {
    println("Números mayores que 10: ${contarPorCondicion(numeros2) { it > 10 }}")
    println("Números pares: ${contarPorCondicion(numeros2) { it % 2 == 0 }}")
    println("Números están entre 5 y 15 (inclusive): ${contarPorCondicion(numeros2) { it in 5..15 }}")
    println("Números negatibos: ${contarPorCondicion(numeros2) { it < 0 }}")
}