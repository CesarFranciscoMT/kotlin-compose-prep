package ejercicios3

fun main() {
    var contador = 0  // Variable local a main

    val numeros = listOf(1, 2, 3, 4, 5)

    // Lambda accede a 'contador' del scope exterior
    numeros.forEach {
        contador += it  // ✅ Modifica variable del scope exterior
        println("Número: $it, Contador: $contador")
    }

    println("Contador final: $contador")  // 15
}