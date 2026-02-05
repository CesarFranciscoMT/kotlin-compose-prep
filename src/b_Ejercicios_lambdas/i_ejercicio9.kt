package b_Ejercicios_lambdas

/**
 * EJERCICIO 9: Lambda vs Función Anónima
 *
 * Implementa la misma funcionalidad de DOS formas:
 * 1. Con lambda
 * 2. Con función anónima (fun sin nombre)
 *
 * Ambas deben filtrar números mayores a un umbral.
 */

fun filtrarConLambda(numeros: List<Int>, umbral: Int): List<Int> {
    // Usa filter con lambda
    return numeros.filter { it > umbral}
}

fun filtrarConFuncionAnonima(numeros: List<Int>, umbral: Int): List<Int> {
    // Usa filter con función anónima: fun(x: Int): Boolean { ... }
    return numeros.filter(
        fun(x:Int): Boolean {
            return x > umbral
        }
    )

}

    fun main() {
    val numeros = listOf(1, 5, 10, 15, 20, 25)

    println(filtrarConLambda(numeros, 10))
    // [15, 20, 25]

    println(filtrarConFuncionAnonima(numeros, 10))
    // [15, 20, 25]
}

