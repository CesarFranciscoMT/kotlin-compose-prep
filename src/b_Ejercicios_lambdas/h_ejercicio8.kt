package b_Ejercicios_lambdas

/**
 * EJERCICIO 8: Closure con Acumulador
 *
 * Crea una función que retorne una lambda.
 * La lambda recibe un número y lo suma a un acumulador interno.
 * Retorna el total acumulado.
 */

fun crearAcumulador(): (Int) -> Int {
    var accumulator = 0
    return { num ->
        accumulator += num
        accumulator
    }
}

fun main() {
    val acum1 = crearAcumulador()

    println(acum1(5))   // 5
    println(acum1(10))  // 15
    println(acum1(3))   // 18

    val acum2 = crearAcumulador()
    println(acum2(100)) // 100
}