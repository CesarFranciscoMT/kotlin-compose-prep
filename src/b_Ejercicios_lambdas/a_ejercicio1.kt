package b_Ejercicios_lambdas

/**
 * EJERCICIO 1: Primera Lambda
 *
 * Crea una función que reciba una lista de números
 * y una lambda que determine si un número es válido.
 * Retorna la lista filtrada con solo los números válidos.
 *
 * Tip: Usa filter { } para aplicar la lambda
 */

//fun filtrarNumeros(numeros: List<Int>, esValido: (Int) -> Boolean): List<Int> {
//    val lista = mutableListOf<Int>()
//    for (numero in numeros){
//        if (esValido(numero)){
//            lista.add(numero)
//        }
//    }
//    return lista
//}

fun filtrarNumeros(numeros: List<Int>, esValido: (Int) -> Boolean): List<Int>{
    return numeros.filter { esValido(it) }
}


fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filtrar solo pares
    println(filtrarNumeros(numeros) { it % 2 == 0 })  // [2, 4, 6, 8, 10]

    // Filtrar solo mayores a 5
    println(filtrarNumeros(numeros) { it > 5 })       // [6, 7, 8, 9, 10]

    // Filtrar múltiplos de 3
    println(filtrarNumeros(numeros) { it % 3 == 0 })  // [3, 6, 9]
}