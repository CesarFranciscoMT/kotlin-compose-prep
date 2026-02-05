package ejercicios


/*
Crea una función llamada procesarLista que reciba dos parámetros:
1. Una lista de números enteros llamada numeros
2. Una lambda llamada condicion que reciba un Int y devuelva un Boolean

La función debe:
1. Filtrar la lista usando la condicion
2. Multiplicar cada número filtrado por 2
3. Devolver la nueva lista transformada

Después, en la función main, debes:
1. Llamar a procesarLista con la lista dada y una lambda que filtre solo números mayores a 5
2. Llamar a procesarLista con la lista dada y una lambda que filtre solo números pares
3. Llamar a procesarLista con la lista dada y una lambda que filtre solo números menores o iguales a 10
4. Imprimir cada resultado
*/

// Datos para usar:

val numeros = listOf(3, 7, 2, 9, 15, 4, 12, 6, 1, 8)

fun procesarLista(numeros: List<Int>, condicion: (Int) -> Boolean): List<Int> {
    return numeros.filter { condicion(it) }.map { it * 2 }
}

fun main() {
    val nuevaListaImprimir = procesarLista(numeros) {it > 5}
    val nuevaListaImprimir2 = procesarLista(numeros) {it % 2 == 0}
    val nuevaListaImprimir3 = procesarLista(numeros) {it <= 10 }


    println(nuevaListaImprimir)
    println(nuevaListaImprimir2)
    println(nuevaListaImprimir3)

}