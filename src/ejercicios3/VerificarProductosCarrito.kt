package ejercicios3

/*
Ejercicio 4 - Verificar productos del carrito
Escribe una función que reciba una lista de productos (nombre, precio)
y devuelva el precio total SOLO de los productos con precio mayor a 0.
- Recibe: List<Pair<String, Double>>
- Devuelve: Double
- Usa val donde sea posible
- Usa nombres descriptivos
*/

fun sumaProductosValidos(productos: List<Pair<String, Double>>): Double {
    return productos.filter { it.second > 0 }.sumOf { it.second }
}

fun main() {
    val productos = listOf(
        Pair("Laptop", 15000.0),
        Pair("Mouse", -100.0),
        Pair("Teclado", 800.0),
        Pair("Monitor", 0.0)
    )
    println(sumaProductosValidos(productos))
    // Resultado esperado: 15800.0



}