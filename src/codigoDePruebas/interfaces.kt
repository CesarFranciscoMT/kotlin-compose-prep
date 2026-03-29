package codigoDePruebas

interface Identificable {
    val id: Int
    val tipo: String
        get() = "Genérico"
}

class Usuario2(override val id: Int, val nombre: String): Identificable {
    override val tipo: String = "Usuario"
}

class Producto2(override val id: Int, val precio: Double): Identificable

fun imprimir(texto: String) {
    println(texto)
}

fun main(){
    val usuario = Usuario2(1, "Frank")
    val producto = Producto2(101, 200.99)

    println("${usuario.tipo}: ${usuario.id}")
    println("${producto.tipo}: ${producto.id}")
    imprimir("Hola mundo")
}
