package a_Ejercicios_fundamentos_basicos


/**
 * EJERCICIO 4: Refactorización con Operador Elvis y Expresiones
 *
 * Refactoriza la función calcularPrecioFinal para hacerla más idiomática:
 *
 * REQUISITOS:
 * - Usa operador Elvis (?:) para manejar el porcentajeDescuento null
 * - Elimina todas las variables var (usa val o directamente expresiones)
 * - Reduce a máximo 5 líneas de código
 * - Mantén la misma funcionalidad
 *
 * TIPS:
 * - El descuento puede calcularse como: porcentajeDescuento ?: 0.0
 * - El IVA puede ser condicional: if (aplicarIVA) 1.16 else 1.0
 * - String.format puede ir directo en el return
 */

fun calcularPrecioFinalRefactor(
    precioBase: Double,
    porcentajeDescuento: Double?,
    aplicarIVA: Boolean = true
): String {
    val iva = 16.0
    val precioConIva = if (aplicarIVA) precioBase + ((precioBase * iva) / 100) else precioBase
    return String.format("%.2f", precioConIva - (precioConIva * (porcentajeDescuento ?: 0.0)/100))
}

fun main() {
    // Mismos casos de prueba
    println(calcularPrecioFinalRefactor(100.0, 10.0, true))    // "104.40"
    println(calcularPrecioFinalRefactor(100.0, null, true))    // "116.00"
    println(calcularPrecioFinalRefactor(100.0, 20.0, false))   // "80.00"
    println(calcularPrecioFinalRefactor(100.0, null, false))   // "100.00"
}