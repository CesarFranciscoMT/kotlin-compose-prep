package ejercicios

fun evaluar(nota: Int): String {
    return when { // When como expresión
        nota == 100 -> "Perfecto"
        nota >= 90 -> "Muy bien"
        nota >= 70 -> "Bien"
        nota >= 50 -> "Puedes mejorar"
        else -> "Reprobado"
    }
}

fun main () {

    println(evaluar(67))

    val a = 10
    val b = 20

    var max: Int

    // Sentencia
    if (a > b) {
        max = a
    } else {
        max = b
    }

    println("Sentencia, numero mayor: $max")

    val maximo = if (a > b) a else b // if como expresión
    println("Expresión, numero mayor: $maximo")

    val puntuacion = 89
    val calificacion = when (puntuacion) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }

    println("La calificación según la puntuación (${puntuacion}) es: ${calificacion}")


}

