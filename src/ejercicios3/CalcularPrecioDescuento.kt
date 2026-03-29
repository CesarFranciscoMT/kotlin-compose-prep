package ejercicios3

/*
Ejercicio 5 - Calcular precio con impuesto
Usando constantes, escribe una función que calcule
el precio final de un producto aplicando IVA y un
descuento fijo para mayoreo.
- IVA: 16%
- Descuento mayoreo: 10% (si cantidad >= 10)
- Recibe: precio Double, cantidad Int
- Devuelve: Double
*/

const val IVA = 0.16
const val DESCUENTO_MAYOREO = 0.10

fun main() {
    println(calcularPrecioFinal2(100.0, 5))   // 116.0
    println(calcularPrecioFinal2(100.0, 10))  // 104.4
}

fun calcularPrecioFinal2(precio: Double, cantidad: Int ): Double {
    val precioIva = precio + (precio * IVA)
    return if (cantidad >= 10) precioIva - (precioIva * DESCUENTO_MAYOREO) else precioIva
}