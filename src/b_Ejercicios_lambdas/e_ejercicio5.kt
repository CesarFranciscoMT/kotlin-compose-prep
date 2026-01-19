package b_Ejercicios_lambdas

/**
 * EJERCICIO 5: "it" vs Parámetros Nombrados
 *
 * Crea una función que procese una lista de precios aplicando:
 * 1. Descuento (lambda con 1 parámetro - usa "it")
 * 2. Impuesto (lambda con 1 parámetro - usa parámetro nombrado "precio")
 * 3. Redondeo (lambda que redondea a 2 decimales)
 *
 * Retorna la lista de precios finales.
 *
 * Tip: Usa map para cada transformación en cadena
 */

fun procesarPrecios(
    precios: List<Double>,
    descuento: (Double) -> Double,
    impuesto: (Double) -> Double,
    redondear: (Double) -> Double
): List<Double> {
    return precios.map {
        redondear(impuesto(descuento(it)))
    }
}

fun main() {
    val precios = listOf(100.0, 250.0, 75.5, 300.0)

    val resultado = procesarPrecios(
        precios,
        descuento = { it * 0.9 },              // 10% descuento (con "it")
        impuesto = { precio -> precio * 1.16 }, // 16% impuesto (nombrado)
        redondear = { it * 100 / 100 }         // redondeo simple
    )

    println(resultado)
    // [104.4, 261.0, 78.732, 313.2]
}