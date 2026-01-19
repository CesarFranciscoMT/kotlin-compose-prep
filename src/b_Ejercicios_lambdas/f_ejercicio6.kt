package b_Ejercicios_lambdas

/**
 * EJERCICIO 6: Inferencia de Tipos en Lambdas
 *
 * Crea una función genérica que agrupe elementos de una lista
 * según una clave que extrae una lambda.
 *
 * La lambda recibe un elemento T y retorna una clave K.
 * Retorna un Map<K, List<T>>
 *
 * Nota: Kotlin inferirá los tipos T y K automáticamente
 */

fun <T, K> agruparPor(lista: List<T>, obtenerClave: (T) -> K): Map<K, List<T>> {
    // Tu código aquí
    println()
    println()
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Agrupar por par/impar
    println(agruparPor(numeros) { it % 2 })
    // {1=[1, 3, 5, 7, 9], 0=[2, 4, 6, 8]}

    val palabras = listOf("casa", "perro", "gato", "mesa", "sol")

    // Agrupar por longitud
    println(agruparPor(palabras) { it.length })
    // {4=[casa, gato, mesa], 5=[perro], 3=[sol]}

    // Agrupar por primera letra
    println(agruparPor(palabras) { it.first() })
    // {c=[casa], p=[perro], g=[gato], m=[mesa], s=[sol]}
}