package ejercicios

/*
Crea una data class llamada Producto con las siguientes propiedades:
1. nombre (String)
2. precio (Double)
3. enStock (Boolean)

Después, en la función main:
1. Crea una lista con 5 productos diferentes (algunos en stock, otros no)
2. Filtra solo los productos que están en stock
3. Transforma la lista para obtener solo los nombres de esos productos
4. Imprime la lista de nombres resultante
5. Calcula el precio total de todos los productos en stock
6. Imprime el total
*/

// Datos para usar:

data class Producto(val nombre: String, val precio: Double, val enStock: Boolean) {

}

fun main() {

    val listaProductos = listOf<Producto>(
        Producto("Laptop", 27000.0, true),
        Producto("Mause", 700.0, true),
        Producto("Teclado", 2700.0, false),
        Producto("Pantalla", 5500.0, false),
        Producto("Tablet", 12000.0, false)
    )

    val listaNombresProductos = listaProductos.filter { it.enStock }.map { it.nombre }
    println("Lista de nombres: $listaNombresProductos")

    val precioProductosStock = listaProductos.filter { it.enStock }. map { it.precio }.sum()
    println("Total precio productos en stock: $precioProductosStock")

}
