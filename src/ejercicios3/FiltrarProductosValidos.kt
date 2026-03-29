package ejercicios3

/*
Ejercicio 4 - Filtrar productos válidos
Escribe una función que reciba una lista de pares (nombre, precio)
y devuelva solo los nombres de productos cuyo precio sea mayor a 0.
- Recibe: List<Pair<String, Double>>
- Devuelve: List<String>
- Usa nombres de variables y funciones siguiendo las convenciones del apunte
*/

fun filtrarProductos(productos: List<Pair<String, Double>>): List<String> {
    return productos.filter { it.second > 0 }.map { it.first }
}


fun main() {
    val productos = listOf(
        Pair("Laptop", 15000.0),
        Pair("Mouse", -100.0),
        Pair("Teclado", 800.0),
        Pair("Monitor", 0.0)
    )
    // Resultado esperado: [Laptop, Teclado]
    val productosPrecioPositivo = filtrarProductos(productos)
    println(productosPrecioPositivo)
}