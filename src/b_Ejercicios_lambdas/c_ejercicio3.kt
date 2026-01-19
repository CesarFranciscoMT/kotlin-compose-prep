package b_Ejercicios_lambdas

/**
 * EJERCICIO 3: Lambda con Dos Parámetros
 *
 * Crea una función que reciba dos listas de números
 * y una lambda que combine dos números en uno.
 * Retorna una lista con las combinaciones (hasta el tamaño de la lista más pequeña).
 *
 * Ejemplo: [1,2,3] y [10,20,30] con lambda { a, b -> a + b } → [11, 22, 33]
 */

fun combinarListas(lista1: List<Int>, lista2: List<Int>, combinar: (Int, Int) -> Int): List<Int> {
    return lista1.zip(lista2, combinar)
}

fun main() {
    val numeros1 = listOf(1, 2, 3, 4)
    val numeros2 = listOf(10, 20, 30, 40)

    // Sumar elementos
    println(combinarListas(numeros1, numeros2) { a, b -> a + b })
    // [11, 22, 33, 44]

    // Multiplicar elementos
    println(combinarListas(numeros1, numeros2) { a, b -> a * b })
    // [10, 40, 90, 160]

    // Tomar el mayor
    println(combinarListas(numeros1, numeros2) { a, b -> if (a > b) a else b })
    // [10, 20, 30, 40]
}