package a_Ejercicios_fundamentos_basicos

/**
 * Crea una función que calcule el precio final con descuento e IVA
 * Parámetros:
 * - precioBase: Double
 * - porcentajeDescuento: Double? (puede ser null = sin descuento)
 * - aplicarIVA: Boolean (default true)
 *
 * IVA = 16%
 * Retorna el precio final formateado con 2 decimales
 */

fun calcularPrecioFinal(
    precioBase: Double,
    porcentajeDescuento: Double?,
    aplicarIVA: Boolean = true
): String {
    var resultado = ""
    val porcentajeIva = 16.0
    if (porcentajeDescuento == null && !aplicarIVA) resultado = String.format("%.2f", precioBase)
    if (porcentajeDescuento == null && aplicarIVA) resultado = String.format("%.2f", (precioBase + (precioBase * porcentajeIva)/100))
    if (porcentajeDescuento != null && aplicarIVA)  {
        val descuento = ((precioBase * porcentajeDescuento)/100)
        val precioDesIva = (((precioBase * porcentajeIva)/100) + precioBase) - descuento
        resultado = String.format("%.2f", precioDesIva)
    }
    if (porcentajeDescuento != null && !aplicarIVA)  {
        val descuento = ((precioBase * porcentajeDescuento)/100)
        resultado = String.format("%.2f", precioBase - descuento)
    }

    return resultado
}
fun main() {
    println(calcularPrecioFinal(100.0, 10.0, true))    // "104.40"
    println(calcularPrecioFinal(100.0, null, true))    // "116.00"
    println(calcularPrecioFinal(100.0, 20.0, false))   // "80.00"
    println(calcularPrecioFinal(100.0, null, false))   // "100.00"
}

//ff -
//ft -
//tt -
//tf
