package b_Ejercicios_lambdas

/**
 * EJERCICIO 6: Inferencia de Tipos en Lambdas
 *
 * Crea una función que reciba una lista de números
 * y retorne un Map<String, List<Int>> agrupando por categoría.
 *
 * Usa groupBy { } - Kotlin inferirá los tipos automáticamente
 */

fun categorizarNumeros(numeros: List<Int>): Map<String, List<Int>> {
    val mapa = mapOf(
        "Impar" to numeros.filter { it % 2 != 0 },
        "Par" to numeros.filter { it % 2 == 0 }
    )
    return mapa
}


fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(categorizarNumeros(numeros))
    // {Impar=[1, 3, 5, 7, 9], Par=[2, 4, 6, 8, 10]}
}