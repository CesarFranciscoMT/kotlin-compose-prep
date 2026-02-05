package c_Ejercicios_clases_objetos

class Rectangulo(val ancho: Double, val alto: Double) {
    val area: Double = ancho * alto
    val perimetro: Double = 2 * (ancho + alto)

    init {
        require(ancho > 0) { "Ancho debe ser positivo" }
        require(alto > 0) { "Alto debe ser positivo" }
    }
}

fun main() {
    val rect = Rectangulo(-5.0, 3.0)
    println("Área: ${rect.area}")        // 15.0
    println("Perímetro: ${rect.perimetro}")  // 16.0
}