package ejercicios

data class ProductoInventario(
    val id: Int,
    val nombre: String,
    val precio: Double,
    val stock: Int,
){

    val esDisponible: Boolean
        get() = stock > 0

    fun calcularPrecioDescuento(producto: ProductoInventario, porcentaje: Double): Double{
        return producto.precio * (1 - porcentaje)
    }

    companion object {
        const val STOCK_MINIMO = 0
        const val PRECIO_MINIMO: Double = 0.01
    }

}

class GestorInventario {

}