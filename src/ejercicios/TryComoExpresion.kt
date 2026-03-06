package ejercicios

fun leerNumero(numero: String): Int {
    return try {
        numero.toInt()
    } catch (e: NumberFormatException) {
        -1
    }
}

fun main (){
    val numero = try {
        "123".toInt()
    } catch (e: NumberFormatException) {
        1
    }

    println("Numero: $numero")

    val numeroString = "123"
    val numeroInt = leerNumero(numeroString)
    println("El numero $numeroString más 5 es ${numeroInt + 5}")
}
