package c_Ejercicios_clases_objetos

private class Producto(val nombre: String, val precio: Double) {

    // Constructor secundario público
    constructor(nombre: String) : this(nombre, 0.0) {
        println("Producto sin precio")
    }

    // Constructor secundario privado
    private constructor() : this("Sin nombre", 0.0) {
        println("Constructor interno")
    }

    // Método que usa el constructor privado
    fun copiarSinDatos(): Producto {
        return Producto()  // ✅ Acceso desde dentro de la clase
    }
}

fun main() {
    val p1 = Producto("Laptop", 15000.0)  // ✅ Constructor primario público
    val p2 = Producto("Mouse")             // ✅ Constructor secundario público
    // val p3 = Producto()                 // ❌ Constructor privado
}

/*

 */