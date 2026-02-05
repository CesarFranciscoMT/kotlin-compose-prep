package codigoDePruebas

data class Rectangulo2(val ancho: Double, val alto: Double)

fun main() {
    val rectangulo = Rectangulo2(5.0, 10.0)

    // Forma normal
    val area1 = rectangulo.ancho * rectangulo.alto
    val perimetro1 = 2 * (rectangulo.ancho + rectangulo.alto)

    // ✅ Con with
    val estadisticas = with(rectangulo) {
        mapOf(
            "area" to ancho * alto,
            "perimetro" to 2 * (ancho + alto),
            "diagonal" to kotlin.math.sqrt(ancho * ancho + alto * alto)
        )
    }

    println(estadisticas)
    // {area=50.0, perimetro=30.0, diagonal=11.180339887498949}
}