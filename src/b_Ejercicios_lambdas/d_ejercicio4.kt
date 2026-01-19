package b_Ejercicios_lambdas

/**
 * EJERCICIO 4: El Parámetro Implícito "it"
 *
 * Crea una función que reciba una lista de productos (strings)
 * y un prefijo, y retorne solo los productos que empiezan con ese prefijo.
 *
 * Usa filter con "it" (sin nombrar el parámetro explícitamente)
 */

fun filtrarPorPrefijo(productos: List<String>, prefijo: String): List<String> {
    return productos.filter { it.startsWith(prefijo) }
}

fun main() {
    val productos = listOf("Laptop", "Mouse", "Teclado", "Monitor", "Tablet", "Mousepad")

    println(filtrarPorPrefijo(productos, "M"))
    // [Mouse, Monitor, Mousepad]

    println(filtrarPorPrefijo(productos, "T"))
    // [Teclado, Tablet]

    println(filtrarPorPrefijo(productos, "L"))
    // [Laptop]
}