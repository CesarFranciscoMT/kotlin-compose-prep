package ejercicios

/*
Ejercicio 9 - Encontrar el numero mayor en una lista

Escribe una funcion llamada encontrarMayor que reciba una lista de numeros
enteros (List<Int>) y devuelva el numero mas grande de la lista.

No puedes usar las funciones max(), maxOrNull() ni sorted()/sortedDescending() de Kotlin.
Debes implementar la logica manualmente.

La lista siempre tendra al menos un elemento.

Entrada: una lista de numeros enteros con al menos un elemento.
Salida: el numero entero mas grande de la lista.
*/

// Datos para usar:

fun encontrarMayor(lista: List<Int>): Int{
    var numeroMayor = lista[0]
    for (numero in lista) {
        if (numeroMayor < numero) numeroMayor = numero
    }
    return numeroMayor
}

fun main() {
    println(encontrarMayor(listOf(3, 7, 2, 9, 4)))        // Esperado: 9
    println(encontrarMayor(listOf(-5, -1, -8, -3)))        // Esperado: -1
    println(encontrarMayor(listOf(42)))                     // Esperado: 42
    println(encontrarMayor(listOf(10, 10, 10)))             // Esperado: 10
    println(encontrarMayor(listOf(1, 2, 3, 4, 5, 0, -1)))  // Esperado: 5
}