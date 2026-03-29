package ejercicios

/*
Crea una función llamada crearMultiplicador que reciba un parámetro:
1. Un número entero llamado factor

La función debe devolver una lambda que reciba un Int y devuelva un Int.
La lambda devuelta debe multiplicar el número recibido por el factor.

En main, debes:
1. Crear un multiplicador por 2 usando crearMultiplicador
2. Crear un multiplicador por 5 usando crearMultiplicador
3. Crear un multiplicador por 10 usando crearMultiplicador
4. Usar cada multiplicador con los números 3, 7 y 12
5. Imprimir cada resultado
*/

// Datos para usar:

val numeros7 = listOf(3, 7, 12)

fun crearMultiplicador(factor: Int): (Int) -> Int = { numero -> numero * factor }

fun main() {
    println("Por dos: ")
    val multiplicarPorDos = crearMultiplicador(2)
    numeros7.forEach { println(multiplicarPorDos(it)) }

    println("Por cinco: ")
    val multiplicarPorCinco = crearMultiplicador(5)
    numeros7.forEach { println(multiplicarPorCinco(it)) }

    println("Por diez: ")
    val multiplicarPorDiez = crearMultiplicador(10)
    numeros7.forEach { println(multiplicarPorDiez(it)) }
}
