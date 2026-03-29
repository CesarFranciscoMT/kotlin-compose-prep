package codigoDePruebas
private data class Producto(var nombre: String = "", var precio: Double = 0.0)

fun main() {
    val producto = Producto()

    // apply: retorna el OBJETO
    val conApply = producto.apply {
        nombre = "Laptop"
        precio = 15000.0
    }
    println(conApply)  // Producto(nombre=Laptop, precio=15000.0)

    // run: retorna el RESULTADO del bloque
    val conRun = producto.run {
        nombre = "Mouse"
        precio = 500.0
        "Producto actualizado: $nombre"
    }
    println(conRun)  // Producto actualizado: Mouse
}