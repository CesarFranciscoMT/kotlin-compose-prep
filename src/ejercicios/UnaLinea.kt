package ejercicios

import codigoDePruebas.procesar


fun main() {
    val nombre = "Frank".also { println("Hola, $it") }
    println("- $nombre")

    val numero = 10.also { if (it % 2 == 0) println("Es par") else println("Es impar") }
    val edad = 17.also { if(it >= 18) println("Mayor de edad") else println("Menor de edad") }
    val nombre1 = "Frank".also { if (it.length > 3) println(it.length) else println("Nombre muy corto")}
    println("- $nombre1")
    val numero1 = 5.also { if (it % 2 == 0) println("Es par") else println(it * 2)}
    println("- $numero1")
    val numero3 = 8.run { val resultado =  if (this % 2 == 0) "Par" else "Impar" }

    println( listOf(1, 2, 3, 4, 5).filter { it > 2 }.sum())
}

