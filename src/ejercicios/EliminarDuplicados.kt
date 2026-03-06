package ejercicios

/*
Ejercicio 10 - Eliminar duplicados de una lista

Escribe una funcion llamada eliminarDuplicados que reciba una lista de numeros
enteros (List<Int>) y devuelva una nueva lista que contenga los mismos elementos
pero sin repeticiones, manteniendo el orden en que aparecieron por primera vez.

No puedes usar la funcion distinct() ni toSet() de Kotlin.
Debes implementar la logica manualmente.

Entrada: una lista de numeros enteros.
Salida: una nueva lista sin elementos repetidos, respetando el orden original.
*/

// Datos para usar:

fun main() {
    println(eliminarDuplicados(listOf(1, 2, 3, 2, 1, 4)))       // Esperado: [1, 2, 3, 4]
    println(eliminarDuplicados(listOf(5, 5, 5, 5)))              // Esperado: [5]
    println(eliminarDuplicados(listOf(1, 2, 3)))                 // Esperado: [1, 2, 3]
    println(eliminarDuplicados(listOf<Int>()))                   // Esperado: []
    println(eliminarDuplicados(listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)))  // Esperado: [3, 1, 4, 5, 9, 2, 6]
}

fun eliminarDuplicados(lista: List<Int>): List<Int> {
    var listaSinDuplicados = mutableListOf<Int>()
    for (numero in lista) {
        if (numero !in listaSinDuplicados) listaSinDuplicados.add(numero)
    }
    return listaSinDuplicados
}