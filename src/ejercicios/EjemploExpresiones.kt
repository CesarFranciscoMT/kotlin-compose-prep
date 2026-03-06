package ejercicios

data class ProductoElectronico(val nombre: String,val precio: Double, val stock: Int)

fun calcularPrecio(producto: ProductoElectronico, cantidad: Int): String {

    val estado = when {
        producto.stock == 0 -> "Agotado"
        cantidad > producto.stock -> "No hay suficiente en existencia"
        else -> "Disponible"
    }


    val precioFinal = if (estado == "Disponible") cantidad * producto.precio else 0.0
    val precioDescuentoFinal = if (cantidad >= 10) precioFinal - (precioFinal * .10) else  precioFinal



    return """
        Producto: ${producto.nombre}
        Unidades: $cantidad
        Estado: $estado
        Precio Final: $precioDescuentoFinal
    """.trimIndent()

}

fun main(){

    val producto1 = ProductoElectronico("Audífonos", 100.0 , 10)
    val producto2 = ProductoElectronico("Mause", 2500.0 , 8)
    val producto3 = ProductoElectronico("Celular", 9000.0 , 0)
    val producto4 = ProductoElectronico("Cargador", 500.0 , 30)


    println(calcularPrecio(producto1, 10))
    println()
    println(calcularPrecio(producto2, 9))
    println()
    println(calcularPrecio(producto3, 3))
    println()
    println(calcularPrecio(producto4, 4))



}
