package codigoDePruebas

fun main(){
    val resultado = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .also{println("Lista original: $it")}
        .filter {it % 2 == 0}
        .also {println("Filtrar pares: $it")}
        .map { it * 2 }
        .also { println("Después de mapear: $it")}
        .sum()

    println("Resultado final: $resultado")

}