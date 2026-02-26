package codigoDePruebas

fun main() {

    val lista = listOf<Int>(1, 2, 3, 4, 5)

    val pares = lista.filter { it % 2 == 0 }
    println("Numeros pares: ${pares}")

    // Transformaciones map

    val doble = lista.map { it * 2 }

    println("Numeros por dos: ${doble}")


}

