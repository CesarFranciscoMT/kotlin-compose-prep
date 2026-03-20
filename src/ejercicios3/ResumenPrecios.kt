package ejercicios3

/*
Ejercicio 4 - Resumen de precios
Escribe una función que reciba una lista de precios (Double)
y devuelva el total, promedio y máximo en un Triple.
- Recibe: List<Double>
- Devuelve: Triple<Double, Double, Double> (total, promedio, máximo)
- Deja que Kotlin infiera los tipos internos
*/

fun calcularResumen(lista: List<Double>): Triple<Double, Double, Double> {
    val total = lista.sum()
    val promedio = lista.average()
    val maximo = lista.max()
    return Triple(total, promedio, maximo)
}

fun main() {
    val precios = listOf(100.0, 250.0, 75.0, 400.0)
    val (total, promedio, maximo) = calcularResumen(precios)
    println("Total: $total")      // 825.0
    println("Promedio: $promedio") // 206.25
    println("Máximo: $maximo")    // 400.0
}