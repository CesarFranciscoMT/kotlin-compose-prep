package b_Ejercicios_lambdas

/**
 * EJERCICIO 7: Closures - Capturando Variables Externas
 *
 * Crea una función que retorne otra función (lambda).
 * La lambda retornada debe "recordar" un contador que se incrementa
 * cada vez que se llama.
 *
 * Esto demuestra que las lambdas pueden capturar variables del scope externo.
 */

fun crearContador(): () -> Int {
    // Tu código aquí
    // Crea una variable contador
    // Retorna una lambda que incremente y retorne el contador

    var contador = 0
    return {
        contador += 1
        contador
    }
}

fun main() {
    val contador1 = crearContador()

    println(contador1())  // 1
    println(contador1())  // 2
    println(contador1())  // 3

    val contador2 = crearContador()

    println(contador2())  // 1
    println(contador2())  // 2
}