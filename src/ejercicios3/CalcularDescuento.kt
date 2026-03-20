package ejercicios3

/*
Ejercicio 4 - Calcular descuento
Escribe una función que reciba precio y porcentaje de descuento,
y devuelva el precio final.
- Recibe: Double, Double
- Devuelve: Double
- Usa val donde sea posible
- El porcentaje viene como valor entre 0 y 1 (ej: 0.10 = 10%)
*/

fun calcularPrecioFinal(precio: Double, descuento: Double) = precio - (precio * descuento)

fun main() {
    // Resultado esperado: 900.0
    println(calcularPrecioFinal(1000.0, 0.10))
}