package b_Ejercicios_lambdas

fun main() {
    val texto = "uno,dos,tres,cuatro,cinco"

    // Sin límite (divide todo)
    val todasPartes = texto.split(",")
    println(todasPartes)  // [uno, dos, tres, cuatro, cinco]
    println(todasPartes.lastIndex)

    // Con límite de 3 partes
    val limitadas = texto.split(",", limit = 3)
    println(limitadas)  // [uno, dos, tres,cuatro,cinco]
    //                                  ↑
    //                    el resto queda junto
    println(limitadas.lastIndex) //2
    println(limitadas[0]) //uno
    println(limitadas[1]) //dos
    println(limitadas[2]) //tres,cuatro,cinco
}