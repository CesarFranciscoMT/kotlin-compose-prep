package ejercicios3

/*
Ejercicio 4 - Categoría de temperatura
Escribe una función que reciba una temperatura (Double)
y devuelva su categoría como String usando inicialización diferida.
- Menor a 0: "Congelante"
- 0 a 15: "Frío"
- 16 a 30: "Templado"
- Mayor a 30: "Caliente"
- Declara la variable sin inicializar y asígnala con if/else o when
*/

fun main() {
    println(categorizarTemperatura(-5.0))  // Congelante
    println(categorizarTemperatura(10.0))  // Frío
    println(categorizarTemperatura(22.0))  // Templado
    println(categorizarTemperatura(35.0))  // Caliente
}

fun categorizarTemperatura(temperatura: Double): String {
    val categoria =  when {
        temperatura < 0 -> "Congelante"
        temperatura <= 15 -> "Frio"
        temperatura <= 30 -> "Templado"
        else -> "Caliente"
    }
    return categoria
}